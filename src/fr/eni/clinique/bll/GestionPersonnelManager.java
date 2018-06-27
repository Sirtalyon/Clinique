/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.bll;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dao.DALException;

/**
 *
 * @author Administrateur
 */
public class GestionPersonnelManager {
	// private VerifChamps verif = VerifChamps.getInstance();

	/* ******* SINGLETON ******* */
	private static GestionPersonnelManager instance = null;

	private GestionPersonnelManager() {
            

	}

	public static GestionPersonnelManager getInstance() {
		if (instance == null) {
			instance = new GestionPersonnelManager();
		}
		return instance;
	}

	/* ******* METHODES DU MANAGER ******* */

	/*public void addPersonnel(Personnel pers) throws BLLException {

		validerPersonnel(pers);

		try {
			daoPers.insert(pers);
		} catch (DALException e) {
			throw new BLLException("Erreur lors de l'insertion en BDD du personnel.");
		}

	}
	
	/*public void updatePersonnel (Personnel pers) throws BLLException {
		
		validerPersonnel(pers);
		
		try {
			daoPers.update(pers);
		} /*catch (DalException e) {
			throw new BLLException("Erreur lors de la mise � jour en BDD du personnel.");
		}
		
		
	}
	
	public List <Personnel> getListePersonnel() throws BLLException {
		
		List <Personnel> listePersonnels = new ArrayList <> ();
		
		try {
			listePersonnels = daoPers.selectAll();
		} catch (DalException e) {
			throw new BLLException ("Erreur acc�s donn�es : la liste du personnel n'est pas r�cup�rable");
		}
		
		
		return listePersonnels;
		
		
	}
	
	public Personnel getPersonnel(int codePers) throws BLLException {
		
		Personnel pers = null;
		
		try {
			pers = daoPers.selectById(codePers);
		} catch (DalException e) {
			throw new BLLException ("Erreur acc�s donn�es : la liste du personnel n'est pas r�cup�rable");
		}
	
		return pers;	
	}
	
	public List <Veterinaire> getListeVeto () throws BLLException {
		List <Veterinaire> listeVetos = new ArrayList <> ();
		List <Personnel> listePersonnels = getListePersonnel();
		
		for (Personnel personnel : listePersonnels) {
			if (personnel instanceof Veterinaire){
				listeVetos.add((Veterinaire) personnel);
				
			}
			
		}
	
		return listeVetos;
		
	}
	
		
	
	
	

	// *********** METHODES DE VERIFICATION ******************

	private void validerPersonnel(Personnel pers) throws BLLException {

		/*verificationNomPersonnel(pers);

		verificationMotPasse(pers);

		verificationRole(pers);

	}

	private void verificationRole(Personnel pers) throws BLLException {
		if (pers.getRole() == null || pers.getRole().trim().isEmpty()) {
			throw new BLLException("Il est obligatoire d'attribuer un r�le au nouveau salari� : sec, vet ou adm.");
		}

		else if (!(pers.getRole().equals("sec") || pers.getRole().equals("adm") || pers.getRole().equals("vet"))) {

			throw new BLLException("Le r�le d'un nouveau salari� doit forc�ment �tre : sec, vet ou adm.");
		}
	}

	/*private void verificationMotPasse(Personnel pers) throws BLLException {
		if (pers.getMotPasse() == null || pers.getMotPasse().trim().isEmpty()) {
			throw new BLLException("Le mot de passe est obligatoire");
		} else if (pers.getMotPasse().length() > 10) {
			throw new BLLException("Le mot de passe doit comporter 10 caract�res maximum");
		}

	}

	private void verificationNomPersonnel(Personnel pers) throws BLLException {
		if (pers.getNom() == null || pers.getNom().trim().isEmpty()) {
			throw new BLLException("Le nom est obligatoire");
		} else if (pers.getNom().length() > 30) {
			throw new BLLException("Le nom doit comporter 30 caract�res maximum");
		}

	}*/
}
