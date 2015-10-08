package visitor.figure;

public class Square extends Figure {

	public Square(int sideLength) {
		this.sides = 4;
		this.area = sideLength * sideLength;
	}

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
	}

}
