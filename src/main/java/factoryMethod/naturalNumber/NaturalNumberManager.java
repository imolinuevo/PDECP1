package factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator naturalNumberCreator;

	private NaturalNumber naturalNumber;

	public NaturalNumber getNaturalNumber() {
		return this.naturalNumber;
	}

	public void setNaturalNumberCreator(
			NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}

}
