package visitor.figure;

public class Figure {

	protected double sides;

	protected double area;

	public double getSides() {
		return sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void accept(Visitor v) {

	}
}
