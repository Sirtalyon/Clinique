package fr.eni.clinique.ihm;

import javax.swing.*;
import java.awt.*;

public class ConnexionPage extends JFrame {
    /*
        Declaration variable
     */
    private JPanel panel;
    private JTextField passwordField;
    private JTextField nameField;
    private JLabel nameLabel;
    private JLabel paswordLabel;
    private JButton validateButton;


    /*
    Constructeur de la classe Connexion Page.
     */
    public ConnexionPage() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(100, 100, 500, 500);

        panel = new JPanel();

        setContentPane(panel);

        panel.add(buildContentPane());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ConnexionPage ecran = new ConnexionPage();
                ecran.setVisible(true);
            }
        });
    }

    /*
    Recuperation des donner dans les champs de l'écran.
     */
    public JTextField getPasswordField() {
        return nameField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    /*
        Affichage des champs de l'écran.
     */
    private JPanel buildContentPane() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        nameField = new JTextField();
        passwordField = new JTextField();
        nameLabel = new JLabel("Nom");
        paswordLabel = new JLabel("Mot de passe");
        validateButton = new JButton(new GetAction(this,"Valider"));

        nameField.setColumns(30);
        passwordField.setColumns(10);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(paswordLabel);
        panel.add(passwordField);
        panel.add(validateButton);

        return panel;
    }

}
