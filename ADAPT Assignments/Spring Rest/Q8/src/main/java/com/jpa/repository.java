package com.jpa;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestBody;

public interface repository extends MongoRepository<product, String>{

	
}
