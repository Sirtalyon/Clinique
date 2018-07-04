/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Connexion;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public class ConnexionControler implements IControler, IConnexionObserver {

    private GetValuesDataBase connexion = new GetValuesDataBase();
    private Connexion viewConnexion;
    private static ConnexionControler connexionControler;
    private IMediator connexionMediator;
    private String nom;
    private String mdp;

    private ConnexionControler() {
    }

    @Override
    public void initView() {
        viewConnexion = new Connexion();
        viewConnexion.setVisible(true);
        viewConnexion.setLocationRelativeTo(null);
    }

    public static synchronized ConnexionControler getInstance() {
        if (connexionControler == null) {
            connexionControler = new ConnexionControler();
        }
        return connexionControler;
    }

    public static synchronized ConnexionControler getObserver() {
        if (connexionControler == null) {
            connexionControler = new ConnexionControler();
        }
        return connexionControler;
    }

    @Override
    public void ValiderConnexion() {
        nom = viewConnexion.getNameTextField().getText();
        mdp = new String(viewConnexion.getPassWordTextField().getPassword());
        connexionMediator.AfficherCliniqueVeterinaire();
        viewConnexion.dispose();
    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.connexionMediator = mediator;
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
        return viewConnexion;
    }

    public String getName() {
        return  nom;
    }

    public String getMotPasse() {
        return mdp;
    }

}
