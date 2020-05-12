package com.example.demo.conroller;

import com.example.demo.model.Destinataire;
import com.example.demo.service.DestinataireService;
import com.example.demo.util.validator.CheckDestinataireExiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DestinataireController {

    @Autowired
    DestinataireService destinataireService;

    @GetMapping("/destinataires")
    private List<Destinataire> getAllDestinataires() {
        return destinataireService.getAllDestinataires();
    }

    @DeleteMapping("/destinataires/{id}")
    private void deleteDestinataire(@PathVariable("id") int id) {
        destinataireService.delete(id);
    }

    @PostMapping("/destinataires")
    private int saveDestinataire(@CheckDestinataireExiste @RequestBody Destinataire destinataire) {

        destinataireService.saveOrUpdate(destinataire);
        return destinataire.getId();
    }
}
