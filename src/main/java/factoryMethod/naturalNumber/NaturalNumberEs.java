package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

	private final String[] textValue = { "cero", "uno", "dos", "tres",
			"cuatro", "cinco" };

	@Override
	public String getTextValue() {
		if (this.value < textValue.length) {
			return this.textValue[this.value];
		} else {
			return "???";
		}
	}
}
