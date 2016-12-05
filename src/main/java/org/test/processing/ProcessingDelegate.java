package org.test.processing;

import processing.core.PApplet;
import processing.core.PConstants;

public class ProcessingDelegate implements PConstants {

	protected final PApplet parent;

	public ProcessingDelegate(PApplet parent) {
		this.parent = parent;
	}

	/********************************************************/



	public final processing.core.PGraphics _g() {
		return parent.g;
	}

	public final void _g(processing.core.PGraphics value) {
		parent.g = value;
	}

	public final int _displayWidth() {
		return parent.displayWidth;
	}

	public final void _displayWidth(int value) {
		parent.displayWidth = value;
	}

	public final int _displayHeight() {
		return parent.displayHeight;
	}

	public final void _displayHeight(int value) {
		parent.displayHeight = value;
	}

	public final processing.core.PGraphics _recorder() {
		return parent.recorder;
	}

	public final void _recorder(processing.core.PGraphics value) {
		parent.recorder = value;
	}

	public final java.lang.String[] _args() {
		return parent.args;
	}

	public final void _args(java.lang.String[] value) {
		parent.args = value;
	}

	public final int[] _pixels() {
		return parent.pixels;
	}

	public final void _pixels(int[] value) {
		parent.pixels = value;
	}

	public final int _width() {
		return parent.width;
	}

	public final void _width(int value) {
		parent.width = value;
	}

	public final int _height() {
		return parent.height;
	}

	public final void _height(int value) {
		parent.height = value;
	}

	public final int _pixelWidth() {
		return parent.pixelWidth;
	}

	public final void _pixelWidth(int value) {
		parent.pixelWidth = value;
	}

	public final int _pixelHeight() {
		return parent.pixelHeight;
	}

	public final void _pixelHeight(int value) {
		parent.pixelHeight = value;
	}

	public final int _mouseX() {
		return parent.mouseX;
	}

	public final void _mouseX(int value) {
		parent.mouseX = value;
	}

	public final int _mouseY() {
		return parent.mouseY;
	}

	public final void _mouseY(int value) {
		parent.mouseY = value;
	}

	public final int _pmouseX() {
		return parent.pmouseX;
	}

	public final void _pmouseX(int value) {
		parent.pmouseX = value;
	}

	public final int _pmouseY() {
		return parent.pmouseY;
	}

	public final void _pmouseY(int value) {
		parent.pmouseY = value;
	}

	public final boolean _firstMouse() {
		return parent.firstMouse;
	}

	public final void _firstMouse(boolean value) {
		parent.firstMouse = value;
	}

	public final int _mouseButton() {
		return parent.mouseButton;
	}

	public final void _mouseButton(int value) {
		parent.mouseButton = value;
	}

	public final boolean _mousePressed() {
		return parent.mousePressed;
	}

	public final void _mousePressed(boolean value) {
		parent.mousePressed = value;
	}

	public final processing.event.MouseEvent _mouseEvent() {
		return parent.mouseEvent;
	}

	public final void _mouseEvent(processing.event.MouseEvent value) {
		parent.mouseEvent = value;
	}

	public final char _key() {
		return parent.key;
	}

	public final void _key(char value) {
		parent.key = value;
	}

	public final int _keyCode() {
		return parent.keyCode;
	}

	public final void _keyCode(int value) {
		parent.keyCode = value;
	}

	public final boolean _keyPressed() {
		return parent.keyPressed;
	}

	public final void _keyPressed(boolean value) {
		parent.keyPressed = value;
	}

	public final processing.event.KeyEvent _keyEvent() {
		return parent.keyEvent;
	}

	public final void _keyEvent(processing.event.KeyEvent value) {
		parent.keyEvent = value;
	}

	public final boolean _focused() {
		return parent.focused;
	}

	public final void _focused(boolean value) {
		parent.focused = value;
	}

	public final float _frameRate() {
		return parent.frameRate;
	}

	public final void _frameRate(float value) {
		parent.frameRate = value;
	}

	public final int _frameCount() {
		return parent.frameCount;
	}

	public final void _frameCount(int value) {
		parent.frameCount = value;
	}

	public final boolean _finished() {
		return parent.finished;
	}

	public final void _finished(boolean value) {
		parent.finished = value;
	}

	public final java.awt.Frame _frame() {
		return parent.frame;
	}

	public final void _frame(java.awt.Frame value) {
		parent.frame = value;
	}

	public final int _pixelDensity() {
		return parent.pixelDensity;
	}

	public final void _pixelDensity(int value) {
		parent.pixelDensity = value;
	}

	public final int _requestImageMax() {
		return parent.requestImageMax;
	}

	public final void _requestImageMax(int value) {
		parent.requestImageMax = value;
	}





















	/********************************************************/
	public final void exit() {
		parent.exit();
	}

	public final processing.core.PImage get(int arg0, int arg1, int arg2, int arg3) {
		return parent.get(arg0, arg1, arg2, arg3);
	}

	public final int get(int arg0, int arg1) {
		return parent.get(arg0, arg1);
	}

	public final processing.core.PImage get() {
		return parent.get();
	}

	public final void clear() {
		parent.clear();
	}

	public final void size(int arg0, int arg1, String arg2) {
		parent.size(arg0, arg1, arg2);
	}

	public final void size(int arg0, int arg1, String arg2, String arg3) {
		parent.size(arg0, arg1, arg2, arg3);
	}

