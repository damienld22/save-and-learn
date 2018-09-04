package com.damienledantec.saveandlearn.commands;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "command", path = "command")
public interface CommandRepository extends MongoRepository<Command, String> {}
