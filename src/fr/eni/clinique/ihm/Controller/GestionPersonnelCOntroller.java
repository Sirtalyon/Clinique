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
import javax.swing.JFrame;
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
        Afficher();
    }

    private void Afficher(){
        try {
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
                if(!personnel.isArchive())
                {
                    model.addRow(new Object[]{
                        personnel.getNom(),
                        personnel.getRole(),
                        changeMDP(personnel.getMotDePase())
                    });
                }
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
        gestionPersonnelMediator.AjoutPersonnel();
    }

    @Override
    public void SupprimerPersonnel() {
        boolean isSupp = SupprPersonnel();
        if(isSupp)
        {
            Afficher();
        }
    }

    private Boolean SupprPersonnel(){
        GetValuesDataBase get = new GetValuesDataBase();
        int row = viewGestionPersonnel.getTablePersonnel().getSelectedRow();
        String nom = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 0).toString();
        String role = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 1).toString();
        String password = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 2).toString();
        String codeEmp = get.getCodeEmp(nom, role);
        boolean isSupp = get.archivePersonnel(codeEmp);
        if(isSupp)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    @Override
    public void ReinitPasswordPersonnel() {
        GetValuesDataBase get = new GetValuesDataBase();
        int row = viewGestionPersonnel.getTablePersonnel().getSelectedRow();
        String nom = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 0).toString();
        String role = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 1).toString();
        String codeEmp = get.getCodeEmp(nom, role);
        String password = get.getPassword(codeEmp);
        gestionPersonnelMediator.ModifierMotDePasse(password, codeEmp);
    }

    private void reinit(){
        GetValuesDataBase get = new GetValuesDataBase();
        int row = viewGestionPersonnel.getTablePersonnel().getSelectedRow();
        String nom = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 0).toString();
        String role = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 1).toString();
        String password = viewGestionPersonnel.getTablePersonnel().getModel().getValueAt(row, 2).toString();
        String codeEmp = get.getCodeEmp(nom, role);
    }
    
    @Override
    public void initView() {
        viewGestionPersonnel = new GestionPersonnel();
        Afficher();
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
