package binaryGap;

public class Solution {

	public int solution(int N) {
		// return the gapCount
		int gapCount = 0;
		int prevGapCount = 0;
		boolean gapCounting = false;

		while (N != 0) {
			// if N&1= no count
			// else count
			// then shift
			// primitive version
			// need to check if all of them 0 no 1
			if ((N & 1) == 1) {
				gapCounting = true;
				if (gapCount > prevGapCount) {
					prevGapCount = gapCount;
				}
				gapCount = 0;

			} else {
				if (gapCounting == true) {
					gapCount++;
				}
			}
			N = N >> 1;

		}
		return prevGapCount;
	}

}
