package com.example.demo.conroller;

import com.example.demo.model.Commande;
import com.example.demo.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CommandeController {

    @Autowired
    CommandeService commandeService;

    @GetMapping("/commandes")
    private List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }

    @DeleteMapping("/commandes/{id}")
    private void deleteCommande(@PathVariable("id") int id) {
        commandeService.delete(id);
    }

    @PostMapping("/commandes")
    private int saveCommande(@Valid @RequestBody Commande commande) {
        commandeService.saveOrUpdate(commande);
        return commande.getId();
    }
}
