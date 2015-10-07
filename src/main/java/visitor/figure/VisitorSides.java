package visitor.figure;

public class VisitorSides extends Visitor {

	private double totalSides;

	private double higherSides;

	public VisitorSides() {
		totalSides = 0;
		higherSides = 0;
	}

	public double getTotalSides() {
		return totalSides;
	}

	public double getHigherSides() {
		return higherSides;
	}

	@Override
	void visitTriangle(Triangle triangle) {
		totalSides += triangle.getSides();
		if (higherSides < triangle.getSides()) {
			higherSides = triangle.getSides();
		}
	}

	@Override
	void visitCircle(Circle circle) {
		totalSides += circle.getSides();
		if (higherSides < circle.getSides()) {
			higherSides = circle.getSides();
		}
	}

	@Override
	void visitSquare(Square square) {
		totalSides += square.getSides();
		if (higherSides < square.getSides()) {
			higherSides = square.getSides();
		}
	}

}
