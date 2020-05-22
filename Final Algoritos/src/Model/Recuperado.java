package Model;

import processing.core.PApplet;

public class Recuperado extends Persona {
	public Recuperado (PApplet app) {
		super (app);
	}
	
	public void pintar () {
		app.noStroke ();
		app.fill(0, 0, 255);
		app.ellipse(this.posX,  this.posY,  this.tam,  this.tam);
	}

}
