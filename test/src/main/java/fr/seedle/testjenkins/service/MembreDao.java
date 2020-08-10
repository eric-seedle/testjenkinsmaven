package fr.seedle.testjenkins.service;

import fr.seedle.testjenkins.dto.Membre;

public class MembreDao {

	public static Membre getInstance() {
		Membre membre = new Membre();
		membre.setNom("R");
		membre.setPrenom("Eric");
		return membre;
	}
}
