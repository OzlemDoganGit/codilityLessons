package oddOccurences;

public class Solution {

	public int solution(int[] A) {

		// (ON2 Complexity)
//    	int countPair = 0;
//        // special case
//        if(A.length == 0)
//            return 0;
//        // two for loop
//    	for (int i=0; i<A.length; i++)
//    	{
//    		for (int j=0; j<A.length; j++)
//    		{
//    			if (A[i] == A[j])
//    			{
//    				countPair ++;
//    			}
//    		}
//    		if ((countPair&1) == 1)
//    		{
//    			return A[i];
//    		}
//    	}
//		return 0;

		int unpair = A[0];
//      // special case
		if (A.length == 0)
			return 0;

		// Using the concept of "XOR" (^)
		// when there is a pair A and B
		// A^B will be zero
		// A^B^C (where C is not paired),
		// then A^B^C = C
		for (int i = 1; i < A.length; i++) {
			unpair = A[i] ^ unpair;
		}
		return unpair;
	}

}
