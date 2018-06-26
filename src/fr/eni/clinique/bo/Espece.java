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
public class Espece {
    private String espece;
    private List<Race> listeRace;

    public Espece() {
    }

    public Espece(String espece, List<Race> listeRace) {
        this.espece = espece;
        this.listeRace = listeRace;
    }

    public Espece(String espece) {
        this.espece = espece;
    }

    @Override
    public String toString() {
        return "Espece{" + "espece=" + espece + ", listeRace=" + listeRace + '}';
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public List<Race> getListeRace() {
        return listeRace;
    }

    public void setListeRace(List<Race> listeRace) {
        this.listeRace = listeRace;
    }
    
}
