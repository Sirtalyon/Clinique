/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.GestionClient;

/**
 *
 * @author plaurent2017
 */
public interface IClientObserver {

    public void AfficherRecherche();
    
    public void AjoutClient();

    public void AjoutAnimal(String nomClient);

    public void SupprimerClient();

    public void ValiderChangement();

    public void AnnulerChangement();

    public void EditerAnimal();
}
