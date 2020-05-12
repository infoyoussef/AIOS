package com.example.demo.model;

import com.example.demo.util.validator.CheckQuantiteMultipleVaingCinque;
import com.example.demo.util.validator.CheckDateLivraison;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue
    private int id;

    @NotNull(message = "SVP veuillez renseigner le destinataire")
    @ManyToOne(cascade= CascadeType.ALL)
    private Destinataire destinataire;

    @NotNull(message = "SVP veuillez renseigner la date de livraison")
    @CheckDateLivraison
    private Date dateLivraison;

    @NotNull(message = "SVP veuillez renseigner la quantité")

    // La quantité de bananes demandé doit être compris entre 0 et 10 000 et
    // doit être un multiple de 25 (parce qu’une caisse de bananes contient 25kg)
    @Range(min = 0, max = 10000)
    @CheckQuantiteMultipleVaingCinque
    private int quantiteBananes;

    @NotNull(message = "SVP veuillez renseigner le prix")
    private double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Destinataire getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Destinataire destinataire) {
        this.destinataire = destinataire;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public int getQuantiteBananes() {
        return quantiteBananes;
    }

    public void setQuantiteBananes(int quantiteBananes) {
        this.quantiteBananes = quantiteBananes;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
