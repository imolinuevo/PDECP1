package visitor.figure;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
	private Collection<Figure> coleccion = new ArrayList<Figure>();

	public VisitorMain() {
		coleccion.add(new Triangle(6));
		coleccion.add(new Circle(5));
		coleccion.add(new Square(4));
	}

	public void visitadorArea() {
		VisitorArea vArea = new VisitorArea();
		for (Figure figure : coleccion) {
			figure.accept(vArea);
		}
	}

	public void visitadorLados() {
		VisitorSides vSides = new VisitorSides();
		for (Figure figure : coleccion) {
			figure.accept(vSides);
		}
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorMain());
	}
}