/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.ihm.AnimauxPanel;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionClient.IClientObserver;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class AjoutAnimalController implements IControler, IClientObserver{

    private AnimauxPanel viewAnimal;
    private IMediator animalMediator;
    private static AjoutAnimalController addAnimal;
    
    public AjoutAnimalController(){
        
    }
    
    public static synchronized AjoutAnimalController getInstance() {
        if (addAnimal == null) {
            addAnimal = new AjoutAnimalController();
        }
        return addAnimal;
    }

    public static synchronized AjoutAnimalController getObserver() {
        if (addAnimal == null) {
            addAnimal = new AjoutAnimalController();
        }
        return addAnimal;
    }
    
    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.animalMediator = mediator;
        }
    }

    @Override
    public void initView() {        
        viewAnimal = new AnimauxPanel();
        viewAnimal.setVisible(true);
    }

    @Override
    public void initView(String password, String codeEmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public JFrame getFrame() {
        return viewAnimal;
    }

    @Override
    public void AfficherRecherche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AjoutClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AjoutAnimal(String nomClient) {
        initView();
    }

    @Override
    public void SupprimerClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ValiderChangement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AnnulerChangement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EditerAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initView(String nomClient) {
        viewAnimal = new AnimauxPanel(nomClient);
        viewAnimal.setVisible(true);
    }
    
}
