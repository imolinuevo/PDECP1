package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

	private final String[] textValue = { "zero", "un", "deux", "trois",
			"quatre", "cinq" };

	@Override
	public String getTextValue() {
		if (this.value < textValue.length) {
			return this.textValue[this.value];
		} else {
			return "???";
		}
	}
}
