package Rotate;

import Interval.IModifiedInterval;

public class RotateLeftStartEndPositionFactory implements IRotateStartEndPositionFactory {

	@Override
	public IModifiedInterval build(int start, int end, int position) {
		RotateStartEndPosition rotateStartEndPosition = new RotateStartEndPosition(start, end, position);
		return new RotateLeftStartEndPositionInterval(rotateStartEndPosition );
	}

}
