package memento.calculator;

public class MementoCalculadora {
	
	private int value;
	
	private String key;

	public MementoCalculadora(int value, String key) {
		this.value = value;
		this.key = key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getKey() {
		return this.key;
	}

}
