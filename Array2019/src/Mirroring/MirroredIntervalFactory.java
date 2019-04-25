package Mirroring;

import Interval.IIntervalFactory;
import Interval.IModifiedInterval;

public class MirroredIntervalFactory implements IIntervalFactory {

	@Override
	public IModifiedInterval build(int start, int end) {
		return new MirroredInterval(start, end);
	}

}
