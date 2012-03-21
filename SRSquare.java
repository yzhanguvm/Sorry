public class SRSquare {
	
	public int slideLength;
	public int maxPawns;
	public boolean isHome;

	public SRSquare() {
		slideLength = 0;
		maxPawns = 1;
		isHome = false;
	}
	
	public SRSquare(int slideLength, int maxPawns, boolean isHome) {
		this.slideLength = slideLength;
		this.maxPawns = maxPawns;
		this.isHome = isHome;
	}
	
	public void setSlideLength(int newLength){
		this.slideLength = newLength;
	}
	
	public void setMaxPawns(int maxPawns){
		this.slideLength = maxPawns;
	}

	public int getSlideLength() {
		return this.slideLength;
	}
}