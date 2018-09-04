package com.damienledantec.saveandlearn.litteratures;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "litterature", path = "litterature")
public interface LitteratureRepository extends MongoRepository<litterature, String> {}
