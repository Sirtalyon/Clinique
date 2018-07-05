/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.dao.GetValuesDataBase;
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

    private CliniqueVeterinaireController() {
    }

    @Override
    public void initView() {
        GetValuesDataBase bdd = new GetValuesDataBase();
        
        viewCliniqueVeterinaire = new CliniqueVeterinaire();

        // cliniqueVeterinaireIMediator.getName(), cliniqueVeterinaireIMediator.getMotPasse()).getRole()
        
        switch (bdd.getIdentifiant(cliniqueVeterinaireIMediator.getName(),cliniqueVeterinaireIMediator.getMotPasse()).getRole()) {
            case EnumRole.ADM:
                break;
            case EnumRole.VET:
                viewCliniqueVeterinaire.getGestionClient().setVisible(false);
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                viewCliniqueVeterinaire.getGestionRDV().setVisible(false);
                break;
            case EnumRole.AST:
                viewCliniqueVeterinaire.getGestionClient().setVisible(false);
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                viewCliniqueVeterinaire.getGestionRDV().setVisible(false);
                break;
            case EnumRole.SEC:
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                break;
        }
        viewCliniqueVeterinaire.setVisible(true);
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
        cliniqueVeterinaireIMediator.AfficherGestionClient();
    }

    @Override
    public void Deconnexion() {
        //Deconnexion de l'application.

    }

    @Override
    public void AfficherGestionPersonnel() {

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
