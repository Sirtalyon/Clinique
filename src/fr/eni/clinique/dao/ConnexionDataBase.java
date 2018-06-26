package fr.eni.clinique.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionDataBase {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur pendant le chargement du pilote");
        }
        Connection co = null;
        try{
            co = DriverManager.getConnection("jdbc:sqlserver://148-UC48-08;databaseName=master; user=sa;password=Pa$$w0rd;");
            if(co != null)
            {
                System.out.println("OK");
            }
        }catch (SQLException e)
        {
            System.out.println("Erreur pendant la connexion");
        }



    }
}
