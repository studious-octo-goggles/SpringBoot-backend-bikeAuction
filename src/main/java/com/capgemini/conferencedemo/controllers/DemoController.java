package com.capgemini.conferencedemo.controllers;

import com.capgemini.conferencedemo.models.Demo;
import com.capgemini.conferencedemo.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Demo")
public class DemoController {
    @Autowired
    private DemoRepo demoRepo;

    @GetMapping
    public List<Demo> list(){
        return demoRepo.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Demo demo){
        demoRepo.save(demo);
    }
    @GetMapping("/{id}")
    public Demo get(@PathVariable("id") long id){
        return demoRepo.getOne(id);
    }
}
