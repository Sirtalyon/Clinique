/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.dao.GetValuesDataBase;

/**
 *
 * @author plaurent2017
 */
public class ConnexionPageBuild extends javax.swing.JFrame {

    private String nameValue;
    private String passWordValue;
    private String getRoleUser;
    private boolean isAdmin;
    private boolean isVeterinaire;
    private boolean isSecretaire;
    private boolean isAssistant;

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getPassWordValue() {
        return passWordValue;
    }

    public void setPassWordValue(String passWordValue) {
        this.passWordValue = passWordValue;
    }
    private boolean getIdUser;

    /**
     * Creates new form ConnexionPageBuild
     */
    public ConnexionPageBuild() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        nameTextField.setName("NameField"); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        PassWordTextField.setName("PassWordTextField"); // NOI18N
        PassWordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassWordTextFieldActionPerformed(evt);
            }
        });

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
        GetValuesDataBase getDatabase = new GetValuesDataBase();
        setNameValue(nameTextField.getText());
        setPassWordValue(PassWordTextField.getText());
        getIdUser = getDatabase.getIdentifiant(getNameValue(), getPassWordValue());
        getRoleUser = getDatabase.getRole(getNameValue(), getPassWordValue());
       

        if (getIdUser) {
            switch(getRoleUser)
            {
                case EnumRole.ADM:
                    isAdmin = true;
                    break;
                case EnumRole.AST:
                    isAssistant = true;
                    break;
                case EnumRole.SEC:
                    isSecretaire = true;
                    break;
                case EnumRole.VET:
                    isVeterinaire = true;
                    break;
            }
            this.dispose();
            new CliniqueVeterinaire().setVisible(true);
            
            
        }else
        {
            nameTextField.setText("testNOk");
        }
    }//GEN-LAST:event_validateButonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
        setNameValue(nameTextField.getText());
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void PassWordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassWordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassWordTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ConnexionPageBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnexionPageBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnexionPageBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnexionPageBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnexionPageBuild().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassWordTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passeWordLabel;
    private javax.swing.JButton validateButon;
    // End of variables declaration//GEN-END:variables
}
