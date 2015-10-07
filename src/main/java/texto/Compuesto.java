package texto;

import java.util.ArrayList;

public class Compuesto extends Componente {
	
	protected ArrayList<Componente> componentes;
	
	public Compuesto() {
		componentes = new ArrayList<Componente>();
	}

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
