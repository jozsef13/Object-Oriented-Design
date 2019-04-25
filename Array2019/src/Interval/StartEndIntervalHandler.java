package Interval;

import Array.IArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;

public class StartEndIntervalHandler implements ICommandHandler {
	private IInput input;
	private IArrayDecorator arrayDecorator;
	private IIntervalFactory modifiedIntervalFactory;
	
	public StartEndIntervalHandler(IInput input, IArrayDecorator arrayDecorator, IIntervalFactory modifiedIntervalFactory) {
		super();
		this.input = input;
		this.arrayDecorator = arrayDecorator;
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}
	@Override
	public void execute() {
		int start = input.nextInt();
		int end = input.nextInt();
		IModifiedInterval interval = modifiedIntervalFactory.build(start, end);
		arrayDecorator.addInterval(interval);
	}
}
