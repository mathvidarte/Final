package Model;

import java.util.Collections;
import java.util.LinkedList;

import Exception.ContagioException;
import processing.core.PApplet;

public class Logic {
	
	String [] text;
	String [] textSplit; 
	PApplet app;
	LinkedList <Persona> personaList;
	
	int cont;
	String estado;
	
	public Logic (PApplet app) {
		this.app = app;
	
		personaList = new LinkedList <Persona> ();
		
		text = app.loadStrings("data/Datos.txt");
		
		
		for (int i = 0; i < text.length; i++) {
			
			textSplit = text[i].split(":");	
			estado = textSplit [0];
			cont = Integer.parseInt(textSplit[1]);
			
			
			
			
			for (int j = 0; j < cont; j++) {
				
				if (estado.equals("peronas sanas")) {
					personaList.add(new Sano (app)); 
			}
			}	
			
			for (int k = 0; k < cont; k++) {
				
				if (estado.equals("personas infectadas")) {
					personaList.add(new Infectado (app));
				}
			}
			
			for (int l = 0; l < cont; l++) {
				
				if (estado.equals("personas recuperdas")) {
					personaList.add(new Recuperado (app));
			}
			}
			
		}
		System.out.println(textSplit[1]);
			
}
	
	public void sortList (char c) {
		switch (c) {
		case 'n':
			Collections.sort(personaList);
			
			for (int i = 0; i < personaList.size(); i++) {
				
				personaList.get(i).setPosX(i*80+50);
				personaList.get(i).setPosY(300);
			}
		
		}
	}
	
	public void contagio (boolean contagio) throws ContagioException {
		if (contagio == true) {
			throw new ContagioException ("Contagiado");
		}
	}
	
	public LinkedList <Persona> getPersonaList () {
		return personaList;
	}
}
