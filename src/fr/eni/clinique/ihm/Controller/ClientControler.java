/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.ihm.GestionClient.ClientPanel;
import fr.eni.clinique.ihm.GestionClient.IClientObserver;
import fr.eni.clinique.ihm.GestionClient.RechercheClient;

/**
 *
 * @author plaurent2017
 */
public class ClientControler implements IClientObserver {

    private ClientPanel viewClientPanel;
    private static ClientControler clientControler;
    private RechercheClient rechercheClient;

    private void ControlerTemplate() {
    }

    public static synchronized ClientControler getInstance() {
        if (clientControler == null) {
            clientControler = new ClientControler();
        }
        return clientControler;
    }

    public static synchronized ClientControler getObserver() {
        if (clientControler == null) {
            clientControler = new ClientControler();
        }
        return clientControler;
    }

    @Override
    public void AfficherRecherche() {
        //Affiche la recherche
        
    }

    @Override
    public void AjoutClient() {
        //Ajout CLient. 
    }

    @Override
    public void AjoutAnimal() {
        //Ajout Animal.
    }

    @Override
    public void SupprimerClient() {
        //Supprimer CLient.
    }

    @Override
    public void ValiderChangement() {
        //Validet Changement.
    }

    @Override
    public void AnnulerChangement() {
        //Annul Changement.
    }

    @Override
    public void EditerAnimal() {
        //Editer Animal.
    }

}
