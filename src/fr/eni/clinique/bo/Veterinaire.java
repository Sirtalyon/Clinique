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
public class Veterinaire extends Personnel{

    public Veterinaire() {
    }

    public Veterinaire(int codePersonnel, String nom, String motDePase, String role, boolean archive) {
        super(codePersonnel, nom, motDePase, role, archive);
    }

    public Veterinaire(String nom, String motDePase, String role, boolean archive) {
        super(nom, motDePase, role, archive);
    }
           
}
