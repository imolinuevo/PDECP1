package visitor.element;

public class Visitor2 extends Visitor {

	private int countA;

	private int countB;

	public Visitor2() {
		this.countA = 0;
		this.countB = 0;
	}

	@Override
	public void visitElementA(ElementA e) {
		this.countA++;
	}

	@Override
	public void visitElementB(ElementB e) {
		this.countB++;
	}

	public int getAs() {
		return this.countA;
	}

	public int getBs() {
		return this.countB;
	}

}
