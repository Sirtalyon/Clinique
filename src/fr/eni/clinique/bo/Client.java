/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.bo;

import java.util.List;

/**
 *
 * @author plaurent2017
 */
public class Client {
    private int codeClient;
    private String nomClient;
    private String prenomClient;
    private String adresse1;
    private String adresse2;
    private String codePostal;
    private String ville;
    private String numTel;
    private String assurance;
    private String email;
    private String remarque;
    private boolean archive;
    
    private List<Animal> listeAnimal;

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getAssurance() {
        return assurance;
    }

    public void setAssurance(String assurance) {
        this.assurance = assurance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public List<Animal> getListeAnimal() {
        return listeAnimal;
    }

    public void setListeAnimal(List<Animal> listeAnimal) {
        this.listeAnimal = listeAnimal;
    }

    public Client() {
    }

    public Client(int codeClient, String nomClient, String prenomClient, String adresse1, String adresse2, String codePostal, String ville, String numTel, String assurance, String email, String remarque, boolean archive, List<Animal> listeAnimal) {
        this.codeClient = codeClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.numTel = numTel;
        this.assurance = assurance;
        this.email = email;
        this.remarque = remarque;
        this.archive = archive;
        this.listeAnimal = listeAnimal;
    }

    public Client(String nomClient, String prenomClient, String adresse1, String adresse2, String codePostal, String ville, String numTel, String assurance, String email, String remarque, boolean archive, List<Animal> listeAnimal) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.numTel = numTel;
        this.assurance = assurance;
        this.email = email;
        this.remarque = remarque;
        this.archive = archive;
        this.listeAnimal = listeAnimal;
    }

    public Client(String nomClient, String prenomClient, String adresse1, String adresse2, String codePostal, String ville, String numTel, String assurance, String email, String remarque, boolean archive) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.numTel = numTel;
        this.assurance = assurance;
        this.email = email;
        this.remarque = remarque;
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "Client{" + "codeClient=" + codeClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", adresse1=" + adresse1 + ", adresse2=" + adresse2 + ", codePostal=" + codePostal + ", ville=" + ville + ", numTel=" + numTel + ", assurance=" + assurance + ", email=" + email + ", remarque=" + remarque + ", archive=" + archive + ", listeAnimal=" + listeAnimal + '}';
    }
    
    public void addAnimal(Animal animal){
        getListeAnimal().add(animal);
    }
}
