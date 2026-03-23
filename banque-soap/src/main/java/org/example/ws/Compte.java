package org.example.ws;

import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

public class Compte {

    private String id;
    private double solde;
    private Date dateCreation;

    // Constructeur vide obligatoire pour JAXB
    public Compte() {}

    public Compte(String id, double solde, Date dateCreation) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    // @XmlTransient = ignoré dans la sérialisation XML
    @XmlTransient
    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }
}