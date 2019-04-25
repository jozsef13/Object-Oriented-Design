package Array;

import Interval.IModifiedInterval;

public class ModifiedIntervalArray implements IArray {
	private IArray innerArray;
	private IModifiedInterval modifiedInterval; 
	
	public ModifiedIntervalArray(IArray innerArray, IModifiedInterval mirroredInterval) {
		super();
		this.innerArray = innerArray;
		this.modifiedInterval = mirroredInterval;
	}

	@Override
	public int getValueAt(int index) {
		int realIndex = index;
		if(modifiedInterval.isInInterval(index)){
			realIndex = modifiedInterval.getModifiedIndex(index);
		}
		return innerArray.getValueAt(realIndex);
	}
}
