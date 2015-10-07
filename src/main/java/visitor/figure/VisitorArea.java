package visitor.figure;

public class VisitorArea extends Visitor {

	private double totalArea;

	private double higherArea;
	
	public VisitorArea() {
		totalArea = 0;
		higherArea = 0;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public double getHigherArea() {
		return higherArea;
	}

	@Override
	void visitTriangle(Triangle triangle) {
		totalArea += triangle.getArea();
		if (higherArea < triangle.getArea()) {
			higherArea = triangle.getArea();
		}
	}

	@Override
	void visitCircle(Circle circle) {
		totalArea += circle.getArea();
		if (higherArea < circle.getArea()) {
			higherArea = circle.getArea();
		}
	}

	@Override
	void visitSquare(Square square) {
		totalArea += square.getArea();
		if (higherArea < square.getArea()) {
			higherArea = square.getArea();
		}
	}

}
