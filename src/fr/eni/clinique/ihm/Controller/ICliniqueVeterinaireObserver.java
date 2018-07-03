/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

/**
 *
 * @author plaurent2017
 */
public interface ICliniqueVeterinaireObserver {

    public void AfficherGestionClient();

    public void Deconnexion();

    public void AfficherGestionPersonnel();

    public void AfficherAgenda();

    public void AfficherPriseRDV();

    public void Fermer();
    
}
