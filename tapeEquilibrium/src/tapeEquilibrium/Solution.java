package tapeEquilibrium;

public class Solution {
	
    public int solution(int[] A) {
    	
    	int sum =0;
    	
    	for (int i=0; i< A.length; i++)
    	{
    		sum += A[i];
    	}
    	int first_part = A[0];
    	int second_part = sum -A[0];
    	int min_diff = second_part - first_part;
		if (min_diff <0)
		{
			min_diff = -min_diff;
		}
    	for (int p=1; p<A.length; p++)
    	{
    		first_part = first_part + A[p];
    		second_part = sum - first_part;
    		int diff = second_part - first_part;
    		if (diff <0)
    		{
    			diff = -diff;
    		}
    		min_diff = Math.min(min_diff, diff);
    		
    	}
    	
		return min_diff;
    }

}
