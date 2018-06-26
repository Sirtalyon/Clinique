/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.properties;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @author Administrateur
 */
public class Configuration {
    private static final String BUNDLE_NAME = "fr.eni.clinique.properties.settings"; 
	
	//Objet qui va lire le contenu du fichier
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Configuration() {
		
	}
	
	public static String getValue(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
