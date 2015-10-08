package memento.calculator;

import upm.jbb.IO;

public class AddCommand extends Command {

	public AddCommand(Calculator calculator) {
		this.calculator = calculator;
	}

	public void execute() {
		this.calculator.add(IO.getIO().readInt("How much to add?"));
	}
	
	public String name() {
		return "Add";
	}

}
