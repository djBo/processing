package org.test.reaction;

import processing.core.PApplet;

public class App extends PApplet {

	public static void main(String[] args) {
		 PApplet.main(App.class.getCanonicalName());
	}

	public class Cell {
		float a;
		float b;
	}

	Cell[][] grid;
	Cell[][] next;

	@Override
	public void settings() {
		size(600, 600);
	}

	@Override
	public void setup() {
		pixelDensity(1);
	}

	@Override
	public void draw() {
	}

}
