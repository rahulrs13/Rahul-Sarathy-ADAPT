package com.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repository extends MongoRepository<employee, Long> {

	
}
