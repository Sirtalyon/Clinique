/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.bo;

/**
 *
 * @author plaurent2017
 */
public class Animal {
    private int codeAnimal;
    private String nomAnimal;
    private String sexe;
    private String couleur;
    private String race;
    private String espece;
    private String tatouage;
    private String antecedents;
    private int codeClient;
    private boolean archive;

    public int getCodeAnimal() {
        return codeAnimal;
    }

    public void setCodeAnimal(int codeAnimal) {
        this.codeAnimal = codeAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public String getTatouage() {
        return tatouage;
    }

    public void setTatouage(String tatouage) {
        this.tatouage = tatouage;
    }

    public String getAntecedents() {
        return antecedents;
    }

    public void setAntecedents(String antecedents) {
        this.antecedents = antecedents;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public Animal(int codeAnimal, String nomAnimal, String sexe, String couleur, String race, String espece, String tatouage, String antecedents, int codeClient, boolean archive) {
        this.codeAnimal = codeAnimal;
        this.nomAnimal = nomAnimal;
        this.sexe = sexe;
        this.couleur = couleur;
        this.race = race;
        this.espece = espece;
        this.tatouage = tatouage;
        this.antecedents = antecedents;
        this.codeClient = codeClient;
        this.archive = archive;
    }

    public Animal(String nomAnimal, String sexe, String couleur, String race, String espece, String tatouage, String antecedents, int codeClient, boolean archive) {
        this.nomAnimal = nomAnimal;
        this.sexe = sexe;
        this.couleur = couleur;
        this.race = race;
        this.espece = espece;
        this.tatouage = tatouage;
        this.antecedents = antecedents;
        this.codeClient = codeClient;
        this.archive = archive;
    }

    public Animal() {
    }

    public Animal(String nomAnimal, String sexe, String couleur, String race, String espece, int codeClient, boolean archive) {
        this.nomAnimal = nomAnimal;
        this.sexe = sexe;
        this.couleur = couleur;
        this.race = race;
        this.espece = espece;
        this.codeClient = codeClient;
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "Animal{" + "codeAnimal=" + codeAnimal + ", nomAnimal=" + nomAnimal + ", sexe=" + sexe + ", couleur=" + couleur + ", race=" + race + ", espece=" + espece + ", tatouage=" + tatouage + ", antecedents=" + antecedents + ", codeClient=" + codeClient + ", archive=" + archive + '}';
    }  
}

