/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import fr.eni.clinique.ihm.Controller.IConnexionObserver;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author plaurent2017
 */
public class Connexion extends javax.swing.JFrame implements IObservable<IConnexionObserver> {

    private List<IConnexionObserver> observers = new ArrayList();

    public Connexion() throws HeadlessException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        passeWordLabel = new javax.swing.JLabel();
        validateButon = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        PassWordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        nameLabel.setText("Nom");

        passeWordLabel.setText("Mot de passe");

        validateButon.setText("Valider");
        validateButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButonActionPerformed(evt);
            }
        });

        nameTextField.setText("BOSAPIN");
        nameTextField.setName("NameField"); // NOI18N

        PassWordTextField.setText("admin");
        PassWordTextField.setName("PassWordTextField"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(validateButon)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(passeWordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(PassWordTextField))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passeWordLabel)
                    .addComponent(PassWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateButon)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButonActionPerformed

        for (IConnexionObserver obs : observers) {
            obs.ValiderConnexion();
        }
    }//GEN-LAST:event_validateButonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassWordTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passeWordLabel;
    private javax.swing.JButton validateButon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void registreObserver(IConnexionObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregistreObserver(IConnexionObserver observer) {
        this.observers.remove(observer);
    }

    public JPasswordField getPassWordTextField() {
        return PassWordTextField;
    }

    public void setPassWordTextField(JPasswordField PassWordTextField) {
        this.PassWordTextField = PassWordTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }
}
