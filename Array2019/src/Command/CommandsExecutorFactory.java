package Command;
import java.io.FileNotFoundException;
import java.util.Map;

import InputOutput.IInput;
import InputOutput.IInputFactory;
import OOD.IDispatchFactory;

public class CommandsExecutorFactory implements ICommandsFactory{

	private IInputFactory inputFactory;
	private IDispatchFactory dispatcherFactory;
	

	public CommandsExecutorFactory(IInputFactory inputFactory, IDispatchFactory dispatcherFactory) {
		super();
		this.inputFactory = inputFactory;
		this.dispatcherFactory = dispatcherFactory;
	}


	public CommandsExecutor build(String fileName) throws FileNotFoundException{
		IInput input = inputFactory.build(fileName);
		Map<Integer, ICommandHandler> dispatcher = dispatcherFactory.build(input);
		return new CommandsExecutor(input, dispatcher);
	}
}
