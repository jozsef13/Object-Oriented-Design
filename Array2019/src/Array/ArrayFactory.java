package Array;

import Interval.IModifiedInterval;

public class ArrayFactory implements IArrayFactory {

	@Override
	public IArray build(IArray array, IModifiedInterval interval) {
		return new ModifiedIntervalArray(array, interval);
	}
}
