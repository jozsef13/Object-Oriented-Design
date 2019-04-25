package Rotate;

import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class RotateRightInterval implements IModifiedInterval {
	private MirroredInterval mirroredInterval;
	
	public RotateRightInterval(MirroredInterval mirroredInterval) {
		super();
		this.mirroredInterval = mirroredInterval;
	}

	@Override
	public int getModifiedIndex(int index) {
		return mirroredInterval.getRotateRightIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return mirroredInterval.isInInterval(index);
	}

}
