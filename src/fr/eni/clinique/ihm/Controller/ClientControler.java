/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Animal;
import fr.eni.clinique.bo.Client;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionClient.ClientPanel;
import fr.eni.clinique.ihm.GestionClient.IClientObserver;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author plaurent2017
 */
public class ClientControler implements IControler, IClientObserver {

    private static ClientControler clientControler;
    private ClientPanel viewCLient;
    private IMediator clientMediator;

    private void ClientControler() {
    }

    @Override
    public void initView() {
        viewCLient = new ClientPanel();
    }

    public static synchronized ClientControler getInstance() {
        if (clientControler == null) {
            clientControler = new ClientControler();
        }
        return clientControler;
    }

    public static synchronized ClientControler getObserver() {
        if (clientControler == null) {
            clientControler = new ClientControler();
        }
        return clientControler;
    }

    @Override
    public void AfficherRecherche() {
        clientMediator.AfficherRechercheClient();
    }

    @Override
    public void AjoutClient() {
        clientMediator.AfficherAjoutClient();
    }

    @Override
    public void AjoutAnimal(String nomClient) {
        clientMediator.AjouterAnimal(nomClient);
    }

    @Override
    public void SupprimerClient() {
        //Supprimer CLient.
    }

    @Override
    public void ValiderChangement() {
        //Validet Changement.
    }

    @Override
    public void AnnulerChangement() {
        //Annul Changement.
    }

    @Override
    public void EditerAnimal() {
        //Editer Animal.
    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.clientMediator = mediator;
        }
    }

    @Override
    public JPanel getPanel() {
        return viewCLient;
    }

    @Override
    public JDialog getDialogue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNomCli(String nomCli) {
        viewCLient.getNomTextField().setText(nomCli);
    }

    public void setPrenomCli(String prenomCli) {
        viewCLient.getPrenomTextField().setText(prenomCli);
    }

    public void setCodeCli(int codeCli) {
        viewCLient.getCodeTextField().setText(String.valueOf(codeCli));
    }

    public void setVilleCli(String villeCli) {
        viewCLient.getVilleTextField().setText(villeCli);
    }

    public void setCodePostalNomCli(String codePostalCli) {
        viewCLient.getCodePostalTextField().setText(codePostalCli);
    }
    
    public void setTableauAnimal(List<Animal> animaux) {
        remplirTaleauAnimal(animaux);
    }
    
    private void remplirTaleauAnimal(List<Animal> animaux) {
        try {
            FilleTable(animaux);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void FilleTable(List<Animal> animaux) {
        try {
            DefaultTableModel model = (DefaultTableModel) viewCLient.getAnimalTable().getModel();

            model.setRowCount(0);

            for (Animal animal : animaux) {
                model.addRow(new Object[]{
                    animal.getCodeAnimal(),
                    animal.getNomAnimal(),
                    animal.getSexe(),
                    animal.getCouleur(),
                    animal.getRace(),
                    animal.getEspece(),
                    animal.getTatouage()
                });
            }
            viewCLient.getAnimalTable().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public JFrame getFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initView(String password, String codeEmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initView(String nomClient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
