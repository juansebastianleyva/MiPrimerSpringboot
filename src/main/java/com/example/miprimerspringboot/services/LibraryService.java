package com.example.miprimerspringboot.services;

import com.example.miprimerspringboot.entidades.Client;
import com.example.miprimerspringboot.entidades.Library;
import com.example.miprimerspringboot.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAll(){
        return libraryRepository.getAll();
    }

    public Library save(Library l){

        return libraryRepository.save(l);
    }
    public Optional<Library> getById(int id){
        return libraryRepository.getById(id);
    }



}
