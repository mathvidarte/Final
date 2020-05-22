package Model;

import processing.core.PApplet;

public abstract class Persona implements Runnable, Comparable <Persona> {
	
	int posX;
	int posY;
	int tam;
	int dir;
	int r;
	int g;
	int b;
	int vel;
	PApplet app;
	int myCont;
	
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
	
	public int compareTo (Persona nuevo) {
		return this.myCont - nuevo.getMyCont();
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

	public int getMyCont() {
		return myCont;
	}

	public void setMyCont(int myCont) {
		this.myCont = myCont;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
	
	
	
	
	
	

}
