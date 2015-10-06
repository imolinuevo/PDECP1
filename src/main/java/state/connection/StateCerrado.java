package state.connection;

public class StateCerrado extends State {

	@Override
	protected void abrir(Conexion conexion) {
		conexion.setState(new StatePreparado());
		conexion.setEstado(Estado.PREPARADO);
	}

	@Override
	 protected void cerrar(Conexion conexion) {
		conexion.setState(new StateCerrado());
		conexion.setEstado(Estado.CERRADO);
	}

}
