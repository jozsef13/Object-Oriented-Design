package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;

public class EndStartHandlerFactory implements IHandlerFactory {

	private IIntervalFactory modifiedIntervalFactory;

	public EndStartHandlerFactory(IIntervalFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		
		return new EndStartIntervalHandler(input, arrayDecorator, modifiedIntervalFactory);
	}

}
