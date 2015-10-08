package decorator.vehiculos;

public class Componente {
	
	protected int precio;
	
	protected String descripcion;
	
	protected int getPrecio() {
		return this.precio;
	}
	
	protected String getDescripcion() {
		return this.descripcion;
	}
	
	public String descripcionFinal() {
		return null;
	}
	
	public int precioFinal() {
		return 0;
	}

}
