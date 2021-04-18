package permMissingElement;

public class Solution {
	
    public int solution(int[] A) {
        // write your code in Java SE 8
        		// instead of two for loops
		// seq numbers sum rule = (A.length + 1 +1) * A.length /2
		
		long sum = (A.length+1 +1) * (A.length+1) /2;
		for (int i=0; i<A.length ; i++) {
			sum = sum - A[i];
		}
		
		return (int)sum;
    }

}
