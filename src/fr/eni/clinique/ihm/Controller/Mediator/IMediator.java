/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller.Mediator;

import fr.eni.clinique.bo.Client;
import fr.eni.clinique.bo.Personnel;
import javax.swing.JFrame;

/**
 *
 * @author plaurent2017
 */
public interface IMediator {

    
    public JFrame getFrameVeterinaire();
    
    /* 
    Gestion Client 
     */
    public void AfficherClient();

    public void AfficherRechercheClient();

    public void AfficherAjoutClient();

    public void SupprimerClinet();
    
    public void ValiderClient();

    /* 
    Clinique Veterinaire
     */
    public void AfficherCliniqueVeterinaire();

    public void Deconnexion();

    public void AfficherGestionPersonnel();

    public void AfficherGestionClient();

    public void AfficherPrisDeRDV();

    public void AfficherAgenda();

    public void FermerApp();
    
    public String getName();
    
    public String getMotPasse();

    /* 
    Gestion Personnel
     */
    
    public void AjoutPersonnel();
    
    public void SupprimerPersonnel();
    
    public void ModifierMotDePasse();
    /* 
    Connexion
     */
    public void AfficherConnexion();
    
    public void ValiderConnexion();

    public void AfficherInfoRechercheClient(Client InfoClient);

}
