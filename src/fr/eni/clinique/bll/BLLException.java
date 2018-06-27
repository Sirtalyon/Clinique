/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.bll;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class BLLException extends Exception {

	private static final long serialVersionUID = 9165172527346599735L;
	
private ArrayList<Exception> exceptions = new ArrayList<>();
	
	public BLLException() {
		
	}
	
	public BLLException(String message) {
		super(message);
	}

	public void ajouterException(Exception e) {
		exceptions.add(e);
	}
	
	public boolean hasExceptions() {
		return exceptions.size() > 0;
	}

	@Override
	public String getMessage() {
		StringBuilder builder = new StringBuilder(super.getMessage());
		builder.append(System.lineSeparator());
		for(Exception e : exceptions) {
			builder.append(e.getMessage()).append(System.lineSeparator());
		}
		
		return builder.toString();
	}

}
