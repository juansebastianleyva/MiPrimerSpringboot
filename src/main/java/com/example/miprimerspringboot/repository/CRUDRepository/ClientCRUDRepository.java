package com.example.miprimerspringboot.repository.CRUDRepository;

import com.example.miprimerspringboot.entidades.Client;
import com.example.miprimerspringboot.entidades.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientCRUDRepository extends CrudRepository<Client,Integer> {

    public List<Client> findByEmailContainsAndAgeGreaterThan(String email,Integer age);
}
