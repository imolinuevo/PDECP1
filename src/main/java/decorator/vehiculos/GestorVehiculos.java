package decorator.vehiculos;

public class GestorVehiculos {

	public void gestionar() {
		Componente a3 = new Vehiculo("A3", 1000);
		System.out.println(a3.getPrecio());
		Componente a3m = new MP3(a3);
		System.out.println(a3m.getPrecio());
		System.out.println(a3m.precioFinal());
		Componente a3mg = new GPS(a3);
		System.out.println(a3mg.precioFinal());
	}

	public static void main(String[] args) {
		new GestorVehiculos().gestionar();
	}

}
