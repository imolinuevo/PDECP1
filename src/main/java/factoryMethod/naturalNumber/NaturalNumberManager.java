package factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator naturalNumberCreator;

	private NaturalNumber naturalNumber;
	
	public NaturalNumberManager() {
		this.naturalNumber = new NaturalNumberEs();
	}

	public NaturalNumber getNaturalNumber() {
		return this.naturalNumber;
	}

	public void setNaturalNumberCreator(
			NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}
	
	public void createNaturalNumber() {
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber();
	}

}
