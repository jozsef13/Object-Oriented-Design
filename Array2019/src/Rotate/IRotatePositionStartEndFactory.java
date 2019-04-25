package Rotate;

import Interval.IModifiedInterval;

public interface IRotatePositionStartEndFactory {
	IModifiedInterval build(int position, int start, int end);
}
