/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionPersonnel.GestionPersonnel;
import fr.eni.clinique.ihm.GestionPersonnel.IGestionPersonnelObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrateur
 */
public class GestionPersonnelCOntroller implements IControler, IGestionPersonnelObserver{
    private GestionPersonnel viewGestionPersonnel;
    private static GestionPersonnelCOntroller gestionPersonnelControler;
    private IMediator gestionPersonnelMediator;
    private List<Personnel> listPersonnel = new ArrayList<>();
    private GetValuesDataBase getPersonnel = new GetValuesDataBase();

    private GestionPersonnelCOntroller() {
    }
    
    public static synchronized GestionPersonnelCOntroller getInstance() {
        if (gestionPersonnelControler == null) {
            gestionPersonnelControler = new GestionPersonnelCOntroller();
        }
        return gestionPersonnelControler;
    }

    public static synchronized GestionPersonnelCOntroller getObserver() {
        if (gestionPersonnelControler == null) {
            gestionPersonnelControler = new GestionPersonnelCOntroller();
        }
        return gestionPersonnelControler;
    }

    
    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.gestionPersonnelMediator = mediator;
        }
    }

    @Override
    public JPanel getPanel() {
        return viewGestionPersonnel;
    }

    @Override
    public JDialog getDialogue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherPersonnel() {
    }

    private void Afficher(){
        try {
            //String result = session.getRechercheClientFrameSession().getRechercheTextField().getText();
            //listClient = rechercheClient.rechercheClient(result);
            listPersonnel = getPersonnel.getAll();
            FilleTable(listPersonnel);
        } catch (Exception ex) {
            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void FilleTable(List<Personnel> listPersonnel) {
        try {
            DefaultTableModel model = (DefaultTableModel) viewGestionPersonnel.getTablePersonnel().getModel();

            model.setRowCount(0);

            for (Personnel personnel : listPersonnel) {
                model.addRow(new Object[]{
                    personnel.getNom(),
                    personnel.getRole(),
                    changeMDP(personnel.getMotDePase())
                });
            }
            viewGestionPersonnel.getTablePersonnel().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GestionPersonnelCOntroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String changeMDP(String mdp)
    {
        String mdpEtoile = "";
        for(int i = 0; i<mdp.length(); i++)
        {
            mdpEtoile += "*";
        }
        return mdpEtoile;
    }
    
    @Override
    public void AjouterPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SupprimerPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ReinitPasswordPersonnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initView() {
        viewGestionPersonnel = new GestionPersonnel();
        //   Afficher();
    }
    
}
