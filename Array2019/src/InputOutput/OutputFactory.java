package InputOutput;

public class OutputFactory implements IOutputFactory {

	@Override
	public IOutput build() {
		return new ConsoleOutput();
	}

}
