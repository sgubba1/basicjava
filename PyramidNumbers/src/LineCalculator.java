
public class LineCalculator {
	int slope;
	int constant;

	LineCalculator(int slope, int constant) {
		this.slope = slope;
		this.constant = constant;
	}

	int getYCoordinate(int x) {
		int y = (slope * x) + constant;
		return y;
	}

}
