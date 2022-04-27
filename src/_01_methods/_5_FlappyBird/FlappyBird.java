package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int birdX = 350;
	int birdY = 0;
	int birdYVelocity = -10;
	int gravity = 1;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		
	}

	@Override
	public void draw() {
		birdY += birdYVelocity;
		birdYVelocity += gravity;
		fill(42,212,87);
		rect
		background(135, 206, 250);
		fill(155, 135, 12);
		stroke(0, 0, 0);
		ellipse(birdX, birdY, 100, 80);
	}

	public void mousePressed() {
		if (mousePressed) {
			birdYVelocity = -10;
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
