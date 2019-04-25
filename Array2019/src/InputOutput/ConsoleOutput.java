package InputOutput;

public class ConsoleOutput implements IOutput {

	@Override
	public void print(int value) {
		System.out.println(value);
	}

}
