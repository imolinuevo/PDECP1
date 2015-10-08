package decorator.vehiculos;

public class EDS extends Extra {

	public EDS(Componente componente) {
		super(componente);
		this.precio = 300;
		this.descripcion = "EDS.";
	}

	@Override
	public String descripcionFinal() {
		return this.componente.getDescripcion() + this.descripcion;
	}

	@Override
	public int precioFinal() {
		return this.componente.getPrecio() + this.precio;
	}

}
