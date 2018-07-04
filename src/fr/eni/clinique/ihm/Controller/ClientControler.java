/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionClient.IClientObserver;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public class ClientControler implements IControler, IClientObserver {

    private static ClientControler clientControler;
    private IMediator clientMediator;

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

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.clientMediator = mediator;
        }
    }

    @Override
    public JPanel getPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JDialog getDialogue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
