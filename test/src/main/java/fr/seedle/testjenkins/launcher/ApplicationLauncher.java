package fr.seedle.testjenkins.launcher;

import fr.seedle.testjenkins.service.Service;

public class ApplicationLauncher {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service);
	}
}
