/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller;

import fr.eni.clinique.dao.EnumRole;
import fr.eni.clinique.ihm.CliniqueVeterinaire;

/**
 *
 * @author plaurent2017
 */
public class CliniqueVeterinaireController implements ICliniqueVeterinaireObserver {

    private CliniqueVeterinaire viewCliniqueVeterinaire;

    public CliniqueVeterinaireController() {
    }

    @Override
    public void AfficherGestionClient() {
        //Affiche le page de gestion de client. 
    }

    @Override
    public void Deconnexion() {
        //Deconnexion de l'application.
    }

    @Override
    public void AfficherGestionPersonnel() {
        //Affiche la page de gestion du personnel.
    }

    @Override
    public void AfficherAgenda() {
        //Affiche la page Agenda.
    }

    @Override
    public void AfficherPriseRDV() {
        //Affiche la page des prise de rendez vous.
    }

    @Override
    public void Fermer() {
        //Fermer l'application.
    }

    private void GestionRole(String role) {
        switch (role) {
            case EnumRole.ADM:
                break;
            case EnumRole.AST:
                viewCliniqueVeterinaire.getAgenda().setVisible(false);
                viewCliniqueVeterinaire.getGestionClient().setVisible(false);
                break;
            case EnumRole.SEC:
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                break;
            case EnumRole.VET:
                viewCliniqueVeterinaire.getGestionPersonnel().setVisible(false);
                break;
        }

    }

}
