package Rotate;

import Interval.IModifiedInterval;

public class RotateStartEndPosition implements IModifiedInterval {

	private int start;
	private int end;
	private int positions;
	
	public RotateStartEndPosition(int start, int end, int positions) {
		super();
		this.start = start;
		this.end = end;
		this.positions = positions;
	}

	@Override
	public int getModifiedIndex(int index) {
		return 0;
	}

	public int getRotateLeftPositionsIndex(int index) {
		int provPositions = positions;
		while(provPositions > 0)
		{
			if(index == end)
			{
				index = start;
			}
			else
			{
				index++;
			}
			provPositions--;
		}
		
		return index;
	}
	
	public int getRotateRightPositionsIndex(int index) {
		int provPositions = positions;
		while(provPositions > 0) {
			if(index == start) {
				index = end;
			}
			else {
				index --;
			}
			provPositions--;
		}
		return index;
	}
	
	@Override
	public boolean isInInterval(int index) {
		if(index >= start && index <= end){
			return true;
		}else{
			return false;
		}
	}

}
