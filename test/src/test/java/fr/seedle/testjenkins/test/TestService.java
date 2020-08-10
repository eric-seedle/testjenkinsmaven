package fr.seedle.testjenkins.test;

import org.junit.Test;

import fr.seedle.testjenkins.dto.Membre;
import fr.seedle.testjenkins.service.Service;

public class TestService {

	@Test
	public void execute() {
		Service service = new Service();
		Membre membre = service.getMembre();
		if (membre.getNom() == null) {
			throw new RuntimeException("un membre ne peut pas avoir un nom null");
		}
	}
}
