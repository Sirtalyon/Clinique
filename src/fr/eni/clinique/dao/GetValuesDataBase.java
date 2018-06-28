/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.dao;

import fr.eni.clinique.bo.Personnel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class GetValuesDataBase {

    public boolean getIdentifiant(String user, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && password != null) {
                stm = connect.prepareStatement("select * from Personnels where Nom='" + user + "' and MotPasse='" + password + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String getCodeEmp(String user, String role) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && role != null) {
                stm = connect.prepareStatement("SELECT CodePers FROM Personnels WHERE Nom='" + user + "' and Role='" + role + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("CodePers");
                } else {
                    return "";
                }
            } else {
                return "";
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    public String getRole(String user, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && password != null) {
                stm = connect.prepareStatement("select Role from Personnels where Nom='" + user + "' and MotPasse='" + password + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("Role");

                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String getPassword(String CodeEmp) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (CodeEmp != null) {
                stm = connect.prepareStatement("select MotPasse from Personnels where CodePers='" + CodeEmp + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("MotPasse");

                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    

    public List<Personnel> getAll() {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Personnel> persos = new ArrayList<>();
        Personnel perso = new Personnel();
        try {

            stm = connect.prepareStatement("select * from Personnels");
            rs = stm.executeQuery();
            while (rs.next()) {

                perso = new Personnel();
                perso.setNom(rs.getString("Nom"));
                perso.setRole(rs.getString("Role"));
                String motDePasse = "";
                for(int i = 0; i<rs.getString("MotPasse").length(); i++)
                {
                    motDePasse += "*";
                }
                perso.setMotDePase(motDePasse);
                perso.setArchive(rs.getBoolean("Archive"));
                persos.add(perso);

            }
            return persos;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean addPersonnel(String user, String role, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (user != null && password != null && role != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("INSERT INTO Personnels (Nom, Role, MotPasse, Archive) VALUES ('" + user + "', '" + role + "', '" + password + "', 'false')");
                if (rs == 1) {
                    return true;
                } else {                    
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean archivePersonnel(String codePers) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (codePers != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("UPDATE Personnels SET Archive='true' WHERE CodePers='" + codePers + "'");
                if (rs == 1) {
                    return true;
                } else {                    
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
