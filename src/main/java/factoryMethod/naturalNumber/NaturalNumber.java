package factoryMethod.naturalNumber;

public class NaturalNumber {

	protected int value;

	public NaturalNumber() {
		this.value = 0;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public String getTextValue() {
		return "!!!";
	}

}
