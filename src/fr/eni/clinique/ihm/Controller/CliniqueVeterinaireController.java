/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.dao.GetValuesDataBase;
import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.Controller.Mediator.IControler;
import fr.eni.clinique.ihm.Controller.Mediator.IMediator;
import fr.eni.clinique.ihm.GestionPersonnel.GestionPersonnel;
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
public class CliniqueVeterinaireController implements IControler, ICliniqueVeterinaireObserver {

    private GetValuesDataBase getPersonnel = new GetValuesDataBase();
    private CliniqueVeterinaire viewCliniqueVeterinaire;
    private GestionPersonnel viewGestionPersonnel;
    private static CliniqueVeterinaireController cliniqueVeterinaireController;
    private IMediator cliniqueVeterinaireIMediator;
    private List<Personnel> listPersonnel = new ArrayList<>();
    private JTable tablePersonnel;

    public CliniqueVeterinaireController() {
        
    }

    public static synchronized CliniqueVeterinaireController getInstance() {
        if (cliniqueVeterinaireController == null) {
            cliniqueVeterinaireController = new CliniqueVeterinaireController();
        }
        return cliniqueVeterinaireController;
    }

    public static synchronized CliniqueVeterinaireController getObserver() {
        if (cliniqueVeterinaireController == null) {
            cliniqueVeterinaireController = new CliniqueVeterinaireController();
        }
        return cliniqueVeterinaireController;
    }

    @Override
    public void AfficherGestionClient() {
        //Affiche le page de gestion de client. 
    }

    @Override
    public void Deconnexion() {
        //Deconnexion de l'application.

    }

    @Override
    public void AfficherGestionPersonnel() {
        
        Afficher();
    }

    private void Afficher(){
        
        cliniqueVeterinaireIMediator.AfficherGestionPersonnel();
//        try {
//            listPersonnel = getPersonnel.getAll();
//            FilleTable(listPersonnel);
//        } catch (Exception ex) {
//            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
    }
    
//    private void FilleTable(List<Personnel> listPersonnel) {
//        try {
//            DefaultTableModel model = (DefaultTableModel) tablePersonnel.getModel();
//
//            model.setRowCount(0);
//
//            for (Personnel personnel : listPersonnel) {
//                model.addRow(new Object[]{
//                    personnel.getNom(),
//                    personnel.getRole(),
//                    changeMDP(personnel.getMotDePase())
//                });
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(RechercheClientControler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private String changeMDP(String mdp)
//    {
//        String mdpEtoile = "";
//        for(int i = 0; i<mdp.length(); i++)
//        {
//            mdpEtoile += "*";
//        }
//        return mdpEtoile;
//    }
    
    
    @Override
    public void AfficherAgenda() {
        //Affiche la page Agenda.
    }

    @Override
    public void AfficherPriseRDV() {
        //Affiche la page des prise de rendez vous.
    }

    @Override
    public void Fermer() {
        //Fermer l'application.
    }

    @Override
    public void setMediator(IMediator mediator) {
        if (mediator != null) {
            this.cliniqueVeterinaireIMediator = mediator;
        }
    }

    @Override
    public JPanel getPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JDialog getDialogue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JFrame getFrame() {
       return viewCliniqueVeterinaire.getFrame();
    }

    @Override
    public void initView() {
        viewCliniqueVeterinaire = new CliniqueVeterinaire();
        viewCliniqueVeterinaire.setVisible(true);
    }
    
    public void setPanelContainer(JPanel panel)
    {
        viewCliniqueVeterinaire.setPanelContainer(panel);
    }

}
