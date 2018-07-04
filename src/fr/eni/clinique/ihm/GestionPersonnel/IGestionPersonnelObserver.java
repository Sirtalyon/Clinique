/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.GestionPersonnel;

/**
 *
 * @author Administrateur
 */
public interface IGestionPersonnelObserver {
    
    public void AfficherPersonnel();
    
    public void AjouterPersonnel();
    
    public void SupprimerPersonnel();
    
    public void ReinitPasswordPersonnel();
    
}
