package com.sudip.docker.apis;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo  extends MongoRepository<TestEntity, String> {
}
