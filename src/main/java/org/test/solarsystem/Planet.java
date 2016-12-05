package org.test.solarsystem;

import org.test.processing.ProcessingDelegate;

import processing.core.PApplet;

/**
 * This needs some more work as it does not display on the applet
 * @author Rory
 *
 */
public class Planet extends ProcessingDelegate {
	float radius;
	float angle;
	float distance;
	Planet[] planets;
	float orbitSpeed;

	public Planet(PApplet parent, float radius, float distance, float orbitSpeed) {
		super(parent);
		this.radius = radius;
		this.distance = distance;
		this.angle = random(TWO_PI);
		this.orbitSpeed = orbitSpeed;
	}

	public void orbit() {
		angle = angle + orbitSpeed;
		if (planets != null) {
			for (int i = 0; i < planets.length; i++) {
				planets[i].orbit();
			}
		}
	}

	public void spawnMoons(int total, int level) {
		planets = new Planet[total];
		for (int i = 0; i < planets.length; i++) {
			float r = (float) (radius/(level*1.2));
			float d = random(50, 150);
			float o = random(-0.1f, 0.1f);
			planets[i] = new Planet(parent, r, d/level, o);
			if (level < 4) {
				int num = (int) random(0, 4);
				planets[i].spawnMoons(num, level+1);
			}
		}
	}

	public void show() {
		pushMatrix();
		fill(255, 100);
		rotate(angle);
		translate(distance, 0);
		ellipse(0, 0, radius * 2, radius * 2);
		if (planets != null) {
			for (int i = 0; i < planets.length; i++) {
				planets[i].show();
			}
		}
		popMatrix();
	}

}
