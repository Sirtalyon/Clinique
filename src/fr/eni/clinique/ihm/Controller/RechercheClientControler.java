/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Client;
import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionClient.IRechercheClientObserver;
import fr.eni.clinique.ihm.GestionClient.RechercheClient;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author plaurent2017
 */
public class RechercheClientControler implements IControler, IRechercheClientObserver {

    private GetValuesDataBase ddbRechercheCli = new GetValuesDataBase();
    private RechercheClient viewRechercheClient;
    private static RechercheClientControler rechercheClientControler;
    private IMediator rechercheClientMediator;
    private List<Client> listClient = new ArrayList<>();
    private JTable tableClient;

    public RechercheClientControler() {
    }

    @Override
    public void initView() {
        viewRechercheClient = new RechercheClient(rechercheClientMediator.getFrameVeterinaire(), true);
        viewRechercheClient.setVisible(true);
    }

    @Override
    public void RechercheClientBouton() {
        Rechercher();
    }

    private void Rechercher() {
        try {
            listClient = ddbRechercheCli.rechercheClient(viewRechercheClient.getRechercheTextField().getText());
            FilleTable(listClient);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void FilleTable(List<Client> listClient) {
        try {
            DefaultTableModel model = (DefaultTableModel) viewRechercheClient.getTableClient().getModel();

            model.setRowCount(0);

            for (Client client : listClient) {
                model.addRow(new Object[]{
                    client.getCodeClient(),
                    client.getNomClient(),
                    client.getPrenomClient(),
                    client.getCodePostal(),
                    client.getVille()
                });
            }
            viewRechercheClient.getTableClient().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static synchronized RechercheClientControler getInstance() {
        if (rechercheClientControler == null) {
            rechercheClientControler = new RechercheClientControler();
        }
        return rechercheClientControler;
    }

    public static synchronized RechercheClientControler getObserver() {
        if (rechercheClientControler == null) {
            rechercheClientControler = new RechercheClientControler();
        }
        return rechercheClientControler;
    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.rechercheClientMediator = mediator;
        }
    }

    @Override
    public JPanel getPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JDialog getDialogue() {
        return viewRechercheClient.getDialog();
    }

    private Client InfoClient() {
        Client cli = new Client();
        int row = viewRechercheClient.getTableClient().getSelectedRow();
        int code = (int) viewRechercheClient.getTableClient().getModel().getValueAt(row, 0);
        String nom = viewRechercheClient.getTableClient().getModel().getValueAt(row, 1).toString();
        String prenom = viewRechercheClient.getTableClient().getModel().getValueAt(row, 2).toString();
        String codePostal = viewRechercheClient.getTableClient().getModel().getValueAt(row, 3).toString();
        String ville = viewRechercheClient.getTableClient().getModel().getValueAt(row, 4).toString();
        if (nom == null) {
            nom = new String();
        }
        if (prenom == null) {
            prenom = new String();
        }
        if (codePostal == null) {
            codePostal = new String();
        }
        if (ville == null) {
            ville = new String();
        }
        cli.setCodeClient(code);
        cli.setNomClient(nom);
        cli.setPrenomClient(prenom);
        cli.setCodePostal(codePostal);
        cli.setVille(ville);
        
        return cli;
    }

    @Override
    public void AfficherClientInfoFramePrincipal() {

        rechercheClientMediator.AfficherInfoRechercheClient(this.InfoClient());

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
