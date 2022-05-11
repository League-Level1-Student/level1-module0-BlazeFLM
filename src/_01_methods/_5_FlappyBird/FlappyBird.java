package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	Random random = new Random();
	int ran = random.nextInt(300 - 50) - 50;
	int birdX = 350;
	int birdY = 0;
	int birdYVelocity = -3;
	int gravity = 1;
	int pipeX = 600;
	int pipeGap = 100;
	int lowerPipeY = ran + pipeGap;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		teleportPipes();
	}

	@Override
	public void draw() {
		birdY += birdYVelocity;
		birdYVelocity += gravity;
		pipeX -= 2;
		background(135, 206, 250);
		fill(42, 212, 87);
		rect(pipeX, 0, 50, ran);
		rect(pipeX, 600, 50, lowerPipeY * -1);
		fill(155, 135, 12);
		stroke(0, 0, 0);
		ellipse(birdX, birdY, 100, 80);
		teleportPipes();
		if (pipeHitCheck()) {
			exit)();
		}
	}

	public void mousePressed() {
		if (mousePressed) {
			birdYVelocity = -7;
		}
	}

	public void teleportPipes() {
		if (pipeX < 100) {
			pipeX = 700;
			ran = (int) random(25) * 10;
		}
	}

	boolean pipeHitCheck() {
		if (birdY < ran && birdX > pipeX && birdX < (pipeX + 50)) {
			return true;
		} else if (birdY > lowerPipeY * -1 && birdX > pipeX && birdX < (pipeX + 50)) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
