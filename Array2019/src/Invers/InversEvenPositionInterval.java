package Invers;

import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class InversEvenPositionInterval implements IModifiedInterval {

	private MirroredInterval mirroredInterval;

	public InversEvenPositionInterval(MirroredInterval mirroredInterval) {
		super();
		this.mirroredInterval = mirroredInterval;
	}

	@Override
	public int getModifiedIndex(int index) {
		return mirroredInterval.getEvenIntervalIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return mirroredInterval.isInInterval(index);
	}
}
