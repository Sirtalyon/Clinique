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
                perso.setMotDePase(rs.getString("MotPasse"));
                persos.add(perso);

            }
            return persos;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
