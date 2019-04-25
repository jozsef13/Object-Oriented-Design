package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFactory implements IInputFactory{

	public IInput build(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		
		return new Input(scanner);
	}

}
