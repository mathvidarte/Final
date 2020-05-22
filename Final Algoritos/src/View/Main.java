package View;

import java.util.LinkedList;

import Controller.Controller;
import Model.Persona;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller all;
	LinkedList <Persona> personaList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings () {
		size (600, 600);
	}
	
	public void setup () {
		all = new Controller (this);
		personaList = all.getPersonaList();
		
	}
	
	public void draw () {
		background (0);
		for (int i = 0; i < personaList.size(); i++) {
			personaList.get(i).pintar();
			new Thread (personaList.get(i)).start();
		}
	}

}
