package state.connection;

public class Conexion {
	private State state;

	private Link link;
	
	private Estado estado;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = Estado.CERRADO;
		this.setState(new StateCerrado());
	}

	protected void setState(State state) {
		this.state = state;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Link getLink() {
		return link;
	}

	public void abrir() {
		this.state.abrir(this);
	}

	public void cerrar() {
		this.state.cerrar(this);
	}

	public void parar() {
		this.state.parar(this);
	}

	public void iniciar() {
		this.state.iniciar(this);
	}

	public void enviar(String msg) {
		this.link.enviar(msg);
		this.state.enviar(this);
	}

	public void recibir(int respuesta) {
		this.state.recibir(this, respuesta);
	}

}