package OOD;

import java.util.HashMap;
import java.util.Map;

import Array.ArrayDecorator;
import Array.IArrayDecoratorFactory;
import Command.ICommandHandler;
import Command.IHandlerFactory;
import Get.IGetHandlerFactory;
import InputOutput.IInput;

public class BetaDispatchFactory implements IBetaDispatchFactory{

	private IHandlerFactory mirroringHandlerFactory;
	private IArrayDecoratorFactory arrayDecoratorFactory;
	private IGetHandlerFactory getHandlerFactory;
	private IHandlerFactory rotateLeftFactory;
	private IHandlerFactory rotateRightFactory;
	private IHandlerFactory inversEvenPositionFactory;
	private IHandlerFactory rotateLeftPositionFactory;
	private IHandlerFactory rotateRightPositionFactory;


	public BetaDispatchFactory(IHandlerFactory mirroringHandlerFactory, IArrayDecoratorFactory arrayDecoratorFactory,
			IGetHandlerFactory getHandlerFactory, IHandlerFactory rotateLeftFactory, IHandlerFactory rotateRightFactory,
			IHandlerFactory inversEvenPositionFactory, IHandlerFactory rotateLeftPositionFactory,
			IHandlerFactory rotateRightPositionFactory) {
		super();
		this.mirroringHandlerFactory = mirroringHandlerFactory;
		this.arrayDecoratorFactory = arrayDecoratorFactory;
		this.getHandlerFactory = getHandlerFactory;
		this.rotateLeftFactory = rotateLeftFactory;
		this.rotateRightFactory = rotateRightFactory;
		this.inversEvenPositionFactory = inversEvenPositionFactory;
		this.rotateLeftPositionFactory = rotateLeftPositionFactory;
		this.rotateRightPositionFactory = rotateRightPositionFactory;
	}


	public Map<Integer, ICommandHandler> build(IInput input) {
		Map<Integer, ICommandHandler> dispatcher = new HashMap<Integer, ICommandHandler>();
		
		ArrayDecorator arrayDecorator = arrayDecoratorFactory.build();
		
		ICommandHandler getHandler = getHandlerFactory.build(input, arrayDecorator);
		
		ICommandHandler mirroringHandler = mirroringHandlerFactory.build(input, arrayDecorator);
		
		ICommandHandler rotateLeftHandler = rotateLeftFactory.build(input, arrayDecorator);
		
		ICommandHandler rotateRightHandler = rotateRightFactory.build(input, arrayDecorator);
		
		ICommandHandler inversEvenPositionHandler = inversEvenPositionFactory.build(input, arrayDecorator);
		
		ICommandHandler rotateLeftPositionHandler = rotateLeftPositionFactory.build(input, arrayDecorator);
		
		ICommandHandler rotateRightPositionHandler = rotateRightPositionFactory.build(input, arrayDecorator);
		
		dispatcher.put(2, getHandler);
		dispatcher.put(1, mirroringHandler);
		dispatcher.put(3, rotateLeftHandler);
		dispatcher.put(4, rotateRightHandler);
		dispatcher.put(5, inversEvenPositionHandler);
		dispatcher.put(7, rotateLeftPositionHandler);
		dispatcher.put(8, rotateRightPositionHandler);
		return dispatcher;	
	}

}
