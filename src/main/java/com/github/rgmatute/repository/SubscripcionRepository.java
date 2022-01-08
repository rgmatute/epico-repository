package com.github.rgmatute.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.rgmatute.domain.Subscripcion;

@Repository
public interface SubscripcionRepository extends MongoRepository<Subscripcion, String> {

}
