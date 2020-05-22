package Model;

import processing.core.PApplet;

public class Infectado extends Persona {
	public Infectado (PApplet app) {
		super (app);
	}
	
	public void pintar () {
		app.noStroke ();
		app.fill(255, 0, 0);
		app.ellipse(this.posX,  this.posY,  this.tam,  this.tam);
	}

}
