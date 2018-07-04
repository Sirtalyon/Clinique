/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public class CliniqueVeterinaireController implements IControler, ICliniqueVeterinaireObserver {

    private CliniqueVeterinaire viewCliniqueVeterinaire;
    private static CliniqueVeterinaireController cliniqueVeterinaireController;
    private IMediator cliniqueVeterinaireIMediator;

    public CliniqueVeterinaireController() {
        viewCliniqueVeterinaire = new CliniqueVeterinaire();
    }
    
        public static synchronized CliniqueVeterinaireController getInstance() {
        if (cliniqueVeterinaireController == null) {
            cliniqueVeterinaireController = new CliniqueVeterinaireController();
        }
        return cliniqueVeterinaireController;
    }

    public static synchronized CliniqueVeterinaireController getObserver() {
        if (cliniqueVeterinaireController == null) {
            cliniqueVeterinaireController = new CliniqueVeterinaireController();
        }
        return cliniqueVeterinaireController;
    }


    @Override
    public void AfficherGestionClient() {
        //Affiche le page de gestion de client. 
    }

    @Override
    public void Deconnexion() {
        //Deconnexion de l'application.
        
    }

    @Override
    public void AfficherGestionPersonnel() {
        //Affiche la page de gestion du personnel.
    }

    @Override
    public void AfficherAgenda() {
        //Affiche la page Agenda.
    }

    @Override
    public void AfficherPriseRDV() {
        //Affiche la page des prise de rendez vous.
    }

    @Override
    public void Fermer() {
        //Fermer l'application.
    }

    private void GestionRole(String role) {
        switch (role) {
            case EnumRole.ADM:
                break;
            case EnumRole.AST:
                viewCliniqueVeterinaire.getAgenda().setVisible(false);
                viewCliniqueVeterinaire.getGestionClient().setVisible(false);
                break;
            case EnumRole.SEC:
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                break;
            case EnumRole.VET:
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                break;
        }

    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.cliniqueVeterinaireIMediator = mediator;
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

    public JFrame getFrame() {
        return viewCliniqueVeterinaire.getFrame();
    }

}
