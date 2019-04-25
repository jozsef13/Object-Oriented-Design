package InputOutput;

import java.io.FileNotFoundException;

public interface IInputFactory {
	public IInput build(String fileName) throws FileNotFoundException;
}
