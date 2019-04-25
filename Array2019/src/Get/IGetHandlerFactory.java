package Get;

import Array.ArrayDecorator;
import Command.ICommandHandler;
import InputOutput.IInput;

public interface IGetHandlerFactory {

	ICommandHandler build(IInput input, ArrayDecorator arrayDecorator);

}
