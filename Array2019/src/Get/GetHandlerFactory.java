package Get;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;
import InputOutput.IOutput;
import InputOutput.IOutputFactory;

public class GetHandlerFactory implements IGetHandlerFactory {

	private IOutputFactory outputFactory;

	public GetHandlerFactory(IOutputFactory outputFactory) {
		super();
		this.outputFactory = outputFactory;
	}

	@Override
	public ICommandHandler build(IInput input, ArrayDecorator arrayDecorator) {
		IOutput output = outputFactory.build();
		
		return new GetHandler(input, arrayDecorator, output);
	}

}
