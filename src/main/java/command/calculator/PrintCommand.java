package command.calculator;

import upm.jbb.IO;

public class PrintCommand extends Command {

	public PrintCommand(Calculator calculator) {
		this.calculator = calculator;
	}

	public void execute() {
		IO.getIO().println(this.calculator.getTotal());
	}

	public String name() {
		return "Print";
	}

}
