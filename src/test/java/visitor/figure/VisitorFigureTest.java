package visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {
	private Collection<Figure> coleccion = new ArrayList<Figure>();

	@Before
	public void before() {
		coleccion.add(new Triangle(6));
		coleccion.add(new Circle(5));
		coleccion.add(new Square(4));
	}

	@Test
	public void testVisitorTotalArea() {
		VisitorArea vArea = new VisitorArea();
		for (Figure figure : coleccion) {
            figure.accept(vArea);
        }
		assertEquals(63, vArea.getTotalArea(), 0.01);
	}
	
	@Test
	public void testVisitorHigherArea() {
		VisitorArea vArea = new VisitorArea();
		for (Figure figure : coleccion) {
            figure.accept(vArea);
        }
		assertEquals(31.41, vArea.getHigherArea(), 0.01);
	}
	
	@Test
	public void testVisitorTotalSides() {
		VisitorSides vSides = new VisitorSides();
		for (Figure figure : coleccion) {
            figure.accept(vSides);
        }
		assertEquals(Double.POSITIVE_INFINITY, vSides.getTotalSides(), 0.01);
	}
	
	@Test
	public void testVisitorHigherSides() {
		VisitorSides vSides = new VisitorSides();
		for (Figure figure : coleccion) {
            figure.accept(vSides);
        }
		assertEquals(Double.POSITIVE_INFINITY, vSides.getHigherSides(), 0.01);
	}

}
