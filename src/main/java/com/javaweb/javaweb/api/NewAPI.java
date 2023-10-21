package com.javaweb.javaweb.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {

    @GetMapping("/new")
    public String findAll() {
        return "hehe";
    }

    @GetMapping("/new/{id}")
    public String findById(@RequestParam Long id) {
        return "hehe";
    }

    @PostMapping("/new")
    public String create() {
        return "hehe";
    }

    @PutMapping("/new/{id}")
    public String update(@RequestParam Long id) {
        return "hehe";
    }

    @DeleteMapping("/new/{id}")
    public String delete(@RequestParam Long id) {
        return "hehe";
    }

}
