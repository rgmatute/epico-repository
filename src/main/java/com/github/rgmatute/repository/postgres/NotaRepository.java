package com.github.rgmatute.repository.postgres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.rgmatute.domain.postgres.Notas;

@Repository
public interface NotaRepository extends JpaRepository<Notas, Long> {
	
	@Query(value = "SELECT n.* FROM notas n JOIN users u ON n.user_id=u.\"id\" WHERE u.email=?1", nativeQuery = true)
	List<Notas> findAllByEmail(String email);

}
