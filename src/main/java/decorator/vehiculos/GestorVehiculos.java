package decorator.vehiculos;

public class GestorVehiculos {

	public void gestionar() {
		Componente a3 = new Vehiculo("A3", 1000);
	}

	public static void main(String[] args) {
		new GestorVehiculos().gestionar();
	}

}
