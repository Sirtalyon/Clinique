/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Client;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.GestionClient.IRechercheClientObserver;
import fr.eni.clinique.ihm.GestionClient.RechercheClient;
import fr.eni.clinique.ihm.GestionClient.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author plaurent2017
 */
public class RechercheClientControler implements IRechercheClientObserver {

    private RechercheClient viewRechercheClient;
    private GetValuesDataBase rechercheClient = new GetValuesDataBase();
    private static RechercheClientControler rechercheClientControler;
    private List<Client> listClient = new ArrayList<>();
    private JTable tableClient;

        Session session;
    
    public RechercheClientControler() {
        session = Session.getSession();
    }

    @Override
    public void RechercheClientBouton() {
        Rechercher();
    }

    private void Rechercher() {
        try {
            String result = session.getRechercheClientFrameSession().getRechercheTextField().getText();
            listClient = rechercheClient.rechercheClient(result);
            FilleTable(listClient);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void FilleTable(List<Client> listClient) {
        try {
            tableClient = session.getRechercheClientFrameSession().getTableClient();
            DefaultTableModel model = (DefaultTableModel) tableClient.getModel();
            
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
}
