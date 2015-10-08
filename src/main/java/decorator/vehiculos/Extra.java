package decorator.vehiculos;

public class Extra extends Componente {

	protected Componente componente;

	protected String descripcion;

	public Extra(Componente componente) {
		this.componente = componente;
	}

	public Componente getComponente() {
		return this.componente;
	}

}
