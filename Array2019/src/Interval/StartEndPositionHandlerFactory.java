package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;
import Rotate.IRotateStartEndPositionFactory;

public class StartEndPositionHandlerFactory implements IHandlerFactory {

	private IRotateStartEndPositionFactory modifiedIntervalFactory;

	public StartEndPositionHandlerFactory(IRotateStartEndPositionFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		return new StartEndPositionHandlerInterval(input, modifiedIntervalFactory, arrayDecorator);
	}

}
