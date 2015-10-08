package memento.calculator;

import upm.jbb.IO;

public class RevertCommand extends Command {
	
	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public RevertCommand(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		this.calculator = calculator;
		this.gestorMementos = gestorMementos;
	}
	
	public void execute() {
		this.calculator.restoreMemento(gestorMementos.getMemento((String) IO.getIO().select(gestorMementos.keys())));
	}
	
	public String name() {
		return "Revert";
	}

}
