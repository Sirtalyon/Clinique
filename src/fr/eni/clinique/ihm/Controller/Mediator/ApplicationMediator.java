/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller.Mediator;

import fr.eni.clinique.ihm.Connexion;
import fr.eni.clinique.ihm.Controller.CliniqueVeterinaireController;
import fr.eni.clinique.ihm.Controller.ConnexionControler;

/**
 *
 * @author plaurent2017
 */
public class ApplicationMediator implements IMediator {

    private ConnexionControler connexionControler;
    private CliniqueVeterinaireController veterinaireController;

    public ApplicationMediator() {
        connexionControler = ConnexionControler.getInstance();
        veterinaireController = CliniqueVeterinaireController.getInstance();
    }

    /* 
    Gestion Client 
     */
    @Override
    public void AfficherClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherRechercheClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherAjoutClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SupprimerClinet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /* 
    Clinique Veterinaire
     */
    @Override
    public void AfficherCliniqueVeterinaire() {
        veterinaireController.initView();
    }

    @Override
    public String getName() {
        return connexionControler.getName();
    }

    @Override
    public String getMotPasse() {
        return connexionControler.getMotPasse();
    }

    @Override
    public void AfficherGestionClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherPrisDeRDV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FermerApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deconnexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /* 
    Gestion Personnel
     */
    @Override
    public void AfficherGestionPersonnel() {

    }

    @Override
    public void AjoutPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SupprimerPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModifierMotDePasse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /* 
    Connexion Frame
     */
    @Override
    public void AfficherConnexion() {
        ConnexionControler connexion = ConnexionControler.getInstance();
        connexion.initView();
    }

    @Override
    public void ValiderConnexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
