package fr.eni.clinique.dao;

import fr.eni.clinique.properties.Configuration;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionDataBase {

    public ConnexionDataBase() {
        connectionToDataBase();
    }

    Connection co = null;

    public Connection getCo() {
        return co;
    }
    
    public void connectionToDataBase(){
        try {
            Class.forName(Configuration.getValue("driver"));
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur pendant le chargement du pilote");
        }
        String url = Configuration.getValue("url");
        String user = Configuration.getValue("user");
        String password = Configuration.getValue("password");
        try {
            co = DriverManager.getConnection(url, user, password);
            if (co != null) {
                System.out.println("OK");
            }
        } catch (SQLException e) {
            System.out.println("Erreur pendant la connexion");
        }

    }
}
