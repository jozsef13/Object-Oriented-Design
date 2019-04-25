package InputOutput;

import java.util.Scanner;

public class Input implements IInput {
	
	Scanner scanner;
	
	public Input(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	@Override
	public boolean hasData() {
		return scanner.hasNext();
	}

	@Override
	public int nextInt() {
		return scanner.nextInt();
	}

}
