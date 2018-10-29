package com.rmd.jpa.jpa1.controller;

import com.rmd.jpa.jpa1.model.RMD;
import com.rmd.jpa.jpa1.repository.RMDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RMDController {

    @Autowired
    private RMDRepository repository;

    @GetMapping("/rmd")
    public List<RMD> getRMDs(){
        List<RMD> rmds = new ArrayList<>();
        repository.findAll().forEach(rmds::add);
        return rmds;
    }

    @GetMapping("/rmd/{id}")
    public Optional<RMD> getRMDs(@PathVariable("id") Long id ){
        return repository.findById(id);
    }

    @PostMapping("/rmd")
    public RMD createRMD(@RequestBody RMD rmd ){
        return repository.save(rmd);
    }

    @DeleteMapping("/rmd/{id}")
    public void deleteRMD(@PathVariable("id") Long id ){
        repository.deleteById(id);
    }
}
