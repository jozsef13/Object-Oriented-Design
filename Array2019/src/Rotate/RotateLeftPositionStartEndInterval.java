package Rotate;

import Interval.IModifiedInterval;

public class RotateLeftPositionStartEndInterval implements IModifiedInterval {

	private RotatePositionStartEnd rotatePositionsStartEnd;

	public RotateLeftPositionStartEndInterval(RotatePositionStartEnd rotatePositionsStartEnd) {
		super();
		this.rotatePositionsStartEnd = rotatePositionsStartEnd;
	}

	@Override
	public int getModifiedIndex(int index) {
		return rotatePositionsStartEnd.getRotateLeftPositionsIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return rotatePositionsStartEnd.isInInterval(index);
	}

}
