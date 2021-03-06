package Rotate;

import Interval.IIntervalFactory;
import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class RotateRightFactory implements IIntervalFactory {

	@Override
	public IModifiedInterval build(int start, int end) {
		MirroredInterval mirroredInterval = new MirroredInterval(start, end);
		return new RotateRightInterval(mirroredInterval);
	}

}
