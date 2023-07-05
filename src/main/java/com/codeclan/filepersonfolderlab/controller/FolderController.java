package com.codeclan.filepersonfolderlab.controller;


import com.codeclan.filepersonfolderlab.models.File;
import com.codeclan.filepersonfolderlab.models.Folder;
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
@RequestMapping(value = "/folders")
public class FolderController {

    @Autowired
    private FolderRepository folderRepository;

    @GetMapping
    public List<Folder> getAllFolders() {
        return folderRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Folder> createFolder(@RequestBody Folder folder) {
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public Optional<File> getFileById(@PathVariable Long id) {
        return folderRepository.findById(id);
    }

//    @PostMapping(value = "/pirates")
//    public ResponseEntity<Pirate> postPirate(@RequestBody Pirate pirate){
//        pirateRepository.save(pirate);
//        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
//    }

}
