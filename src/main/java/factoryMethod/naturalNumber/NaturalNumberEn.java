package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	
	private final String[] textValue = { "nill", "one", "two", "three", "four",
			"five" };

	@Override
	public String getTextValue() {
		if (this.value < textValue.length) {
			return this.textValue[this.value];
		} else {
			return "???";
		}
	}

}
