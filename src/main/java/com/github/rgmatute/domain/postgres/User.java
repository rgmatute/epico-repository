package com.github.rgmatute.domain.postgres;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "is_activated")
	private boolean activated;
	
	@CreationTimestamp
	@Column(name = "created_at")
	private Date createdAt;
	
	@ManyToMany
	@JoinTable (
			name = "users_roles",
			joinColumns = @JoinColumn( name = "user_id" ),
			inverseJoinColumns = @JoinColumn(name = "role_id"),
			uniqueConstraints = {
					@UniqueConstraint(columnNames = {
							"user_id", "role_id"
					})
			}
	)
	private Set<Role> roles;

}
