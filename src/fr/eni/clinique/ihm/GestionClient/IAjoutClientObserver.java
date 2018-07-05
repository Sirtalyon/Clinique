/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.GestionClient;

import fr.eni.clinique.bo.Client;

/**
 *
 * @author plaurent2017
 */
public interface IAjoutClientObserver {

    public boolean ValiderChangement();

    public void AnnulerChangement();
    
}
