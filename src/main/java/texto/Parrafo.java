package texto;

public class Parrafo extends Compuesto {

	@Override
	public void add(Componente componente) {

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

	}

}
