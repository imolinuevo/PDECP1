package visitor.figure;

public class Circle extends Figure {

	public Circle(int radius) {
		this.sides = Double.POSITIVE_INFINITY;
		this.area = 2 * Math.PI * radius;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitCircle(this);
	}

}
