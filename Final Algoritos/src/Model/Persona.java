package Model;

import processing.core.PApplet;

public abstract class Persona implements Runnable  {
	
	int posX;
	int posY;
	int tam;
	int dir;
	int r;
	int g;
	int b;
	int vel;
	PApplet app;
	
	public Persona (PApplet app) {
		this.posX = (int)app.random(0,600);
		this.posY = (int)app.random(0,600);
		this.tam = 7;
		this.dir = (int)app.random(1,5);
		this.vel = 2;
		this.app = app;
		
		
	}
	
	public void pintar () {
		
	}
	
	public void run () {
		mover();
	}
	
	public void mover () {
		if (this.dir == 1) {
			this.posX += this.vel;
			this.posY += this.vel;
		}
		
		if (this.dir == 2) {
			this.posX -= this.vel;
			this.posY -= this.vel;
		}
		
		if (this.dir == 3) {
			this.posX -= this.vel;
			this.posY += this.vel;
		}
		
		if (this.dir == 4) {
			this.posX += this.vel;
			this.posY -= this.vel;
		}
		
		if (this.posX <= 0 || this.posX >= 600 || this.posY <= 0 || this.posY >= 600) {
			this.vel *= -1;
		}
	}
	
	
	
	

}
