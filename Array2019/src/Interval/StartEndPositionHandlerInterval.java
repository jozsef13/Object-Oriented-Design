package Interval;

import Array.IArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;
import Rotate.IRotateStartEndPositionFactory;

public class StartEndPositionHandlerInterval implements ICommandHandler {

	private IInput input;
	private IRotateStartEndPositionFactory modifiedIntervalFactory;
	private IArrayDecorator arrayDecorator;

	public StartEndPositionHandlerInterval(IInput input, IRotateStartEndPositionFactory modifiedIntervalFactory,
			IArrayDecorator arrayDecorator) {
		super();
		this.input = input;
		this.modifiedIntervalFactory = modifiedIntervalFactory;
		this.arrayDecorator = arrayDecorator;
	}

	@Override
	public void execute() {
		int start = input.nextInt();
		int end = input.nextInt();
		int position = input.nextInt();
		IModifiedInterval interval = modifiedIntervalFactory.build(start, end, position);
		arrayDecorator.addInterval(interval);
	}

}
