package Controller;

import java.util.LinkedList;


import Model.Logic;
import Model.Persona;
import processing.core.PApplet;

public class Controller {
	
	Logic logica; 
	
	public Controller (PApplet app) {
		logica = new Logic (app);
	}
	
	public LinkedList<Persona> getPersonaList() {
		return logica.getPersonaList();
	}
	

}
