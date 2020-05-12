package com.example.demo.repository;

import com.example.demo.model.Destinataire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinataireRepository extends CrudRepository<Destinataire, Integer> {}
