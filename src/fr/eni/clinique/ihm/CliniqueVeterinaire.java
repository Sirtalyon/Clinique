/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import fr.eni.clinique.ihm.GestionPersonnel.GestionPersonnel;
import fr.eni.clinique.ihm.GestionClient.ClientPanel;
import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.ihm.GestionClient.IClientObserver;
import fr.eni.clinique.ihm.Controller.ICliniqueVeterinaireObserver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author plaurent2017
 */
public class CliniqueVeterinaire extends javax.swing.JFrame implements IObservable<ICliniqueVeterinaireObserver> {

    private List<ICliniqueVeterinaireObserver> observers = new ArrayList();

    /**
     * Creates new form CliniqueVeterinaire
     */
    public CliniqueVeterinaire() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        ClinqueVeterinaire = new javax.swing.JMenuBar();
        Fichier = new javax.swing.JMenu();
        Deconnexion = new javax.swing.JMenuItem();
        Fermer = new javax.swing.JMenuItem();
        GestionRDV = new javax.swing.JMenu();
        PriseRDV = new javax.swing.JMenuItem();
        GestionClient = new javax.swing.JMenuItem();
        Agenda = new javax.swing.JMenu();
        GestionPersonnel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinique Veterinaire");
        setName("CliniqueVeterinaire"); // NOI18N

        PanelGeneral.setMinimumSize(new java.awt.Dimension(32767, 32767));

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        ClinqueVeterinaire.setToolTipText("");

        Fichier.setText("Fichier");

        Deconnexion.setText("Déconnexion");
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });
        Fichier.add(Deconnexion);

        Fermer.setText("Fermer");
        Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermerActionPerformed(evt);
            }
        });
        Fichier.add(Fermer);

        ClinqueVeterinaire.add(Fichier);

        GestionRDV.setText("Gestion des rendez vous");

        PriseRDV.setText("Prise de rendez vous");
        PriseRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriseRDVActionPerformed(evt);
            }
        });
        GestionRDV.add(PriseRDV);

        GestionClient.setText("Gestion des clients");
        GestionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionClientActionPerformed(evt);
            }
        });
        GestionRDV.add(GestionClient);

        ClinqueVeterinaire.add(GestionRDV);

        Agenda.setText("Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        ClinqueVeterinaire.add(Agenda);

        GestionPersonnel.setText("Gestion du personnel");
        GestionPersonnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionPersonnelActionPerformed(evt);
            }
        });
        ClinqueVeterinaire.add(GestionPersonnel);

        setJMenuBar(ClinqueVeterinaire);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void GestionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionClientActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.AfficherGestionClient();
        }
    }//GEN-LAST:event_GestionClientActionPerformed

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.Deconnexion();
        }
    }//GEN-LAST:event_DeconnexionActionPerformed

    private void GestionPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPersonnelActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.AfficherGestionPersonnel();
        }
    }//GEN-LAST:event_GestionPersonnelActionPerformed

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.AfficherAgenda();
        }
    }//GEN-LAST:event_AgendaActionPerformed

    private void PriseRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriseRDVActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.AfficherPriseRDV();
        }
    }//GEN-LAST:event_PriseRDVActionPerformed

    private void FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermerActionPerformed
        for (ICliniqueVeterinaireObserver obs : observers) {
            obs.Fermer();
        }
    }//GEN-LAST:event_FermerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agenda;
    private javax.swing.JMenuBar ClinqueVeterinaire;
    private javax.swing.JMenuItem Deconnexion;
    private javax.swing.JMenuItem Fermer;
    private javax.swing.JMenu Fichier;
    private javax.swing.JMenuItem GestionClient;
    private javax.swing.JMenu GestionPersonnel;
    private javax.swing.JMenu GestionRDV;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JMenuItem PriseRDV;
    // End of variables declaration//GEN-END:variables

    @Override
    public void registreObserver(ICliniqueVeterinaireObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregistreObserver(ICliniqueVeterinaireObserver observer) {
        this.observers.remove(observer);
    }

    public JMenu getAgenda() {
        return Agenda;
    }

    public void setAgenda(JMenu Agenda) {
        this.Agenda = Agenda;
    }

    public JMenuItem getDeconnexion() {
        return Deconnexion;
    }

    public void setDeconnexion(JMenuItem Deconnexion) {
        this.Deconnexion = Deconnexion;
    }

    public JMenuItem getFermer() {
        return Fermer;
    }

    public void setFermer(JMenuItem Fermer) {
        this.Fermer = Fermer;
    }

    public JMenu getFichier() {
        return Fichier;
    }

    public void setFichier(JMenu Fichier) {
        this.Fichier = Fichier;
    }

    public JMenuItem getGestionClient() {
        return GestionClient;
    }

    public void setGestionClient(JMenuItem GestionClient) {
        this.GestionClient = GestionClient;
    }

    public JMenu getGestionPersonnel() {
        return GestionPersonnel;
    }

    public void setGestionPersonnel(JMenu GestionPersonnel) {
        this.GestionPersonnel = GestionPersonnel;
    }

    public JMenu getGestionRDV() {
        return GestionRDV;
    }

    public void setGestionRDV(JMenu GestionRDV) {
        this.GestionRDV = GestionRDV;
    }

    public JPanel getPanelGeneral() {
        return PanelGeneral;
    }

    public void setPanelGeneral(JPanel PanelGeneral) {
        this.PanelGeneral = PanelGeneral;
    }

    public JMenuItem getPriseRDV() {
        return PriseRDV;
    }

    public void setPriseRDV(JMenuItem PriseRDV) {
        this.PriseRDV = PriseRDV;
    }
    public JFrame getFrame() {
        return this;
    }    
}
