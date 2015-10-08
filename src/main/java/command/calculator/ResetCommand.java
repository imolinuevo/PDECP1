package command.calculator;

public class ResetCommand extends Command {

	public ResetCommand(Calculator calculator) {
		this.calculator = calculator;
	}

	public void execute() {
		this.calculator.reset();
	}

	public String name() {
		return "Reset";
	}

}
