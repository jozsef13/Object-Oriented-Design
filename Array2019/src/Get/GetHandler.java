package Get;

import Array.IArray;
import Command.ICommandHandler;
import InputOutput.IInput;
import InputOutput.IOutput;

public class GetHandler implements ICommandHandler {
	private IInput input;
	private IArray array;
	private IOutput output;
	
	public GetHandler(IInput input, IArray array, IOutput output) {
		super();
		this.input = input;
		this.array = array;
		this.output = output;
	}
	
	@Override
	public void execute() {
		int index = input.nextInt();
		int value = array.getValueAt(index);
		output.print(value);
	}
} 
