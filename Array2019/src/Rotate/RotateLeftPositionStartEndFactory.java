package Rotate;

import Interval.IModifiedInterval;

public class RotateLeftPositionStartEndFactory implements IRotatePositionStartEndFactory {

	@Override
	public IModifiedInterval build(int position, int start, int end) {
		RotatePositionStartEnd rotatePositionStartEnd = new RotatePositionStartEnd(position, start, end);
		return new RotateLeftPositionStartEndInterval(rotatePositionStartEnd );
	}

}
