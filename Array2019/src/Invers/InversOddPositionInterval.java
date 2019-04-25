package Invers;

import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class InversOddPositionInterval implements IModifiedInterval {

	private MirroredInterval mirroredInterval;

	public InversOddPositionInterval(MirroredInterval mirroredInterval) {
		super();
		this.mirroredInterval = mirroredInterval;
	}

	@Override
	public int getModifiedIndex(int index) {
		return mirroredInterval.getOddIntervalIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return mirroredInterval.isInInterval(index);
	}

}
