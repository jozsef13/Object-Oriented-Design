package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;
import Rotate.IRotatePositionStartEndFactory;

public class PositionEndStartHandlerFactory implements IHandlerFactory {
	private IRotatePositionStartEndFactory modifiedIntervalFactory;
	
	public PositionEndStartHandlerFactory(IRotatePositionStartEndFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		return new PositionEndStartIntervalHandler(input, modifiedIntervalFactory, arrayDecorator);
	}
}
