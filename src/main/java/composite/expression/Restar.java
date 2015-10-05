package composite.expression;

public class Restar extends Operacion {

	public Restar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {
		return expresiones[0].operar() - expresiones[1].operar();
	}

	@Override
	public String toString() {
		return "(" + expresiones[0].toString() + "-"
				+ expresiones[1].toString() + ")";
	}

}
