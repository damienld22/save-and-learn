package com.damienledantec.saveandlearn.libraries;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "library", path = "library")
public interface LibraryRepository extends MongoRepository<Library, String> {}
