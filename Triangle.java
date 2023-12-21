/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int sum1, sum2, sum3;
		sum1 = a + b;
		sum2 = a + c;
		sum3 = b + c;

		boolean IsTringle = true;

		IsTringle = ((sum1 < c) || (sum2 < b) || (sum3 < a));

		System.out.println(a + ", " + b + ", " + c + ": " + !IsTringle);


		
		/*
		if((sum1 < c) || (sum2 < b) || (sum3 < a))		
			System.out.println(a + ", " + b + ", " + c + ": " + !IsTringle);
		else 
			System.out.println(a + ", " + b + ", " + c + ": " + IsTringle);
			*/
	}
}
