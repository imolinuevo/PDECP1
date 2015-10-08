package decorator.vehiculos;

public class GPS extends Extra {

	public GPS(Componente componente) {
		super(componente);
		this.precio = 100;
		this.descripcion = "Localizador GPS.";
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
