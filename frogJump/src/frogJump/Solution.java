package frogJump;

public class Solution {

    public int solution(int X, int Y, int D) {
    	int plus = 0;
    	// if it is divided we do not need to sum it with 1.
    	if((Y-X)%D != 0)
    	{
    		plus = 1;
    	}
        return ((Y-X)/D) +plus;
    }
}
