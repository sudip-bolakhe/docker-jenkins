package com.sudip.docker.apis;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test_entity")
public class TestEntity {
    String id;
    String fullName;

    public TestEntity(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
