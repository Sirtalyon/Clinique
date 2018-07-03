/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Connexion;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public class ConnexionControler implements IControler, IConnexionObserver {

    private GetValuesDataBase connexion = new GetValuesDataBase();
    private Connexion viewConnexionPageBuild;
    private static ConnexionControler connexionControler;
    private IMediator connexionMediator;

    public ConnexionControler() {
        viewConnexionPageBuild = new Connexion();
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
        //Valide la connexion.
    }

    /*private String getRole() {
        String role = "";
        Boolean getIdUser = connexion.getIdentifiant(getNameValue(), getPassWordValue());        
        String getRoleUser = connexion.getRole(getNameValue(), getPassWordValue());

        if (getIdUser) {
            switch (getRoleUser) {
                case EnumRole.ADM:
                    isAdmin = true;
                    break;
                case EnumRole.AST:
                    isAssistant = true;
                    break;
                case EnumRole.SEC:
                    isSecretaire = true;
                    break;
                case EnumRole.VET:
                    isVeterinaire = true;
                    break;
            }
            return role;
        }
    }*/
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
        return viewConnexionPageBuild;
    }
}
