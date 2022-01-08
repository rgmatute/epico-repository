package com.github.rgmatute.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.rgmatute.domain.Catalogo;

@Repository
public interface CatalogoRepository extends MongoRepository<Catalogo, String> {

}
