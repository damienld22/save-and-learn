package com.damienledantec.saveandlearn.snippets;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "snippet", path = "snippet")
public interface SnippetRepository extends MongoRepository<Snippet, String> {}
