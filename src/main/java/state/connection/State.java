package state.connection;

public abstract class State {
	protected void abrir(Conexion conexion) {
		throw new UnsupportedOperationException();
	}

	protected void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException();
	}
	
	protected void parar(Conexion conexion) {
		throw new UnsupportedOperationException();
	}
	
	protected void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException();
	}
	
	protected void enviar(Conexion conexion) {
		throw new UnsupportedOperationException();
	}
	
	protected void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException();
	}
}
