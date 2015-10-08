package command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Command {

	public SubtractCommand(Calculator calculator) {
		this.calculator = calculator;
	}

	public void execute() {
		this.calculator.subtract(IO.getIO().readInt("How much to subtract?"));
	}

	public String name() {
		return "Subtract";
	}

}
