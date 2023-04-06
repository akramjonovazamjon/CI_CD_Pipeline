package com.example.ci_cd_pipeline;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("/user")
@RequiredArgsConstructor
public class Test {

    private final CustomerRepository repository;

    @GetMapping("/list")
    public List<Customer > user(){
        return repository.findAll();
    }

}
