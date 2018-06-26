/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class GetValuesDataBase {
    
    
    public boolean getIdentifiant(String user, String password){
        ConnexionDataBase co = new ConnexionDataBase();                
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            stm = connect.prepareStatement("select * from Personnels where nom=" + user + " and MotPasse=" + password);
            rs = stm.executeQuery();
            if(rs.next())
                return true;
            else
                return false;            
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
