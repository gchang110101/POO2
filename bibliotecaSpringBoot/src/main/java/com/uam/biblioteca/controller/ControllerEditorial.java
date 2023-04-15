package com.uam.biblioteca.controller;

import com.uam.biblioteca.model.Editorial;
import com.uam.biblioteca.service.IServiceEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/editorial")
public class ControllerEditorial {
    @Autowired
    private IServiceEditorial service;

    @GetMapping("/all")
    public List<Editorial> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public Editorial save(Editorial editorial) {
        return service.save(editorial);
    }
}
