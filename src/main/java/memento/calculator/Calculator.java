package memento.calculator;

import upm.jbb.IO;

public class Calculator implements Mementable<MementoCalculadora> {
	private int total;

	public Calculator() {
		this.reset();
	}

	public int getTotal() {
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void add(int valor) {
		this.setTotal(this.total + valor);
	}

	public void subtract(int valor) {
		this.setTotal(this.total - valor);
	}

	public void reset() {
		this.setTotal(0);
	}

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(total, IO.getIO().readString("Name of state:"));
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		total = memento.getValue();
	}

}