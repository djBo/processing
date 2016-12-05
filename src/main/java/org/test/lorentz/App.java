package org.test.lorentz;

import java.util.ArrayList;
import java.util.List;

import peasy.PeasyCam;
import processing.core.PApplet;
import processing.core.PVector;

public class App extends PApplet {

	public static void main(String[] args) {
		PApplet.main(App.class.getCanonicalName());
	}

	PeasyCam cam;

	float x = 0.01f;
	float y = 0;
	float z = 0;

	float a = 10;
	float b = 28;
	float c = 8/3;

	List<PVector> points = new ArrayList<PVector>();

	@Override
	public void settings() {
		size(800, 600, P3D);
	}

	@Override
	public void setup() {
		colorMode(HSB);
		cam = new PeasyCam(this, 500);
	}

	@Override
	public void draw() {
		background(0);

		float dt = 0.01f;
		float dx = (a * (y - x)) * dt;
		float dy = (x * (b - z) - y) * dt;
		float dz = (x * y - c * z) * dt;
		x = x + dx;
		y = y + dy;
		z = z + dz;

		points.add(new PVector(x, y, z));
		translate(0, 0, -80);
		//translate(width/2, height/2);
		scale(5);
		stroke(255);
		noFill();

		float hu = 0;
		beginShape();
		for(PVector v : points) {
			stroke(hu, 255, 255);
			vertex(v.x, v.y, v.z);

//			PVector offset = PVector.random3D();
//			offset.mult(0.1f);
//			v.add(offset);

			hu += 0.1;
			if (hu > 255) {
				hu = 0;
			}
		}
		endShape();
		cam.beginHUD();
		text(frameRate, 10, 20);
		cam.endHUD();
	}

}
