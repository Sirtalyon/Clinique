/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionPersonnel.IGestionPersonnelObserver;
import fr.eni.clinique.ihm.GestionPersonnel.PersonnelAdd;
import fr.eni.clinique.ihm.GestionPersonnel.PersonnelReinitPassword;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class AddPersonnelController implements IControler, IGestionPersonnelObserver{

    private PersonnelAdd viewAddPErsonnel;
    private IMediator gestionPersonnelMediator;
    private static AddPersonnelController addPersonnelController;
    
    public AddPersonnelController(){
        
    }
    
    public static synchronized AddPersonnelController getInstance() {
        if (addPersonnelController == null) {
            addPersonnelController = new AddPersonnelController();
        }
        return addPersonnelController;
    }

    public static synchronized AddPersonnelController getObserver() {
        if (addPersonnelController == null) {
            addPersonnelController = new AddPersonnelController();
        }
        return addPersonnelController;
    }
    
    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.gestionPersonnelMediator = mediator;
        }
    }

    @Override
    public void initView() {        
        viewAddPErsonnel = new PersonnelAdd();
        viewAddPErsonnel.setVisible(true);
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
       return viewAddPErsonnel;
    }

    @Override
    public void AfficherPersonnel() {
        gestionPersonnelMediator.AfficherPersonnel();
    }

    @Override
    public void AjouterPersonnel() {
        initView();
    }

    @Override
    public void SupprimerPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ReinitPasswordPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
