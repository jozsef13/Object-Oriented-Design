package Rotate;

import Interval.IModifiedInterval;

public class RotateRightPositionStartEndInterval implements IModifiedInterval {

	private RotatePositionStartEnd rotatePositionStartEnd;

	public RotateRightPositionStartEndInterval(RotatePositionStartEnd rotatePositionStartEnd) {
		super();
		this.rotatePositionStartEnd = rotatePositionStartEnd;
	}

	@Override
	public int getModifiedIndex(int index) {
		return rotatePositionStartEnd.getRotateRightPositionsIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return rotatePositionStartEnd.isInInterval(index);
	}

}
