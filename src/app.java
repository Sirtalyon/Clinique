
import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.Controller.AddPersonnelController;
import fr.eni.clinique.ihm.Controller.ClientControler;
import fr.eni.clinique.ihm.Controller.CliniqueVeterinaireController;
import fr.eni.clinique.ihm.Controller.ConnexionControler;
import fr.eni.clinique.ihm.Controller.GestionPersonnelCOntroller;
import fr.eni.clinique.ihm.Controller.Mediator.ApplicationMediator;
import fr.eni.clinique.ihm.Controller.RechercheClientControler;
import fr.eni.clinique.ihm.Controller.ReinitPasswordController;

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
        GestionPersonnelCOntroller personnelController = GestionPersonnelCOntroller.getInstance();
        ReinitPasswordController reinitController = ReinitPasswordController.getInstance();
        AddPersonnelController addPersonnelController = AddPersonnelController.getInstance();
        
        addPersonnelController.setMediator(app);
        connexionControler.setMediator(app);
        cliniqueVeterinaireController.setMediator(app);
        clientControler.setMediator(app);
        rechercheClientControler.setMediator(app);
        personnelController.setMediator(app);
        reinitController.setMediator(app);
        connexionControler.initView();
    }
    
}
