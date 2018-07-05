/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.GestionClient;

import fr.eni.clinique.ihm.Controller.RechercheClientControler;
import fr.eni.clinique.ihm.IObservable;
import java.util.ArrayList;
import java.util.List;
import javax.accessibility.AccessibleContext;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author plaurent2017
 */
public class RechercheClient extends javax.swing.JDialog implements IObservable<IRechercheClientObserver> {

    private List<IRechercheClientObserver> observers = new ArrayList();

    /**
     * Creates new form RechercheClient
     */
    public RechercheClient(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        rechercheTextField.requestFocus();
        this.registreObserver(RechercheClientControler.getObserver());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recherchePanel = new javax.swing.JPanel();
        rechercheBouton = new javax.swing.JButton();
        rechercheTextField = new javax.swing.JTextField();
        tableClientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClient = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rechercheBouton.setIcon(IconFontSwing.buildIcon(FontAwesome.SEARCH,15));
        rechercheBouton.setText("Rechercher");
        rechercheBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recherchePanelLayout = new javax.swing.GroupLayout(recherchePanel);
        recherchePanel.setLayout(recherchePanelLayout);
        recherchePanelLayout.setHorizontalGroup(
            recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recherchePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rechercheTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rechercheBouton)
                .addContainerGap())
        );
        recherchePanelLayout.setVerticalGroup(
            recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recherchePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rechercheBouton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(rechercheTextField))
                .addContainerGap())
        );

        TableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodeClient", "Nom", "Prenom", "Code Postal", "Ville"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableClient.removeColumn(TableClient.getColumnModel().getColumn(0));
        TableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableClient);

        javax.swing.GroupLayout tableClientPanelLayout = new javax.swing.GroupLayout(tableClientPanel);
        tableClientPanel.setLayout(tableClientPanelLayout);
        tableClientPanelLayout.setHorizontalGroup(
            tableClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tableClientPanelLayout.setVerticalGroup(
            tableClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(recherchePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recherchePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheBoutonActionPerformed
        for (IRechercheClientObserver obs : observers) {
            obs.RechercheClientBouton();
        }
    }//GEN-LAST:event_rechercheBoutonActionPerformed

    private void TableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClientMouseClicked
        for (IRechercheClientObserver obs : observers) {
            obs.AfficherClientInfoFramePrincipal();
        }
    }//GEN-LAST:event_TableClientMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableClient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rechercheBouton;
    private javax.swing.JPanel recherchePanel;
    private javax.swing.JTextField rechercheTextField;
    private javax.swing.JPanel tableClientPanel;
    // End of variables declaration//GEN-END:variables

    public JTable getTableClient() {
        return TableClient;
    }

    public void setTableClient(JTable TableClient) {
        this.TableClient = TableClient;
    }

    public JTextField getRechercheTextField() {
        return rechercheTextField;
    }

    public void setRechercheTextField(JTextField rechercheTextField) {
        this.rechercheTextField = rechercheTextField;
    }

    public JPanel getTableClientPanel() {
        return tableClientPanel;
    }

    public void setTableClientPanel(JPanel tableClientPanel) {
        this.tableClientPanel = tableClientPanel;
    }

    public JDialog getDialog() {
        return this;
    }

    @Override
    public void registreObserver(IRechercheClientObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregistreObserver(IRechercheClientObserver observer) {
        this.observers.remove(observer);
    }

}
