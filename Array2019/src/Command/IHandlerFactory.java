package Command;

import Array.ArrayDecorator;
import InputOutput.IInput;

public interface IHandlerFactory {

	ICommandHandler build(IInput input, ArrayDecorator arrayDecorator);

}
