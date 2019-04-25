package Rotate;

import Interval.IModifiedInterval;

public class RotateRightPositionStartEndFactory implements IRotatePositionStartEndFactory {

	@Override
	public IModifiedInterval build(int position, int start, int end) {
		RotatePositionStartEnd rotatePositionStartEnd = new RotatePositionStartEnd(position, start, end);
		return new RotateRightPositionStartEndInterval(rotatePositionStartEnd );
	}

}
