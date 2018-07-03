
import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.Connexion;
import fr.eni.clinique.ihm.Controller.ClientControler;
import fr.eni.clinique.ihm.Controller.CliniqueVeterinaireController;
import fr.eni.clinique.ihm.Controller.ConnexionControler;
import fr.eni.clinique.ihm.Controller.Mediator.ApplicationMediator;
import fr.eni.clinique.ihm.Controller.RechercheClientControler;
import fr.eni.clinique.ihm.GestionClient.RechercheClient;
import fr.eni.clinique.ihm.GestionClient.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plaurent2017
 */
public class app {
    
    public static void main(String[] args) {
        ApplicationMediator app = new ApplicationMediator();
        
        ConnexionControler connexionControler = ConnexionControler.getInstance();
        CliniqueVeterinaireController cliniqueVeterinaireController = CliniqueVeterinaireController.getInstance();
        RechercheClientControler rechercheClientControler = RechercheClientControler.getInstance();
        ClientControler clientControler = ClientControler.getInstance();
        
        connexionControler.setMediator(app);
        cliniqueVeterinaireController.setMediator(app);
        clientControler.setMediator(app);
        rechercheClientControler.setMediator(app);
        
        app.AfficherConnexion();        
    }
    
}
