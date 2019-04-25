package OOD;

import java.util.Map;

import Command.ICommandHandler;
import InputOutput.IInput;

public interface IDispatchFactory {
	public Map<Integer, ICommandHandler> build(IInput input);
}
