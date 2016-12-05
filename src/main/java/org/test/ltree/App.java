package org.test.ltree;

import java.awt.event.KeyEvent;

import processing.core.PApplet;

public class App extends PApplet {

	public static void main(String[] args) {
		PApplet.main(App.class.getCanonicalName());
	}

	public class Rule {

		private char a;
		private String b;

		Rule(String a, String b) {
			this.a = a.charAt(0);
			this.b = b;
		}

		public char getA() {
			return a;
		}

		public String getB() {
			return b;
		}

	}

	// variables: A B
	// axiom: A
	// rules: (A -> AB), (B -> A)

	// variables: F+-[]
	// axiom: F
	// rules: F -> FF++[+F-F-F]-[-F+F+F]

	String axiom = "F";
	String sentence = axiom;
	int len = 100;
	float angle;

	int x;
	int y;
//	Rule[] rules = {
//			new Rule("A", "AB"),
//			new Rule("B", "A")
//	};
	Rule[] rules = {
			new Rule("F", "FF+[+F-F-F]-[-F+F+F]")
	};

	void generate() {
		len *= 0.5;
		String nextSentence = "";
		for (int i = 0; i < sentence.length(); i++) {
			char current = sentence.charAt(i);
			boolean found = false;
			for (int j = 0; j < rules.length; j++) {
				if (current == rules[j].getA()) {
					found = true;
					nextSentence += rules[j].getB();
					break;
				}
			}

			if (!found) {
				nextSentence += current;
			}
		}
		sentence = nextSentence;
		System.out.println(sentence);
		turtle();
	}

//	void push() {
//		x = getX();
//		y = getY();
//	}
//
//	void pop() {
//		setLocation(x, y);
//	}

	void turtle() {
		background(51);
		resetMatrix();
		translate(width/2, height);
		stroke(255, 100);
		for (int i = 0; i < sentence.length(); i++) {
			String current = String.valueOf(sentence.charAt(i));
			if ("F".equals(current)) {
				line(0, 0, 0, -len);
				translate(0, -len);
			} else if ("+".equals(current)) {
				rotate(angle);
			} else if ("-".equals(current)) {
				rotate(-angle);
			} else if ("[".equals(current)) {
				pushMatrix();
			} else if ("]".equals(current)) {
				popMatrix();

			}
		}
	}

	@Override
	public void keyPressed() {
		if (keyCode == KeyEvent.VK_ENTER) {
			generate();
		}
	}

	@Override
	public void settings() {
		size(400, 400);
	}

	@Override
	public void setup() {
		angle = radians(25);
		background(51);
		System.out.println(axiom);
		turtle();
	}

	@Override
	public void draw() {

	}

}
