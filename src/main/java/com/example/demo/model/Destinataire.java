package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Destinataire {

    @Id
    @GeneratedValue
    private int id;

    @NotEmpty(message = "SVP veuillez renseigner le nom")
    private String nom;

    @NotEmpty(message = "SVP veuillez renseigner l 'adresse")
    private String adresse;

    @NotEmpty(message = "SVP veuillez renseigner le code postale")
    private String codepostal;

    @NotEmpty(message = "SVP veuillez renseigner la ville")
    private String ville;

    @NotEmpty(message = "SVP veuillez renseigner le pays")
    private String pays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Destinataire))return false;

        Destinataire other = (Destinataire) obj;

        if (nom == null) {
            if (other.nom != null){
                return false;
            }

        } else if (!nom.equals(other.nom)){
            return false;
        }

        if (adresse == null) {
            if (other.adresse != null){
                return false;
            }
        } else if (!adresse.equals(other.adresse)){
            return false;
        }

        if (codepostal == null) {
            if (other.codepostal != null){
                return false;
            }
        } else if (!codepostal.equals(other.codepostal)){
            return false;
        }

        if (ville == null) {
            if (other.ville != null){
                return false;
            }
        } else if (!ville.equals(other.ville)){
            return false;
        }

        if (pays == null) {
            if (other.pays != null){
                return false;
            }
        } else if (!pays.equals(other.pays)){
            return false;
        }

        return true;
    }

}
