package texto;

public class Caracter extends Componente {

	private char intrinsic;

	public Caracter(char intrinsic) {
		this.intrinsic = intrinsic;
	}

	public char getIntrinsic() {
		return this.intrinsic;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void add(Componente componente) {

	}

	@Override
	public String dibujar(boolean forzar) {
		if (!forzar) {
			return Character.toString(intrinsic);
		} else {
			return Character.toString(intrinsic).toUpperCase();
		}
	}

}
