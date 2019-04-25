package Rotate;

import Interval.IModifiedInterval;

public class RotatePositionStartEnd implements IModifiedInterval {

	private int positions;
	private int start;
	private int end;
	
	
	public RotatePositionStartEnd(int positions, int start, int end) {
		super();
		this.positions = positions;
		this.start = start;
		this.end = end;
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
