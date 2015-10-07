package texto;

public class Texto extends Compuesto {

	@Override
	public void add(Componente componente) {

	}

	@Override
	public String dibujar(boolean forzar) {
		String result = new String();
		for (Componente componente : componentes) {
			result += componente.dibujar(forzar);
		}
		result += "---o---\n";
		return result;
	}

	public void remove(Componente componente) {

	}

}
