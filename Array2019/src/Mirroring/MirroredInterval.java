package Mirroring;

import Interval.IModifiedInterval;

public class MirroredInterval implements IModifiedInterval {
	private int start;
	private int end;
	
	public MirroredInterval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public int getModifiedIndex(int index) {
		return end - index + start;
	}
	
	public int getRotateRightIndex(int index){
		if(index == start){
			return end;
		}else{
			return index - 1;
		}
	}
	public int getRotateLeftIndex(int index){
		if(index == end){
			return start;
		}else{
			return index + 1;
		}
	}
	public int getEvenIntervalIndex(int index) {
		if(index % 2 == 0) {
			return index+1;
		}
		else {
			return index-1;
		}
	}
	public int getOddIntervalIndex(int index) {
		if(index % 2 != 0) {
			return index+1;
		}
		else {
			return index-1;
		}
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