package fr.seedle.testjenkins.service;

import fr.seedle.testjenkins.dto.Membre;

public class Service {

	private Membre membre;

	public Service() {
		this.membre = MembreDao.getInstance();
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	@Override
	public String toString() {
		return "Service [membre=" + membre + "]";
	}
	
	
}
