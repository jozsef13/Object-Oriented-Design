package Command;

import java.util.Map;

import InputOutput.IInput;

public class CommandsExecutor {
	private IInput input;
	private Map<Integer, ICommandHandler> dispatcher;

	
	public CommandsExecutor(IInput input, Map<Integer, ICommandHandler> dispatcher) {
		super();
		this.input = input;
		this.dispatcher = dispatcher;
	}


	public void execute(){
		while(input.hasData()){
			int opCode = input.nextInt();
			ICommandHandler commandHandler = dispatcher.get(opCode);
			commandHandler.execute();
		}
	}
}
