package visitor.figure;

public abstract class Visitor {

	abstract void visitTriangle(Triangle triangle);

	abstract void visitCircle(Circle circle);

	abstract void visitSquare(Square square);

}
