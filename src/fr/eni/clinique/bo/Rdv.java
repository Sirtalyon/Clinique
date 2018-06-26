/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.bo;

import java.time.LocalDateTime;

/**
 *
 * @author plaurent2017
 */
public class Rdv {
   private Veterinaire veterinaire;
   private Animal animal;
   private String dateTime;
   private Client client;

    public Veterinaire getVeterinaire() {
        return veterinaire;
    }

    public void setVeterinaire(Veterinaire veterinaire) {
        this.veterinaire = veterinaire;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Rdv() {
    }

    public Rdv(Veterinaire veterinaire, Animal animal, String dateTime, Client client) {
        this.veterinaire = veterinaire;
        this.animal = animal;
        this.dateTime = dateTime;
        this.client = client;
    }

    public Rdv(Veterinaire veterinaire, Animal animal, String dateTime) {
        this.veterinaire = veterinaire;
        this.animal = animal;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Rdv{" + "veterinaire=" + veterinaire + ", animal=" + animal + ", dateTime=" + dateTime + ", client=" + client + '}';
    }
   
}
