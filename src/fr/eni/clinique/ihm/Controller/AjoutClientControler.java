/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Client;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionClient.AjoutClient;
import fr.eni.clinique.ihm.GestionClient.IAjoutClientObserver;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public class AjoutClientControler implements IControler, IAjoutClientObserver {

    private static AjoutClientControler ajoutClientControler;
    private AjoutClient viewAjoutClient;
    private IMediator ajoutClientMediator;

    private AjoutClientControler() {
    }

    public static synchronized AjoutClientControler getInstance() {
        if (ajoutClientControler == null) {
            ajoutClientControler = new AjoutClientControler();
        }
        return ajoutClientControler;
    }

    public static synchronized AjoutClientControler getObserver() {
        if (ajoutClientControler == null) {
            ajoutClientControler = new AjoutClientControler();
        }
        return ajoutClientControler;
    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.ajoutClientMediator = mediator;
        }
    }

    @Override
    public void initView() {
        viewAjoutClient =  new AjoutClient(null, true);  
        
        viewAjoutClient.setVisible(true);
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
    public boolean ValiderChangement() {
        // Valide l'ajout d'un client.
        Client newCli = new Client();
        GetValuesDataBase ddb = new GetValuesDataBase();
                
        String nom = viewAjoutClient.getNomTextField().getText();
        String prenom = viewAjoutClient.getPrenomTextField().getText();
        String adresse1 = viewAjoutClient.getAdresse1TextField().getText();
        String adresse2 = viewAjoutClient.getAdresse2TextField().getText();
        String codePostal =  viewAjoutClient.getCodePostalTextField().getText();
        String ville = viewAjoutClient.getVilleTextField().getText();
        
        newCli.setNomClient(nom);
        newCli.setPrenomClient(prenom);
        newCli.setAdresse1(adresse1);
        newCli.setAdresse2(adresse2);
        newCli.setCodePostal(codePostal);
        newCli.setVille(ville);        
                
        return ddb.addClient(newCli);
        
    }

    @Override
    public void AnnulerChangement() {
        //Annul les changement et remet les hcamps à vide 
    }

    public void FermerAjout() {
        viewAjoutClient.setVisible(false);
    }
}
