package state.connection;

public class StateEsperando extends State {

	@Override
	protected void recibir(Conexion conexion, int respuesta) {
		if (respuesta == 0) {
			conexion.setState(new StatePreparado());
			conexion.setEstado(Estado.PREPARADO);
		} else if (respuesta > 0) {
			conexion.setState(new StateCerrado());
			conexion.setEstado(Estado.CERRADO);
		} else {
			assert false;
		}

	}

}
