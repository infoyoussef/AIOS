package com.example.demo.service;

import com.example.demo.model.Destinataire;
import com.example.demo.repository.DestinataireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinataireService {

    @Autowired
    DestinataireRepository destinataireRepository;

    public List<Destinataire> getAllDestinataires() {
        List<Destinataire> destinataires = new ArrayList<Destinataire>();
        destinataireRepository.findAll().forEach(destinataire -> destinataires.add(destinataire));
        return destinataires;
    }

    public void saveOrUpdate(Destinataire destinataire) {
        destinataireRepository.save(destinataire);
    }

    public void delete(int id) {
        destinataireRepository.deleteById(id);
    }

}
