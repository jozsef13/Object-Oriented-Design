package Interval;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import InputOutput.IInput;
import Rotate.IRotateStartEndPositionFactory;

public class EndStartPositionHandlerFactory implements IHandlerFactory {

	private IRotateStartEndPositionFactory modifiedIntervalFactory;

	public EndStartPositionHandlerFactory(IRotateStartEndPositionFactory modifiedIntervalFactory) {
		super();
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		return new EndStartPositionIntervalHandler(input, modifiedIntervalFactory, arrayDecorator);
	}

}
