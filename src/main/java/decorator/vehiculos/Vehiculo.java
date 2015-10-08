package decorator.vehiculos;

public class Vehiculo extends Componente {
	
	private String modelo;
	
	public Vehiculo(String modelo, int precio) {
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getModelo() {
		return this.modelo;
	}
}
