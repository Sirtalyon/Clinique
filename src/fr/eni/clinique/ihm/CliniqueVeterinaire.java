/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import fr.eni.clinique.dao.EnumRole;

/**
 *
 * @author plaurent2017
 */
public class CliniqueVeterinaire extends javax.swing.JFrame {

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

        PanelGestionPersonnel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonDel = new javax.swing.JButton();
        buttonReinit = new javax.swing.JButton();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Rôle", "Mot de Passe"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buttonAdd.setText("Ajouter");

        buttonDel.setText("Supprimer");

        buttonReinit.setText("Réinitialiser");
        buttonReinit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReinitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGestionPersonnelLayout = new javax.swing.GroupLayout(PanelGestionPersonnel);
        PanelGestionPersonnel.setLayout(PanelGestionPersonnelLayout);
        PanelGestionPersonnelLayout.setHorizontalGroup(
            PanelGestionPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionPersonnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGestionPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(PanelGestionPersonnelLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReinit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelGestionPersonnelLayout.setVerticalGroup(
            PanelGestionPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestionPersonnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGestionPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(buttonReinit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
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
        Fichier.add(Fermer);

        ClinqueVeterinaire.add(Fichier);

        GestionRDV.setText("Gestion des rendez vous");

        PriseRDV.setText("Prise de rendez vous");
        GestionRDV.add(PriseRDV);

        GestionClient.setText("Gestion des clients");
        GestionRDV.add(GestionClient);

        ClinqueVeterinaire.add(GestionRDV);

        Agenda.setText("Agenda");
        ClinqueVeterinaire.add(Agenda);

        GestionPersonnel.setText("Gestion du personnel");
        ClinqueVeterinaire.add(GestionPersonnel);

        setJMenuBar(ClinqueVeterinaire);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestionPersonnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestionPersonnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeconnexionActionPerformed


    private void buttonReinitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReinitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonReinitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CliniqueVeterinaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CliniqueVeterinaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CliniqueVeterinaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CliniqueVeterinaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void initFrame(String role) {
        AfficherEcranRole(role);
        this.setVisible(true);
    }

    public void AfficherEcranRole(String role) {
        switch (role) {
            case EnumRole.ADM:
                break;
            case EnumRole.AST:
                Agenda.setVisible(false);
                GestionPersonnel.setVisible(false);
                break;
            case EnumRole.SEC:
                GestionPersonnel.setVisible(false);
                break;
            case EnumRole.VET:
                GestionPersonnel.setVisible(false);
                break;

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agenda;
    private javax.swing.JMenuBar ClinqueVeterinaire;
    private javax.swing.JMenuItem Deconnexion;
    private javax.swing.JMenuItem Fermer;
    private javax.swing.JMenu Fichier;
    private javax.swing.JMenuItem GestionClient;
    private javax.swing.JMenu GestionPersonnel;
    private javax.swing.JMenu GestionRDV;
    private javax.swing.JPanel PanelGestionPersonnel;
    private javax.swing.JMenuItem PriseRDV;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDel;
    private javax.swing.JButton buttonReinit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
