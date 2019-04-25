package Rotate;

import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class RotateLeftInterval implements IModifiedInterval{
	private MirroredInterval mirroredInterval;
	
	public RotateLeftInterval(MirroredInterval mirroredInterval) {
		super();
		this.mirroredInterval = mirroredInterval;
	}
	
	@Override
	public int getModifiedIndex(int index) {
		return mirroredInterval.getRotateLeftIndex(index);
	}

	@Override
	public boolean isInInterval(int index) {
		return mirroredInterval.isInInterval(index);
	}
	
}
