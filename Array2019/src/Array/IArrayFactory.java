package Array;

import Interval.IModifiedInterval;

public interface IArrayFactory {

	IArray build(IArray array, IModifiedInterval interval);

}
