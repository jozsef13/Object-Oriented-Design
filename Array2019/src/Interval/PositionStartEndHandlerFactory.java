package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;
import Rotate.IRotatePositionStartEndFactory;

public class PositionStartEndHandlerFactory implements IHandlerFactory {

	private IRotatePositionStartEndFactory modifiedIntervalFactory;

	public PositionStartEndHandlerFactory(IRotatePositionStartEndFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		return new PositionStartEndHandlerInterval(input, modifiedIntervalFactory, arrayDecorator);
	}
}
