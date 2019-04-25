package Rotate;

import Interval.IModifiedInterval;

public class RotateLeftStartEndPositionInterval implements IModifiedInterval {

	private RotateStartEndPosition rotateStartEndPosition;

	public RotateLeftStartEndPositionInterval(RotateStartEndPosition rotateStartEndPosition) {
		super();
		this.rotateStartEndPosition = rotateStartEndPosition;
	}

	@Override
	public int getModifiedIndex(int index) {
		return rotateStartEndPosition.getRotateLeftPositionsIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return rotateStartEndPosition.isInInterval(index);
	}

}
