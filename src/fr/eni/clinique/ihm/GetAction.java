package fr.eni.clinique.ihm;

import javafx.event.ActionEvent;

import javax.swing.*;

public class GetAction extends AbstractAction {
    private ConnexionPage fenetre;

    public GetAction(ConnexionPage fenetre, String texte) {
        super(texte);

        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String nameField = fenetre.getNameField().getText();
        fenetre.getNameField().setText(nameField);

        String passwordField = fenetre.getPasswordField().getText();
        fenetre.getPasswordField().setText(passwordField);
    }
}
