/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.GetValuesDataBase;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrateur
 */
public class GestionPersonnel extends javax.swing.JPanel {

    PersonnelAdd personnel;

    /**
     * Creates new form GestionPersonnel
     */
    public GestionPersonnel() {
        initFrame();
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
        TablePersonnel = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonDel = new javax.swing.JButton();
        buttonReinit = new javax.swing.JButton();

        TablePersonnel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablePersonnel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Rôle", "Mot de Passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablePersonnel);

        buttonAdd.setText("Ajouter");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonDel.setText("Supprimer");
        buttonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestionPersonnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestionPersonnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        personnel.initFrame();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonReinitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReinitActionPerformed
        // TODO add your handling code here:
        
        GetValuesDataBase get = new GetValuesDataBase();
        int row = TablePersonnel.getSelectedRow();
        String nom = TablePersonnel.getModel().getValueAt(row, 0).toString();
        String role = TablePersonnel.getModel().getValueAt(row, 1).toString();
        String password = TablePersonnel.getModel().getValueAt(row, 2).toString();
        String codeEmp = get.getCodeEmp(nom, role);
        PersonnelReinitPassword init = new PersonnelReinitPassword();
        init.initFrame(codeEmp);
    }//GEN-LAST:event_buttonReinitActionPerformed

    private void buttonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelActionPerformed
        GetValuesDataBase get = new GetValuesDataBase();
        int row = TablePersonnel.getSelectedRow();
        String nom = TablePersonnel.getModel().getValueAt(row, 0).toString();
        String role = TablePersonnel.getModel().getValueAt(row, 1).toString();
        String password = TablePersonnel.getModel().getValueAt(row, 2).toString();
        String codeEmp = get.getCodeEmp(nom, role);
        boolean isSupp = get.archivePersonnel(codeEmp);
        if (isSupp) {
            this.initFrame();
        }
    }//GEN-LAST:event_buttonDelActionPerformed

    public void initFrame() {
        personnel = new PersonnelAdd();
        initComponents();
        GetValuesDataBase getall = new GetValuesDataBase();
        List<Personnel> persos = new ArrayList<>();
        persos = getall.getAll();
        DefaultTableModel tm = new DefaultTableModel(persos.size(), 3);
        TablePersonnel.setModel(tm);
        TablePersonnel.getColumnModel().getColumn(0).setHeaderValue("Nom");
        TablePersonnel.getColumnModel().getColumn(1).setHeaderValue("Rôle");
        TablePersonnel.getColumnModel().getColumn(2).setHeaderValue("Mot de Passe");
        TablePersonnel.getTableHeader().repaint();

        int i = 0;
        for (Personnel perso : persos) {
            if (!perso.isArchive()) {
                TablePersonnel.setValueAt(perso.getNom(), i, 0);
                TablePersonnel.setValueAt(perso.getRole(), i, 1);
                TablePersonnel.setValueAt(perso.getMotDePase(), i, 2);
                i++;
            }

        }
        tm.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGestionPersonnel;
    private javax.swing.JTable TablePersonnel;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDel;
    private javax.swing.JButton buttonReinit;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
