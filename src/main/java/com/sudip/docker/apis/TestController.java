package com.sudip.docker.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepo repo;

    @PostMapping
    public void add(){
        TestEntity e = new TestEntity("test");
        repo.save(e);
    }


    @GetMapping
    public List<TestEntity> list(){
        return repo.findAll();
    }

}
