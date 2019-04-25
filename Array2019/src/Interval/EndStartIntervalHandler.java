package Interval;

import Array.IArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;

public class EndStartIntervalHandler implements ICommandHandler {

	private IInput input;
	private IArrayDecorator arrayDecorator;
	private IIntervalFactory modifiedIntervalFactory;

	public EndStartIntervalHandler(IInput input, IArrayDecorator arrayDecorator,
			IIntervalFactory modifiedIntervalFactory) {
		super();
		this.input = input;
		this.arrayDecorator = arrayDecorator;
		this.modifiedIntervalFactory = modifiedIntervalFactory;
	}

	@Override
	public void execute() {
		int end = input.nextInt();
		int start = input.nextInt();
		
		IModifiedInterval interval = modifiedIntervalFactory.build(end, start);
		arrayDecorator.addInterval(interval );
	}

}
