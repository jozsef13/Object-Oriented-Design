package Invers;

import Interval.IIntervalFactory;
import Interval.IModifiedInterval;
import Mirroring.MirroredInterval;

public class InversEvenPositionFactory implements IIntervalFactory {

	@Override
	public IModifiedInterval build(int start, int end) {
		MirroredInterval mirroredInterval = new MirroredInterval(start, end);
		return new InversEvenPositionInterval(mirroredInterval );
	}

}
