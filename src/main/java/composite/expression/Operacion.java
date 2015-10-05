package composite.expression;

public class Operacion extends Expresion {

	protected Expresion[] expresiones;

	public Operacion(Expresion exp1, Expresion exp2) {
		this.expresiones = new Expresion[2];
		this.expresiones[0] = exp1;
		this.expresiones[1] = exp2;
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public int operar() {
		return 0;
	}

}
