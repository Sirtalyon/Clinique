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
public class Personnel {
    private int codePersonnel;
    private String nom;
    private String motDePase;
    private String role;
    private boolean archive;

    public int getCodePersonnel() {
        return codePersonnel;
    }

    public void setCodePersonnel(int codePersonnel) {
        this.codePersonnel = codePersonnel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePase() {
        return motDePase;
    }

    public void setMotDePase(String motDePase) {
        this.motDePase = motDePase;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public Personnel() {
    }
    
    public Personnel(int codePersonnel, String nom, String motDePase, String role, boolean archive) {
        this.codePersonnel = codePersonnel;
        this.nom = nom;
        this.motDePase = motDePase;
        this.role = role;
        this.archive = archive;
    }

    public Personnel(String nom, String motDePase, String role, boolean archive) {
        this.nom = nom;
        this.motDePase = motDePase;
        this.role = role;
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "Personnel{" + "codePersonnel=" + codePersonnel + ", nom=" + nom + ", motDePase=" + motDePase + ", role=" + role + ", archive=" + archive + '}';
    }   
}
