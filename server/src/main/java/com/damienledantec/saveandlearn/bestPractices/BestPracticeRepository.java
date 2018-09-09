package com.damienledantec.saveandlearn.bestPractices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(collectionResourceRel = "best-practice", path = "best-practice")
public interface BestPracticeRepository extends MongoRepository<BestPractice, String>{ }
