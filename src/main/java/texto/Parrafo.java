package texto;

public class Parrafo extends Compuesto {

	@Override
	public void add(Componente componente) {
		if (!componente.isComposite()) {
			componentes.add(componente);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String dibujar(boolean forzar) {
		String result = new String();
		for (Componente componente : componentes) {
			result += componente.dibujar(forzar);
		}
		result += "\n";
		return result;
	}

	public void remove(Componente componente) {
		if (!componente.isComposite()) {
			componentes.remove(componente);
		}
	}

}
