package com.example.ci_cd_pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("/user")
public class Test {


    @GetMapping("/list")
    public List<String > user(){
        return List.of("Azamjon");
    }

}
