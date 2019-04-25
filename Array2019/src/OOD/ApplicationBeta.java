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
import Interval.StartEndHandlerFactory;
import Interval.StartEndPositionHandlerFactory;
import Invers.InversEvenPositionFactory;
import Mirroring.MirroredIntervalFactory;
import Rotate.IRotateStartEndPositionFactory;
import Rotate.RotateLeftFactory;
import Rotate.RotateLeftStartEndPositionFactory;
import Rotate.RotateRightFactory;
import Rotate.RotateRightStartEndPositionFactory;

public class ApplicationBeta {
	private CommandsExecutor commandsExecutor;
	private CommandsExecutorFactory commandsExecutorFactory;

	public ApplicationBeta(String fileName) throws FileNotFoundException{
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
		IHandlerFactory rotateRightHandlerFactory = new StartEndHandlerFactory(rotateRightFactory );
		IIntervalFactory inversEvenPositionFactory = new InversEvenPositionFactory();
		IHandlerFactory inversEvenPositionHandlerFactory = new StartEndHandlerFactory(inversEvenPositionFactory );
		
		IRotateStartEndPositionFactory rotateLeftPositionFactory = new RotateLeftStartEndPositionFactory();
		IHandlerFactory rotateLeftPositionHandlerFactory = new StartEndPositionHandlerFactory(rotateLeftPositionFactory );
		IRotateStartEndPositionFactory rotateRightPositionFactory = new RotateRightStartEndPositionFactory();
		IHandlerFactory rotateRightPositionHandlerFactory = new StartEndPositionHandlerFactory(rotateRightPositionFactory );
		
		IBetaDispatchFactory betaDispatcherFactory = new BetaDispatchFactory(mirroringHandlerFactory, arrayDecoratorFactory, getHandlerFactory, rotateLeftHandlerFactory, rotateRightHandlerFactory, inversEvenPositionHandlerFactory, rotateLeftPositionHandlerFactory, rotateRightPositionHandlerFactory);
		
		commandsExecutorFactory =  new CommandsExecutorFactory(inputFactory, betaDispatcherFactory );
	}
	
	public static void main(String[] args) throws FileNotFoundException	{
		String fileName = "src/OOD/revBeta.txt";
		ApplicationBeta application = new ApplicationBeta(fileName);
		application.start();
	}
	
	private void start() {
		commandsExecutor.execute();
	}
}
