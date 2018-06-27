/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.dao;

/**
 *
 * @author Administrateur
 */
public class DALException extends Exception{
    
    private static final long serialVersionUID = 3946403277377688014L;

	public DALException(String message) {
		super("DALException: " + message);
	}
}
