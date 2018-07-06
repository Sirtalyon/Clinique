/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller.Mediator;

import fr.eni.clinique.bo.Animal;
import fr.eni.clinique.bo.Client;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Connexion;
import fr.eni.clinique.ihm.Controller.AjoutClientControler;
import fr.eni.clinique.ihm.Controller.AddPersonnelController;
import fr.eni.clinique.ihm.Controller.AjoutAnimalController;
import fr.eni.clinique.ihm.Controller.ClientControler;
import fr.eni.clinique.ihm.Controller.CliniqueVeterinaireController;
import fr.eni.clinique.ihm.Controller.ConnexionControler;
import fr.eni.clinique.ihm.Controller.GestionPersonnelCOntroller;
import fr.eni.clinique.ihm.Controller.RechercheClientControler;
import fr.eni.clinique.ihm.GestionClient.AjoutClient;
import fr.eni.clinique.ihm.Controller.ReinitPasswordController;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author plaurent2017
 */
public class ApplicationMediator implements IMediator {

    private GestionPersonnelCOntroller gestionPersonnelCOntroller;

    private ConnexionControler connexionControler;
    private CliniqueVeterinaireController veterinaireController;
    private ClientControler clientControler;
    private ConnexionControler connexion;
    private RechercheClientControler rechercheClientControler;
    private AjoutClientControler ajoutClientControler;
    private ReinitPasswordController reinitPasswordController;
    private AddPersonnelController addPersonnelController;
    private AjoutAnimalController ajoutAnimalController;

    public ApplicationMediator() {
        connexionControler = ConnexionControler.getInstance();
        veterinaireController = CliniqueVeterinaireController.getInstance();
        clientControler = ClientControler.getInstance();
        connexion = ConnexionControler.getInstance();
        gestionPersonnelCOntroller = GestionPersonnelCOntroller.getInstance();
        rechercheClientControler = RechercheClientControler.getInstance();
        ajoutClientControler = AjoutClientControler.getInstance();
        reinitPasswordController = ReinitPasswordController.getInstance();
        addPersonnelController = AddPersonnelController.getInstance();
        ajoutAnimalController = AjoutAnimalController.getInstance();
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
        rechercheClientControler.initView();
    }

    @Override
    public void AfficherAjoutClient() {
        ajoutClientControler.initView();
    }

    @Override
    public void SupprimerClinet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherInfoRechercheClient(Client infoClient) {
        clientControler.setCodeCli(infoClient.getCodeClient());
        clientControler.setNomCli(infoClient.getNomClient());
        clientControler.setPrenomCli(infoClient.getPrenomClient());
        clientControler.setCodePostalNomCli(infoClient.getCodePostal());
        clientControler.setVilleCli(infoClient.getVille());
        clientControler.setVilleCli(infoClient.getVille());  
        GetValuesDataBase get = new GetValuesDataBase();
        Client client = get.getClient(infoClient.getNomClient(), infoClient.getPrenomClient());
        List<Animal> animaux = get.getAnimaux(String.valueOf(client.getCodeClient()));
        clientControler.setTableauAnimal(animaux);
    }

    @Override
    public void ValiderClient() {
        if (ajoutClientControler.ValiderChangement()) {
            ajoutClientControler.FermerAjout();
        }
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
        clientControler.initView();
        veterinaireController.setPanelContainer(clientControler.getPanel());

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
        gestionPersonnelCOntroller.initView();
        veterinaireController.setPanelContainer(gestionPersonnelCOntroller.getPanel());

    }

    @Override
    public void AjoutPersonnel() {
        addPersonnelController.initView();
    }

    @Override
    public void SupprimerPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModifierMotDePasse(String password, String codeEmp) {
        reinitPasswordController.initView(password, codeEmp);
    }


    /* 
    Connexion Frame
     */
    @Override
    public void AfficherConnexion() {
        connexion.initView();
    }

    @Override
    public void ValiderConnexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JFrame getFrameVeterinaire() {
        return veterinaireController.getFrame();
    }

    @Override
    public void AfficherPersonnel() {
        gestionPersonnelCOntroller.AfficherPersonnel();
    }

    @Override
    public void AjouterAnimal(String nomClient) {
        ajoutAnimalController.initView(nomClient);
    }


}
