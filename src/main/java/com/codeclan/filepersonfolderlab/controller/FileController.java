package com.codeclan.filepersonfolderlab.controller;


import com.codeclan.filepersonfolderlab.models.File;
import com.codeclan.filepersonfolderlab.models.Person;
import com.codeclan.filepersonfolderlab.repositories.FileRepository;
import com.codeclan.filepersonfolderlab.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/files")
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping
    public List<File> getAllFiles() {
        return fileRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<File> createFile(@RequestBody File file) {
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public Optional<File> getFileById(@PathVariable Long id) {
        return fileRepository.findById(id);
    }

//    @PostMapping(value = "/pirates")
//    public ResponseEntity<Pirate> postPirate(@RequestBody Pirate pirate){
//        pirateRepository.save(pirate);
//        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
//    }

}
