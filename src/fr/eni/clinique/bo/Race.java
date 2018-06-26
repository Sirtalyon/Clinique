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
public class Race {
    private String race;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Race() {
    }

    public Race(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Race{" + "race=" + race + '}';
    }               
}
