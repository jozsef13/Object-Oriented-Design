package Array;

public class ArrayDecoratorFactory implements IArrayDecoratorFactory {

	@Override
	public ArrayDecorator build() {
		IArray array = new Array();
		IArrayFactory arrayFactory = new ArrayFactory();
		
		return new ArrayDecorator(array, arrayFactory);
	}

}
