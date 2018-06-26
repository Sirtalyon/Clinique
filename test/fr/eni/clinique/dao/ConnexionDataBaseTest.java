/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ConnexionDataBaseTest {
    
    public ConnexionDataBaseTest() {
    }
    
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ConnexionDataBase.main(args);
        
    }
    
}
