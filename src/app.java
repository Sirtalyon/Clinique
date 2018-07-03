
import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.ConnexionPageBuild;
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
        CliniqueVeterinaire cliniqueVeterinaire = new CliniqueVeterinaire();
        ConnexionPageBuild connexionPageBuild = new ConnexionPageBuild();  
        
        Session session = Session.getSession();
        session.setCliniqueVeterinaireFrameSession(cliniqueVeterinaire);
        
        connexionPageBuild.setVisible(true);
    }
    
}
