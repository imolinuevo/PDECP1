package state.connection;

public class StatePreparado extends State {
	
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

	@Override
	protected void enviar(Conexion conexion) {
		conexion.setState(new StateEsperando());
		conexion.setEstado(Estado.ESPERANDO);
		
	}

}
