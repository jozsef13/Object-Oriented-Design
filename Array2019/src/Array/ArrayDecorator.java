package Array;

import Interval.IModifiedInterval;

public class ArrayDecorator implements IArrayDecorator, IArray {
	private IArray array;
	private IArrayFactory arrayFactory;
	
	public ArrayDecorator(IArray array, IArrayFactory arrayFactory) {
		super();
		this.array = array;
		this.arrayFactory = arrayFactory;
	}

	public int getValueAt(int index) {
		return array.getValueAt(index);
	}
	
	@Override
	public void addInterval(IModifiedInterval interval) {
		array = arrayFactory.build(array, interval);
	}
}
