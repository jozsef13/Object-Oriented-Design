package Rotate;

import Interval.IModifiedInterval;

public class RotateRightStartEndPositionInterval implements IModifiedInterval {

	private RotateStartEndPosition rotateStartEndPosition;

	public RotateRightStartEndPositionInterval(RotateStartEndPosition rotateStartEndPosition) {
		super();
		this.rotateStartEndPosition = rotateStartEndPosition;
	}

	@Override
	public int getModifiedIndex(int index) {
		return rotateStartEndPosition.getRotateRightPositionsIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return rotateStartEndPosition.isInInterval(index);
	}

}
