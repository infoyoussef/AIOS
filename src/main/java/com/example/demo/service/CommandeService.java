package com.example.demo.service;

import com.example.demo.model.Commande;
import com.example.demo.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandeService {

    public static final double prixUnitaire=2.50;

    @Autowired
    CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        List<Commande> commandes = new ArrayList<Commande>();
        commandeRepository.findAll().forEach(commande -> commandes.add(commande));
        return commandes;
    }

    public Commande getCommandeById(int id) {
        return commandeRepository.findById(id).get();
    }

    public void saveOrUpdate(Commande commande) {

        // Le prix sera déterminé automatiquement par le système à partir
        // d’un prix au kilo de 2.50€
        commande.setPrix(prixUnitaire * commande.getQuantiteBananes());

        commandeRepository.save(commande);
    }

    public void delete(int id) {
        commandeRepository.deleteById(id);
    }

}
