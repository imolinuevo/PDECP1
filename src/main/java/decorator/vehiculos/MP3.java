package decorator.vehiculos;

public class MP3 extends Extra {

	public MP3(Componente componente) {
		super(componente);
		this.precio = 200;
		this.descripcion = "Reproductor MP3.";
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
