package org.test.solarsystem;

import peasy.PeasyCam;
import processing.core.PApplet;

public class App extends PApplet {

	public static void main(String[] args) {
		PApplet.main(App.class.getCanonicalName());
	}

	PeasyCam cam;

	Planet sun;

	@Override
	public void settings() {
		size(600, 600, P3D);
	}

	@Override
	public void setup() {
		cam = new PeasyCam(this, 500);
		sun = new Planet(this, 50, 0, 0);
		sun.spawnMoons(5, 1);
	}

	@Override
	public void draw() {
		background(0);
		//translate(width/2, height/2);
		sun.show();
		sun.orbit();
	}

}
