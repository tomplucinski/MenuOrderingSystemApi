package com.menuorderingsystem.core;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BreakfastRepository extends MongoRepository<Breakfast, String> {

    public Optional<Breakfast> findById(String id);
}