	public final void size(int arg0, int arg1) {
		parent.size(arg0, arg1);
	}

	public final void setup() {
		parent.setup();
	}

	public final void start() {
		parent.start();
	}

	public final void resume() {
		parent.resume();
	}

	public final void stop() {
		parent.stop();
	}

	public final void flush() {
		parent.flush();
	}

	public final void save(String arg0) {
		parent.save(arg0);
	}

	public final void copy(processing.core.PImage arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		parent.copy(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public final processing.core.PImage copy() {
		return parent.copy();
	}

	public final void copy(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		parent.copy(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public final void set(int arg0, int arg1, int arg2) {
		parent.set(arg0, arg1, arg2);
	}

	public final void set(int arg0, int arg1, processing.core.PImage arg2) {
		parent.set(arg0, arg1, arg2);
	}

	public final void fill(float arg0) {
		parent.fill(arg0);
	}

	public final void fill(float arg0, float arg1, float arg2, float arg3) {
		parent.fill(arg0, arg1, arg2, arg3);
	}

	public final void fill(float arg0, float arg1, float arg2) {
		parent.fill(arg0, arg1, arg2);
	}

	public final void fill(float arg0, float arg1) {
		parent.fill(arg0, arg1);
	}

	public final void fill(int arg0) {
		parent.fill(arg0);
	}

	public final void fill(int arg0, float arg1) {
		parent.fill(arg0, arg1);
	}

	public final void setSize(int arg0, int arg1) {
		parent.setSize(arg0, arg1);
	}

	public final void rotate(float arg0, float arg1, float arg2, float arg3) {
		parent.rotate(arg0, arg1, arg2, arg3);
	}

	public final void rotate(float arg0) {
		parent.rotate(arg0);
	}

	public final void filter(int arg0, float arg1) {
		parent.filter(arg0, arg1);
	}

	public final void filter(int arg0) {
		parent.filter(arg0);
	}

	public final void filter(processing.opengl.PShader arg0) {
		parent.filter(arg0);
	}

	public final float random(float arg0, float arg1) {
		return parent.random(arg0, arg1);
	}

	public final float random(float arg0) {
		return parent.random(arg0);
	}

	public final void mask(processing.core.PImage arg0) {
		parent.mask(arg0);
	}

	public final float red(int arg0) {
		return parent.red(arg0);
	}

	public final int color(int arg0, int arg1, int arg2) {
		return parent.color(arg0, arg1, arg2);
	}

	public final int color(float arg0, float arg1) {
		return parent.color(arg0, arg1);
	}

	public final int color(int arg0, int arg1) {
		return parent.color(arg0, arg1);
	}

	public final int color(int arg0, int arg1, int arg2, int arg3) {
		return parent.color(arg0, arg1, arg2, arg3);
	}

	public final int color(float arg0, float arg1, float arg2) {
		return parent.color(arg0, arg1, arg2);
	}

	public final int color(float arg0, float arg1, float arg2, float arg3) {
		return parent.color(arg0, arg1, arg2, arg3);
	}

	public final int color(float arg0) {
		return parent.color(arg0);
	}

	public final int color(int arg0) {
		return parent.color(arg0);
	}

	public final void scale(float arg0, float arg1) {
		parent.scale(arg0, arg1);
	}

	public final void scale(float arg0, float arg1, float arg2) {
		parent.scale(arg0, arg1, arg2);
	}

	public final void scale(float arg0) {
		parent.scale(arg0);
	}

	public final void method(String arg0) {
		parent.method(arg0);
	}

	public final processing.data.Table loadTable(String arg0, String arg1) {
		return parent.loadTable(arg0, arg1);
	}

	public final processing.data.Table loadTable(String arg0) {
		return parent.loadTable(arg0);
	}

	public final void surfaceFrameRate(float arg0) {
		parent.frameRate(arg0);
	}

	public final void keyPressed(processing.event.KeyEvent arg0) {
		parent.keyPressed(arg0);
	}

	public final void redraw() {
		parent.redraw();
	}

	public final boolean exitCalled() {
		return parent.exitCalled();
	}

	public final String sketchPath() {
		return parent.sketchPath();
	}

	public final String sketchPath(String arg0) {
		return parent.sketchPath(arg0);
	}

	public final void mousePressed(processing.event.MouseEvent arg0) {
		parent.mousePressed(arg0);
	}

	public final int sketchSmooth() {
		return parent.sketchSmooth();
	}

	public final void pause() {
		parent.pause();
	}

	public final void unregisterMethod(String arg0, Object arg1) {
		parent.unregisterMethod(arg0, arg1);
	}

	public final void draw() {
		parent.draw();
	}

	public final void settings() {
		parent.settings();
	}

	public final processing.core.PGraphics createGraphics(int arg0, int arg1, String arg2) {
		return parent.createGraphics(arg0, arg1, arg2);
	}

	public final processing.core.PGraphics createGraphics(int arg0, int arg1, String arg2, String arg3) {
		return parent.createGraphics(arg0, arg1, arg2, arg3);
	}

	public final processing.core.PGraphics createGraphics(int arg0, int arg1) {
		return parent.createGraphics(arg0, arg1);
	}

	public final int sketchHeight() {
		return parent.sketchHeight();
	}

	public final String sketchOutputPath() {
		return parent.sketchOutputPath();
	}

	public final int displayDensity() {
		return parent.displayDensity();
	}

	public final processing.core.PGraphics getGraphics() {
		return parent.getGraphics();
	}

	public final void registerMethod(String arg0, Object arg1) {
		parent.registerMethod(arg0, arg1);
	}

	public final java.io.BufferedReader createReader(String arg0) {
		return parent.createReader(arg0);
	}

	public final void line(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.line(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void line(float arg0, float arg1, float arg2, float arg3) {
		parent.line(arg0, arg1, arg2, arg3);
	}

	public final int sketchWidth() {
		return parent.sketchWidth();
	}

	public final String sketchRenderer() {
		return parent.sketchRenderer();
	}

	public final boolean sketchFullScreen() {
		return parent.sketchFullScreen();
	}

	public final void orientation(int arg0) {
		parent.orientation(arg0);
	}

	public final void die(String arg0) {
		parent.die(arg0);
	}

	public final void die(String arg0, Exception arg1) {
		parent.die(arg0, arg1);
	}

	public final int sketchDisplay() {
		return parent.sketchDisplay();
	}

	public final void noSmooth() {
		parent.noSmooth();
	}

	public final void smooth() {
		parent.smooth();
	}

	public final void smooth(int arg0) {
		parent.smooth(arg0);
	}

	public final processing.core.PSurface getSurface() {
		return parent.getSurface();
	}

	public final void pixelDensity(int arg0) {
		parent.pixelDensity(arg0);
	}

	public final void fullScreen(String arg0, int arg1) {
		parent.fullScreen(arg0, arg1);
	}

	public final void fullScreen(String arg0) {
		parent.fullScreen(arg0);
	}

	public final void fullScreen(int arg0) {
		parent.fullScreen(arg0);
	}

	public final void fullScreen() {
		parent.fullScreen();
	}

	public final java.io.OutputStream sketchOutputStream() {
		return parent.sketchOutputStream();
	}

	public final int sketchPixelDensity() {
		return parent.sketchPixelDensity();
	}

	public final int sketchWindowColor() {
		return parent.sketchWindowColor();
	}

	public final void noCursor() {
		parent.noCursor();
	}

	public final void cursor(processing.core.PImage arg0) {
		parent.cursor(arg0);
	}

	public final void cursor(processing.core.PImage arg0, int arg1, int arg2) {
		parent.cursor(arg0, arg1, arg2);
	}

	public final void cursor(int arg0) {
		parent.cursor(arg0);
	}

	public final void cursor() {
		parent.cursor();
	}

	public final void link(String arg0) {
		parent.link(arg0);
	}

	public final void exitActual() {
		parent.exitActual();
	}

	public final void saveFrame(String arg0) {
		parent.saveFrame(arg0);
	}

	public final void saveFrame() {
		parent.saveFrame();
	}

	public final String insertFrame(String arg0) {
		return parent.insertFrame(arg0);
	}

	public final void delay(int arg0) {
		parent.delay(arg0);
	}

	public final void dispose() {
		parent.dispose();
	}

	public final void thread(String arg0) {
		parent.thread(arg0);
	}

	public final void loop() {
		parent.loop();
	}

	public final void mouseReleased() {
		parent.mouseReleased();
	}

	public final void mouseReleased(processing.event.MouseEvent arg0) {
		parent.mouseReleased(arg0);
	}

	public final void mouseDragged() {
		parent.mouseDragged();
	}

	public final void mouseDragged(processing.event.MouseEvent arg0) {
		parent.mouseDragged(arg0);
	}

	public final void mouseEntered() {
		parent.mouseEntered();
	}

	public final void mouseEntered(processing.event.MouseEvent arg0) {
		parent.mouseEntered(arg0);
	}

	public final void handleDraw() {
		parent.handleDraw();
	}

	public final String savePath(String arg0) {
		return parent.savePath(arg0);
	}

	public final void noLoop() {
		parent.noLoop();
	}

	public final void mouseMoved(processing.event.MouseEvent arg0) {
		parent.mouseMoved(arg0);
	}

	public final void mouseMoved() {
		parent.mouseMoved();
	}

	public final void mouseExited(processing.event.MouseEvent arg0) {
		parent.mouseExited(arg0);
	}

	public final void mouseExited() {
		parent.mouseExited();
	}

	public final void keyReleased(processing.event.KeyEvent arg0) {
		parent.keyReleased(arg0);
	}

	public final void keyReleased() {
		parent.keyReleased();
	}

	public final void focusLost() {
		parent.focusLost();
	}

	public final void keyTyped() {
		parent.keyTyped();
	}

	public final void keyTyped(processing.event.KeyEvent arg0) {
		parent.keyTyped(arg0);
	}

	public final void mouseClicked() {
		parent.mouseClicked();
	}

	public final void mouseClicked(processing.event.MouseEvent arg0) {
		parent.mouseClicked(arg0);
	}

	public final int millis() {
		return parent.millis();
	}

	public final void postEvent(processing.event.Event arg0) {
		parent.postEvent(arg0);
	}

	public final boolean isLooping() {
		return parent.isLooping();
	}

	public final processing.core.PImage createImage(int arg0, int arg1, int arg2) {
		return parent.createImage(arg0, arg1, arg2);
	}

	public final void mouseWheel() {
		parent.mouseWheel();
	}

	public final void mouseWheel(processing.event.MouseEvent arg0) {
		parent.mouseWheel(arg0);
	}

	public final void focusGained() {
		parent.focusGained();
	}

	public final void image(processing.core.PImage arg0, float arg1, float arg2) {
		parent.image(arg0, arg1, arg2);
	}

	public final void image(processing.core.PImage arg0, float arg1, float arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
		parent.image(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public final void image(processing.core.PImage arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.image(arg0, arg1, arg2, arg3, arg4);
	}

	public final byte[] loadBytes(String arg0) {
		return parent.loadBytes(arg0);
	}

	public final void noiseDetail(int arg0, float arg1) {
		parent.noiseDetail(arg0, arg1);
	}

	public final void noiseDetail(int arg0) {
		parent.noiseDetail(arg0);
	}

	public final void randomSeed(long arg0) {
		parent.randomSeed(arg0);
	}

	public final float noise(float arg0, float arg1) {
		return parent.noise(arg0, arg1);
	}

	public final float noise(float arg0, float arg1, float arg2) {
		return parent.noise(arg0, arg1, arg2);
	}

	public final float noise(float arg0) {
		return parent.noise(arg0);
	}

	public final void noiseSeed(long arg0) {
		parent.noiseSeed(arg0);
	}

	public final processing.core.PImage loadImage(String arg0) {
		return parent.loadImage(arg0);
	}

	public final processing.core.PImage loadImage(String arg0, String arg1) {
		return parent.loadImage(arg0, arg1);
	}

	public final float randomGaussian() {
		return parent.randomGaussian();
	}

	public final boolean saveJSONArray(processing.data.JSONArray arg0, String arg1, String arg2) {
		return parent.saveJSONArray(arg0, arg1, arg2);
	}

	public final boolean saveJSONArray(processing.data.JSONArray arg0, String arg1) {
		return parent.saveJSONArray(arg0, arg1);
	}

	public final java.io.InputStream createInput(String arg0) {
		return parent.createInput(arg0);
	}

	public final processing.core.PFont loadFont(String arg0) {
		return parent.loadFont(arg0);
	}

	public final processing.data.JSONObject loadJSONObject(String arg0) {
		return parent.loadJSONObject(arg0);
	}

	public final processing.data.XML parseXML(String arg0) {
		return parent.parseXML(arg0);
	}

	public final processing.data.XML parseXML(String arg0, String arg1) {
		return parent.parseXML(arg0, arg1);
	}

	public final processing.core.PImage requestImage(String arg0) {
		return parent.requestImage(arg0);
	}

	public final processing.core.PImage requestImage(String arg0, String arg1) {
		return parent.requestImage(arg0, arg1);
	}

	public final processing.data.JSONObject parseJSONObject(String arg0) {
		return parent.parseJSONObject(arg0);
	}

	public final boolean saveTable(processing.data.Table arg0, String arg1, String arg2) {
		return parent.saveTable(arg0, arg1, arg2);
	}

	public final boolean saveTable(processing.data.Table arg0, String arg1) {
		return parent.saveTable(arg0, arg1);
	}

	public final processing.core.PFont createFont(String arg0, float arg1) {
		return parent.createFont(arg0, arg1);
	}

	public final processing.core.PFont createFont(String arg0, float arg1, boolean arg2, char[] arg3) {
		return parent.createFont(arg0, arg1, arg2, arg3);
	}

	public final processing.core.PFont createFont(String arg0, float arg1, boolean arg2) {
		return parent.createFont(arg0, arg1, arg2);
	}

	public final void selectInput(String arg0, String arg1, java.io.File arg2, Object arg3) {
		parent.selectInput(arg0, arg1, arg2, arg3);
	}

	public final void selectInput(String arg0, String arg1) {
		parent.selectInput(arg0, arg1);
	}

	public final void selectInput(String arg0, String arg1, java.io.File arg2) {
		parent.selectInput(arg0, arg1, arg2);
	}

	public final void selectOutput(String arg0, String arg1) {
		parent.selectOutput(arg0, arg1);
	}

	public final void selectOutput(String arg0, String arg1, java.io.File arg2) {
		parent.selectOutput(arg0, arg1, arg2);
	}

	public final void selectOutput(String arg0, String arg1, java.io.File arg2, Object arg3) {
		parent.selectOutput(arg0, arg1, arg2, arg3);
	}

	public final boolean saveXML(processing.data.XML arg0, String arg1, String arg2) {
		return parent.saveXML(arg0, arg1, arg2);
	}

	public final boolean saveXML(processing.data.XML arg0, String arg1) {
		return parent.saveXML(arg0, arg1);
	}

	public final boolean saveJSONObject(processing.data.JSONObject arg0, String arg1, String arg2) {
		return parent.saveJSONObject(arg0, arg1, arg2);
	}

	public final boolean saveJSONObject(processing.data.JSONObject arg0, String arg1) {
		return parent.saveJSONObject(arg0, arg1);
	}

	public final processing.data.XML loadXML(String arg0) {
		return parent.loadXML(arg0);
	}

	public final processing.data.XML loadXML(String arg0, String arg1) {
		return parent.loadXML(arg0, arg1);
	}

	public final processing.data.JSONArray loadJSONArray(String arg0) {
		return parent.loadJSONArray(arg0);
	}

	public final processing.data.JSONArray parseJSONArray(String arg0) {
		return parent.parseJSONArray(arg0);
	}

	public final java.io.File saveFile(String arg0) {
		return parent.saveFile(arg0);
	}

	public final java.io.File sketchFile(String arg0) {
		return parent.sketchFile(arg0);
	}

	public final String[] loadStrings(String arg0) {
		return parent.loadStrings(arg0);
	}

	public final java.io.PrintWriter createWriter(String arg0) {
		return parent.createWriter(arg0);
	}

	public final void saveStrings(String arg0, String[] arg1) {
		parent.saveStrings(arg0, arg1);
	}

	public final java.io.OutputStream createOutput(String arg0) {
		return parent.createOutput(arg0);
	}

	public final boolean saveStream(String arg0, java.io.InputStream arg1) {
		return parent.saveStream(arg0, arg1);
	}

	public final boolean saveStream(java.io.File arg0, String arg1) {
		return parent.saveStream(arg0, arg1);
	}

	public final boolean saveStream(String arg0, String arg1) {
		return parent.saveStream(arg0, arg1);
	}

	public final String dataPath(String arg0) {
		return parent.dataPath(arg0);
	}

	public final void selectFolder(String arg0, String arg1) {
		parent.selectFolder(arg0, arg1);
	}

	public final void selectFolder(String arg0, String arg1, java.io.File arg2) {
		parent.selectFolder(arg0, arg1, arg2);
	}

	public final void selectFolder(String arg0, String arg1, java.io.File arg2, Object arg3) {
		parent.selectFolder(arg0, arg1, arg2, arg3);
	}

	public final java.io.InputStream createInputRaw(String arg0) {
		return parent.createInputRaw(arg0);
	}

	public final void saveBytes(String arg0, byte[] arg1) {
		parent.saveBytes(arg0, arg1);
	}

	public final java.io.File dataFile(String arg0) {
		return parent.dataFile(arg0);
	}

	public final float textWidth(char arg0) {
		return parent.textWidth(arg0);
	}

	public final float textWidth(String arg0) {
		return parent.textWidth(arg0);
	}

	public final float textWidth(char[] arg0, int arg1, int arg2) {
		return parent.textWidth(arg0, arg1, arg2);
	}

	public final void rotateX(float arg0) {
		parent.rotateX(arg0);
	}

	public final void endCamera() {
		parent.endCamera();
	}

	public final void camera(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		parent.camera(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public final void camera() {
		parent.camera();
	}

	public final void shearY(float arg0) {
		parent.shearY(arg0);
	}

	public final void ortho() {
		parent.ortho();
	}

	public final void ortho(float arg0, float arg1, float arg2, float arg3) {
		parent.ortho(arg0, arg1, arg2, arg3);
	}

	public final void ortho(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.ortho(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void translate(float arg0, float arg1) {
		parent.translate(arg0, arg1);
	}

	public final void translate(float arg0, float arg1, float arg2) {
		parent.translate(arg0, arg1, arg2);
	}

	public final void shearX(float arg0) {
		parent.shearX(arg0);
	}

	public final void resetMatrix() {
		parent.resetMatrix();
	}

	public final void setMatrix(processing.core.PMatrix2D arg0) {
		parent.setMatrix(arg0);
	}

	public final void setMatrix(processing.core.PMatrix arg0) {
		parent.setMatrix(arg0);
	}

	public final void setMatrix(processing.core.PMatrix3D arg0) {
		parent.setMatrix(arg0);
	}

	public final void applyMatrix(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) {
		parent.applyMatrix(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
	}

	public final void applyMatrix(processing.core.PMatrix2D arg0) {
		parent.applyMatrix(arg0);
	}

	public final void applyMatrix(processing.core.PMatrix arg0) {
		parent.applyMatrix(arg0);
	}

	public final void applyMatrix(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.applyMatrix(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void applyMatrix(processing.core.PMatrix3D arg0) {
		parent.applyMatrix(arg0);
	}

	public final void textMode(int arg0) {
		parent.textMode(arg0);
	}

	public final void text(float arg0, float arg1, float arg2, float arg3) {
		parent.text(arg0, arg1, arg2, arg3);
	}

	public final void text(float arg0, float arg1, float arg2) {
		parent.text(arg0, arg1, arg2);
	}

	public final void text(char arg0, float arg1, float arg2) {
		parent.text(arg0, arg1, arg2);
	}

	public final void text(char arg0, float arg1, float arg2, float arg3) {
		parent.text(arg0, arg1, arg2, arg3);
	}

	public final void text(char[] arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		parent.text(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void text(String arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.text(arg0, arg1, arg2, arg3, arg4);
	}

	public final void text(int arg0, float arg1, float arg2) {
		parent.text(arg0, arg1, arg2);
	}

	public final void text(String arg0, float arg1, float arg2, float arg3) {
		parent.text(arg0, arg1, arg2, arg3);
	}

	public final void text(char[] arg0, int arg1, int arg2, float arg3, float arg4) {
		parent.text(arg0, arg1, arg2, arg3, arg4);
	}

	public final void text(String arg0, float arg1, float arg2) {
		parent.text(arg0, arg1, arg2);
	}

	public final void text(int arg0, float arg1, float arg2, float arg3) {
		parent.text(arg0, arg1, arg2, arg3);
	}

	public final void printMatrix() {
		parent.printMatrix();
	}

	public final void printCamera() {
		parent.printCamera();
	}

	public final void rotateZ(float arg0) {
		parent.rotateZ(arg0);
	}

	public final void beginCamera() {
		parent.beginCamera();
	}

	public final void textSize(float arg0) {
		parent.textSize(arg0);
	}

	public final processing.core.PMatrix3D getMatrix(processing.core.PMatrix3D arg0) {
		return parent.getMatrix(arg0);
	}

	public final processing.core.PMatrix getMatrix() {
		return parent.getMatrix();
	}

	public final processing.core.PMatrix2D getMatrix(processing.core.PMatrix2D arg0) {
		return parent.getMatrix(arg0);
	}

	public final void popMatrix() {
		parent.popMatrix();
	}

	public final void rotateY(float arg0) {
		parent.rotateY(arg0);
	}

	public final void perspective(float arg0, float arg1, float arg2, float arg3) {
		parent.perspective(arg0, arg1, arg2, arg3);
	}

	public final void perspective() {
		parent.perspective();
	}

	public final void pushMatrix() {
		parent.pushMatrix();
	}

	public final void frameMoved(int arg0, int arg1) {
		parent.frameMoved(arg0, arg1);
	}

	public final int lerpColor(int arg0, int arg1, float arg2) {
		return parent.lerpColor(arg0, arg1, arg2);
	}

	public final void frameResized(int arg0, int arg1) {
		parent.frameResized(arg0, arg1);
	}

	public final float alpha(int arg0) {
		return parent.alpha(arg0);
	}

	public final void attrib(String arg0, float... arg1) {
		parent.attrib(arg0, arg1);
	}

	public final void attrib(String arg0, boolean... arg1) {
		parent.attrib(arg0, arg1);
	}

	public final void attrib(String arg0, int... arg1) {
		parent.attrib(arg0, arg1);
	}

	public final void texture(processing.core.PImage arg0) {
		parent.texture(arg0);
	}

	public final processing.opengl.PGL beginPGL() {
		return parent.beginPGL();
	}

	public final void clip(float arg0, float arg1, float arg2, float arg3) {
		parent.clip(arg0, arg1, arg2, arg3);
	}

	public final void shader(processing.opengl.PShader arg0) {
		parent.shader(arg0);
	}

	public final void shader(processing.opengl.PShader arg0, int arg1) {
		parent.shader(arg0, arg1);
	}

	public final void beginRecord(processing.core.PGraphics arg0) {
		parent.beginRecord(arg0);
	}

	public final processing.core.PGraphics beginRecord(String arg0, String arg1) {
		return parent.beginRecord(arg0, arg1);
	}

	public final void endRaw() {
		parent.endRaw();
	}

	public final void attribNormal(String arg0, float arg1, float arg2, float arg3) {
		parent.attribNormal(arg0, arg1, arg2, arg3);
	}

	public final void loadPixels() {
		parent.loadPixels();
	}

	public final void textureWrap(int arg0) {
		parent.textureWrap(arg0);
	}

	public final void noTexture() {
		parent.noTexture();
	}

	public final void endPGL() {
		parent.endPGL();
	}

	public final void hint(int arg0) {
		parent.hint(arg0);
	}

	public final void textureMode(int arg0) {
		parent.textureMode(arg0);
	}

	public final void vertex(float arg0, float arg1, float arg2) {
		parent.vertex(arg0, arg1, arg2);
	}

	public final void vertex(float arg0, float arg1, float arg2, float arg3) {
		parent.vertex(arg0, arg1, arg2, arg3);
	}

	public final void vertex(float arg0, float arg1) {
		parent.vertex(arg0, arg1);
	}

	public final void vertex(float[] arg0) {
		parent.vertex(arg0);
	}

	public final void vertex(float arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.vertex(arg0, arg1, arg2, arg3, arg4);
	}

	public final void endRecord() {
		parent.endRecord();
	}

	public final processing.core.PGraphics beginRaw(String arg0, String arg1) {
		return parent.beginRaw(arg0, arg1);
	}

	public final void beginRaw(processing.core.PGraphics arg0) {
		parent.beginRaw(arg0);
	}

	public final void attribColor(String arg0, int arg1) {
		parent.attribColor(arg0, arg1);
	}

	public final void endContour() {
		parent.endContour();
	}

	public final void endShape() {
		parent.endShape();
	}

	public final void endShape(int arg0) {
		parent.endShape(arg0);
	}

	public final processing.core.PShape loadShape(String arg0, String arg1) {
		return parent.loadShape(arg0, arg1);
	}

	public final processing.core.PShape loadShape(String arg0) {
		return parent.loadShape(arg0);
	}

	public final void updatePixels(int arg0, int arg1, int arg2, int arg3) {
		parent.updatePixels(arg0, arg1, arg2, arg3);
	}

	public final void updatePixels() {
		parent.updatePixels();
	}

	public final void edge(boolean arg0) {
		parent.edge(arg0);
	}

	public final processing.core.PShape createShape() {
		return parent.createShape();
	}

	public final processing.core.PShape createShape(int arg0, float... arg1) {
		return parent.createShape(arg0, arg1);
	}

	public final processing.core.PShape createShape(int arg0) {
		return parent.createShape(arg0);
	}

	public final void resetShader(int arg0) {
		parent.resetShader(arg0);
	}

	public final void resetShader() {
		parent.resetShader();
	}

	public final void beginShape(int arg0) {
		parent.beginShape(arg0);
	}

	public final void beginShape() {
		parent.beginShape();
	}

	public final void normal(float arg0, float arg1, float arg2) {
		parent.normal(arg0, arg1, arg2);
	}

	public final processing.opengl.PShader loadShader(String arg0) {
		return parent.loadShader(arg0);
	}

	public final processing.opengl.PShader loadShader(String arg0, String arg1) {
		return parent.loadShader(arg0, arg1);
	}

	public final void attribPosition(String arg0, float arg1, float arg2, float arg3) {
		parent.attribPosition(arg0, arg1, arg2, arg3);
	}

	public final void beginContour() {
		parent.beginContour();
	}

	public final float bezierTangent(float arg0, float arg1, float arg2, float arg3, float arg4) {
		return parent.bezierTangent(arg0, arg1, arg2, arg3, arg4);
	}

	public final void sphere(float arg0) {
		parent.sphere(arg0);
	}

	public final void noClip() {
		parent.noClip();
	}

	public final void imageMode(int arg0) {
		parent.imageMode(arg0);
	}

	public final void quadraticVertex(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.quadraticVertex(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void quadraticVertex(float arg0, float arg1, float arg2, float arg3) {
		parent.quadraticVertex(arg0, arg1, arg2, arg3);
	}

	public final void curveVertex(float arg0, float arg1, float arg2) {
		parent.curveVertex(arg0, arg1, arg2);
	}

	public final void curveVertex(float arg0, float arg1) {
		parent.curveVertex(arg0, arg1);
	}

	public final void shapeMode(int arg0) {
		parent.shapeMode(arg0);
	}

	public final float textAscent() {
		return parent.textAscent();
	}

	public final void ellipse(float arg0, float arg1, float arg2, float arg3) {
		parent.ellipse(arg0, arg1, arg2, arg3);
	}

	public final void textAlign(int arg0, int arg1) {
		parent.textAlign(arg0, arg1);
	}

	public final void textAlign(int arg0) {
		parent.textAlign(arg0);
	}

	public final float textDescent() {
		return parent.textDescent();
	}

	public final void arc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.arc(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void arc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
		parent.arc(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public final void triangle(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.triangle(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void box(float arg0) {
		parent.box(arg0);
	}

	public final void box(float arg0, float arg1, float arg2) {
		parent.box(arg0, arg1, arg2);
	}

	public final void bezierDetail(int arg0) {
		parent.bezierDetail(arg0);
	}

	public final float curvePoint(float arg0, float arg1, float arg2, float arg3, float arg4) {
		return parent.curvePoint(arg0, arg1, arg2, arg3, arg4);
	}

	public final float curveTangent(float arg0, float arg1, float arg2, float arg3, float arg4) {
		return parent.curveTangent(arg0, arg1, arg2, arg3, arg4);
	}

	public final void curveDetail(int arg0) {
		parent.curveDetail(arg0);
	}

	public final void curveTightness(float arg0) {
		parent.curveTightness(arg0);
	}

	public final void curve(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		parent.curve(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public final void curve(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11) {
		parent.curve(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	public final void rectMode(int arg0) {
		parent.rectMode(arg0);
	}

	public final void textFont(processing.core.PFont arg0, float arg1) {
		parent.textFont(arg0, arg1);
	}

	public final void textFont(processing.core.PFont arg0) {
		parent.textFont(arg0);
	}

	public final void ellipseMode(int arg0) {
		parent.ellipseMode(arg0);
	}

	public final void blendMode(int arg0) {
		parent.blendMode(arg0);
	}

	public final void textLeading(float arg0) {
		parent.textLeading(arg0);
	}

	public final float bezierPoint(float arg0, float arg1, float arg2, float arg3, float arg4) {
		return parent.bezierPoint(arg0, arg1, arg2, arg3, arg4);
	}

	public final void bezierVertex(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.bezierVertex(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void bezierVertex(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		parent.bezierVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public final void bezier(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		parent.bezier(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public final void bezier(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11) {
		parent.bezier(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	public final void shape(processing.core.PShape arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.shape(arg0, arg1, arg2, arg3, arg4);
	}

	public final void shape(processing.core.PShape arg0) {
		parent.shape(arg0);
	}

	public final void shape(processing.core.PShape arg0, float arg1, float arg2) {
		parent.shape(arg0, arg1, arg2);
	}

	public final void quad(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		parent.quad(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public final void rect(float arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.rect(arg0, arg1, arg2, arg3, arg4);
	}

	public final void rect(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		parent.rect(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public final void rect(float arg0, float arg1, float arg2, float arg3) {
		parent.rect(arg0, arg1, arg2, arg3);
	}

	public final void sphereDetail(int arg0, int arg1) {
		parent.sphereDetail(arg0, arg1);
	}

	public final void sphereDetail(int arg0) {
		parent.sphereDetail(arg0);
	}

	public final void point(float arg0, float arg1, float arg2) {
		parent.point(arg0, arg1, arg2);
	}

	public final void point(float arg0, float arg1) {
		parent.point(arg0, arg1);
	}

	public final void noTint() {
		parent.noTint();
	}

	public final void specular(float arg0) {
		parent.specular(arg0);
	}

	public final void specular(int arg0) {
		parent.specular(arg0);
	}

	public final void specular(float arg0, float arg1, float arg2) {
		parent.specular(arg0, arg1, arg2);
	}

	public final void lightFalloff(float arg0, float arg1, float arg2) {
		parent.lightFalloff(arg0, arg1, arg2);
	}

	public final void blend(processing.core.PImage arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		parent.blend(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	public final void blend(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		parent.blend(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public final float screenY(float arg0, float arg1, float arg2) {
		return parent.screenY(arg0, arg1, arg2);
	}

	public final float screenY(float arg0, float arg1) {
		return parent.screenY(arg0, arg1);
	}

	public final void pointLight(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.pointLight(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final float saturation(int arg0) {
		return parent.saturation(arg0);
	}

	public final void lights() {
		parent.lights();
	}

	public final void stroke(float arg0) {
		parent.stroke(arg0);
	}

	public final void stroke(int arg0, float arg1) {
		parent.stroke(arg0, arg1);
	}

	public final void stroke(int arg0) {
		parent.stroke(arg0);
	}

	public final void stroke(float arg0, float arg1) {
		parent.stroke(arg0, arg1);
	}

	public final void stroke(float arg0, float arg1, float arg2) {
		parent.stroke(arg0, arg1, arg2);
	}

	public final void stroke(float arg0, float arg1, float arg2, float arg3) {
		parent.stroke(arg0, arg1, arg2, arg3);
	}

	public final float brightness(int arg0) {
		return parent.brightness(arg0);
	}

	public final void noFill() {
		parent.noFill();
	}

	public final void emissive(int arg0) {
		parent.emissive(arg0);
	}

	public final void emissive(float arg0, float arg1, float arg2) {
		parent.emissive(arg0, arg1, arg2);
	}

	public final void emissive(float arg0) {
		parent.emissive(arg0);
	}

	public final void directionalLight(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.directionalLight(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final float screenX(float arg0, float arg1) {
		return parent.screenX(arg0, arg1);
	}

	public final float screenX(float arg0, float arg1, float arg2) {
		return parent.screenX(arg0, arg1, arg2);
	}

	public final void ambientLight(float arg0, float arg1, float arg2) {
		parent.ambientLight(arg0, arg1, arg2);
	}

	public final void ambientLight(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.ambientLight(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final void pushStyle() {
		parent.pushStyle();
	}

	public final void shininess(float arg0) {
		parent.shininess(arg0);
	}

	public final void popStyle() {
		parent.popStyle();
	}

	public final void ambient(int arg0) {
		parent.ambient(arg0);
	}

	public final void ambient(float arg0) {
		parent.ambient(arg0);
	}

	public final void ambient(float arg0, float arg1, float arg2) {
		parent.ambient(arg0, arg1, arg2);
	}

	public final void strokeJoin(int arg0) {
		parent.strokeJoin(arg0);
	}

	public final void tint(float arg0, float arg1, float arg2, float arg3) {
		parent.tint(arg0, arg1, arg2, arg3);
	}

	public final void tint(float arg0, float arg1, float arg2) {
		parent.tint(arg0, arg1, arg2);
	}

	public final void tint(int arg0) {
		parent.tint(arg0);
	}

	public final void tint(int arg0, float arg1) {
		parent.tint(arg0, arg1);
	}

	public final void tint(float arg0) {
		parent.tint(arg0);
	}

	public final void tint(float arg0, float arg1) {
		parent.tint(arg0, arg1);
	}

	public final void noLights() {
		parent.noLights();
	}

	public final float modelX(float arg0, float arg1, float arg2) {
		return parent.modelX(arg0, arg1, arg2);
	}

	public final void strokeWeight(float arg0) {
		parent.strokeWeight(arg0);
	}

	public final void printProjection() {
		parent.printProjection();
	}

	public final float green(int arg0) {
		return parent.green(arg0);
	}

	public final float blue(int arg0) {
		return parent.blue(arg0);
	}

	public final void style(processing.core.PStyle arg0) {
		parent.style(arg0);
	}

	public final void colorMode(int arg0, float arg1, float arg2, float arg3, float arg4) {
		parent.colorMode(arg0, arg1, arg2, arg3, arg4);
	}

	public final void colorMode(int arg0, float arg1) {
		parent.colorMode(arg0, arg1);
	}

	public final void colorMode(int arg0, float arg1, float arg2, float arg3) {
		parent.colorMode(arg0, arg1, arg2, arg3);
	}

	public final void colorMode(int arg0) {
		parent.colorMode(arg0);
	}

	public final void background(int arg0) {
		parent.background(arg0);
	}

	public final void background(float arg0) {
		parent.background(arg0);
	}

	public final void background(int arg0, float arg1) {
		parent.background(arg0, arg1);
	}

	public final void background(float arg0, float arg1) {
		parent.background(arg0, arg1);
	}

	public final void background(processing.core.PImage arg0) {
		parent.background(arg0);
	}

	public final void background(float arg0, float arg1, float arg2, float arg3) {
		parent.background(arg0, arg1, arg2, arg3);
	}

	public final void background(float arg0, float arg1, float arg2) {
		parent.background(arg0, arg1, arg2);
	}

	public final void noStroke() {
		parent.noStroke();
	}

	public final void frustum(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		parent.frustum(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public final float screenZ(float arg0, float arg1, float arg2) {
		return parent.screenZ(arg0, arg1, arg2);
	}

	public final float modelZ(float arg0, float arg1, float arg2) {
		return parent.modelZ(arg0, arg1, arg2);
	}

	public final void strokeCap(int arg0) {
		parent.strokeCap(arg0);
	}

	public final void spotLight(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10) {
		parent.spotLight(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	public final float modelY(float arg0, float arg1, float arg2) {
		return parent.modelY(arg0, arg1, arg2);
	}

	public final float hue(int arg0) {
		return parent.hue(arg0);
	}

	public final void lightSpecular(float arg0, float arg1, float arg2) {
		parent.lightSpecular(arg0, arg1, arg2);
	}
















}
