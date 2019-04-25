package OOD;

import java.io.FileNotFoundException;

import Array.ArrayDecoratorFactory;
import Array.IArrayDecoratorFactory;
import Command.CommandsExecutor;
import Command.CommandsExecutorFactory;
import Command.IHandlerFactory;
import Get.GetHandlerFactory;
import Get.IGetHandlerFactory;
import InputOutput.IInputFactory;
import InputOutput.IOutputFactory;
import InputOutput.InputFactory;
import InputOutput.OutputFactory;
import Interval.EndStartHandlerFactory;
import Interval.IIntervalFactory;
import Interval.PositionStartEndHandlerFactory;
import Interval.StartEndHandlerFactory;
import Invers.InversOddPositionFactory;
import Mirroring.MirroredIntervalFactory;
import Rotate.IRotatePositionStartEndFactory;
import Rotate.RotateLeftFactory;
import Rotate.RotateLeftPositionStartEndFactory;
import Rotate.RotateRightFactory;
import Rotate.RotateRightPositionStartEndFactory;

public class Application {
	
	private CommandsExecutor commandsExecutor;
	private CommandsExecutorFactory commandsExecutorFactory;

	public Application(String fileName) throws FileNotFoundException{
		buildFactory();
		
		commandsExecutor = commandsExecutorFactory.build(fileName);
	}
	
	private void buildFactory() {
		IInputFactory inputFactory = new InputFactory();
		IArrayDecoratorFactory arrayDecoratorFactory = new ArrayDecoratorFactory();
		IIntervalFactory mirroredIntervalFactory = new MirroredIntervalFactory();
		IHandlerFactory mirroringHandlerFactory = new EndStartHandlerFactory(mirroredIntervalFactory);
		IOutputFactory outputFactory = new OutputFactory();
		IGetHandlerFactory getHandlerFactory = new GetHandlerFactory(outputFactory);
		IIntervalFactory rotateLeftFactory = new RotateLeftFactory();
		IHandlerFactory rotateLeftHandlerFactory = new StartEndHandlerFactory(rotateLeftFactory);
		IIntervalFactory rotateRightFactory = new RotateRightFactory();
		IHandlerFactory rotateRightHandlerFactory = new StartEndHandlerFactory(rotateRightFactory);
		IIntervalFactory inversOddPositionFactory = new InversOddPositionFactory();
		IHandlerFactory inversOddPositionHandlerFactory = new StartEndHandlerFactory(inversOddPositionFactory );
		
		IRotatePositionStartEndFactory rotateLeftPositionFactory = new RotateLeftPositionStartEndFactory();
		IHandlerFactory rotateLeftPositionHandlerFactory = new PositionStartEndHandlerFactory(rotateLeftPositionFactory );
		IRotatePositionStartEndFactory rotateRightPositionFactory = new RotateRightPositionStartEndFactory();
		IHandlerFactory rotateRightPositionHandlerFactory = new PositionStartEndHandlerFactory(rotateRightPositionFactory );
		
		IDispatchFactory dispatcherFactory = new DispatchFactory(mirroringHandlerFactory, arrayDecoratorFactory, getHandlerFactory, rotateLeftHandlerFactory, rotateRightHandlerFactory, inversOddPositionHandlerFactory, rotateLeftPositionHandlerFactory, rotateRightPositionHandlerFactory);
		
		commandsExecutorFactory =  new CommandsExecutorFactory(inputFactory, dispatcherFactory );
	}
	
	public static void main(String[] args) throws FileNotFoundException	{
		String fileName = "src/OOD/revAlfa.txt";
		Application application = new Application(fileName);
		application.start();
	}
	
	private void start() {
		commandsExecutor.execute();
	}
}
