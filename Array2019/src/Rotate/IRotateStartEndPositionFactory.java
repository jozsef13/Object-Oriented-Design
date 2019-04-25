package Rotate;

import Interval.IModifiedInterval;

public interface IRotateStartEndPositionFactory {
	IModifiedInterval build(int start, int end, int position);
}
