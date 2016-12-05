package org.test.supershape;

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

	PVector[][] globe;
	int total = 100;

	List<PVector> points = new ArrayList<PVector>();

	PVector sphereVector(float r, float lat, float lon) {
		float x = r * sin(lat) * cos(lon);
		float y = r * sin(lat) * sin(lon);
		float z = r * cos(lat);
		return new PVector(x, y, z);
	}

	@Override
	public void settings() {
		size(800,  600, P3D);
	}

	@Override
	public void setup() {
		colorMode(HSB);
		cam = new PeasyCam(this, 500);
		globe = new PVector[total+1][total+1];
	}

	@Override
	public void draw() {
		background(0);
		noStroke();
		lights();
		int r = 200;
		for (int i = 0; i < total+1; i++) {
			float lat = map(i, 0, total, 0, PI);
			for (int j = 0; j < total+1; j++) {
				float lon = map(j, 0, total, 0, TWO_PI);
				globe[i][j] = sphereVector(r, lat, lon);
			}
		}

//		stroke(255);
//		noFill();
		for (int i = 0; i < total; i++) {
			float hu = map(i, 0, total, 0, 255*6);
			fill(hu % 255, 255, 255);
			beginShape(TRIANGLE_STRIP);
			for (int j = 0; j < total+1; j++) {
				PVector v1 = globe[i][j];
				vertex(v1.x, v1.y, v1.z);
				PVector v2 = globe[i+1][j];
				vertex(v2.x, v2.y, v2.z);
			}
			endShape();
		}
	}

}
