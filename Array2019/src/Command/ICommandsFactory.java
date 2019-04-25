package Command;

import java.io.FileNotFoundException;

public interface ICommandsFactory {
	public CommandsExecutor build(String fileName) throws FileNotFoundException;
}
