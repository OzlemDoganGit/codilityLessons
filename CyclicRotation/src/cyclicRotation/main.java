package cyclicRotation;


public class main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] A = {1,2,3,4,8};
		for (int i=0; i<sol.solution(A, 1).length; i++)
		{
			System.out.println("Result: "+sol.solution(A, 1)[i]);
		}
		

	}

}
