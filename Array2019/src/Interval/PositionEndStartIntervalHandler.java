package Interval;

import Array.IArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;
import Rotate.IRotatePositionStartEndFactory;

public class PositionEndStartIntervalHandler implements ICommandHandler {
	
	private IInput input;
	private IRotatePositionStartEndFactory modifiedIntervalFactory;
	private IArrayDecorator arrayDecorator;

	public PositionEndStartIntervalHandler(IInput input, IRotatePositionStartEndFactory modifiedIntervalFactory,
			IArrayDecorator arrayDecorator) {
		super();
		this.input = input;
		this.modifiedIntervalFactory = modifiedIntervalFactory;
		this.arrayDecorator = arrayDecorator;
	}

	@Override
	public void execute() {
		int position = input.nextInt();
		int start = input.nextInt();
		int end = input.nextInt();
		IModifiedInterval interval = modifiedIntervalFactory.build(position, end, start);
		arrayDecorator.addInterval(interval);
	}

}
