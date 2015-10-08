package memento.calculator;

public class SaveCommand extends Command {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public SaveCommand(Calculator calculator,
			GestorMementos<MementoCalculadora> gestorMementos) {
		this.calculator = calculator;
		this.gestorMementos = gestorMementos;
	}

	public void execute() {
		MementoCalculadora mementoCalculadora = this.calculator.createMemento();
		gestorMementos.addMemento(mementoCalculadora.getKey(), mementoCalculadora);
	}

	public String name() {
		return "Save";
	}

}
