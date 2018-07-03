/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.dao.GetValuesDataBase;

/**
 *
 * @author plaurent2017
 */
public class ConnexionControler implements IConnexionObserver {

    private GetValuesDataBase connexion = new GetValuesDataBase();
    public ConnexionControler() {
    }

    @Override
    public void ValiderConnexion() {
        //Valide la connexion.
    }

    /*private String getRole() {
        String role = "";
        Boolean getIdUser = connexion.getIdentifiant(getNameValue(), getPassWordValue());        
        String getRoleUser = connexion.getRole(getNameValue(), getPassWordValue());

        if (getIdUser) {
            switch (getRoleUser) {
                case EnumRole.ADM:
                    isAdmin = true;
                    break;
                case EnumRole.AST:
                    isAssistant = true;
                    break;
                case EnumRole.SEC:
                    isSecretaire = true;
                    break;
                case EnumRole.VET:
                    isVeterinaire = true;
                    break;
            }
            return role;
        }
    }*/
}
