/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionPersonnel.GestionPersonnel;
import fr.eni.clinique.ihm.GestionPersonnel.IGestionPersonnelObserver;
import fr.eni.clinique.ihm.GestionPersonnel.PersonnelReinitPassword;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class ReinitPasswordController implements IControler, IGestionPersonnelObserver {

    PersonnelReinitPassword viewReinit;
    private IMediator gestionPersonnelMediator;
    private static ReinitPasswordController reinitPasswordController;
    
    
    public ReinitPasswordController(){
        
    }
    
    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.gestionPersonnelMediator = mediator;
        }
    }

    public static synchronized ReinitPasswordController getInstance() {
        if (reinitPasswordController == null) {
            reinitPasswordController = new ReinitPasswordController();
        }
        return reinitPasswordController;
    }

    public static synchronized ReinitPasswordController getObserver() {
        if (reinitPasswordController == null) {
            reinitPasswordController = new ReinitPasswordController();
        }
        return reinitPasswordController;
    }
    
    @Override
    public void initView(String password, String codeEmp) {
        viewReinit = new PersonnelReinitPassword(password, codeEmp);
        viewReinit.setVisible(true);
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
    public void AfficherPersonnel() {
        gestionPersonnelMediator.AfficherPersonnel();
    }

    @Override
    public void AjouterPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SupprimerPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ReinitPasswordPersonnel() {
        initView();
    }

    @Override
    public JFrame getFrame() {
        return viewReinit.getFrame();
    }

    @Override
    public void initView() {
        viewReinit = new PersonnelReinitPassword();
        viewReinit.setVisible(true);
    }
    
    
}
