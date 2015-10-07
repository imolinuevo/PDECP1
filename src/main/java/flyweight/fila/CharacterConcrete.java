package flyweight.fila;

public class CharacterConcrete {

	private char intrinsic;

	public CharacterConcrete(char intrinsic) {
		this.intrinsic = intrinsic;
	}

	public char getIntrinsic() {
		return this.intrinsic;
	}

	public char mayus() {
		return Character.toUpperCase(this.intrinsic);
	}

}
