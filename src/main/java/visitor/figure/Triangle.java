package visitor.figure;

public class Triangle extends Figure {

	public Triangle(int sideLegnth) {
		this.sides = 3;
		this.area = (sideLegnth * sideLegnth * Math.sqrt(3)) / 4;
	}

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);
	}

}
