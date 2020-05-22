package Model;

import processing.core.PApplet;

public class Sano extends Persona {
	public Sano (PApplet app) {
		super (app);
	}
	
	public void pintar () {
		app.noStroke ();
		app.fill(0, 255, 0);
		app.ellipse(this.posX,  this.posY,  this.tam,  this.tam);
	}

}
