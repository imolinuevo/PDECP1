package texto;

public class Compuesto extends Componente {

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public void add(Componente componente) {
		
	}

	@Override
	public String dibujar(boolean forzar) {
		return null;
	}

}
