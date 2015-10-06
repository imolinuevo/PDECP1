package state.connection;

public class StateParado extends State {

	@Override
	protected void parar(Conexion conexion) {
		conexion.setState(new StateParado());
		conexion.setEstado(Estado.PARADO);
	}

	@Override
	protected void iniciar(Conexion conexion) {
		conexion.setState(new StatePreparado());
		conexion.setEstado(Estado.PREPARADO);
	}

}
