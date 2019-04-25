package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;

public class StartEndHandlerFactory implements IHandlerFactory {

	private IIntervalFactory modifiedIntervalFactory;
	
	public StartEndHandlerFactory(IIntervalFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		
		return new StartEndIntervalHandler(input, arrayDecorator, modifiedIntervalFactory);
	}

}
