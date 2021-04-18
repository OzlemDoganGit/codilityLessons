package cyclicRotation;

public class Solution {
	
    public int[] solution(int[] A, int K) {
    	
    	// 1,2,3,4,5 ->1
    	// 5,4,3,2,1
    	//-------------//
    	int [] new_array = new int[A.length];
    	for (int i=0; i< A.length; i++)
    	{
    		int position = (i+K) % A.length;
    		new_array[position] = A[i];
    	}
    	
		return new_array;
    }

}
