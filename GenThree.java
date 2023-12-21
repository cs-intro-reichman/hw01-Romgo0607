/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int min = Math.min(a, b);
		int max = Math.max(a, b);

		int num1, num2, num3;

		max = max - 1;

		num1 = ((int)(((Math.random() * (max - min + 1) + min))));
		num2 = ((int)(((Math.random() * (max - min + 1) + min))));
		num3 = ((int)(((Math.random() * (max - min + 1) + min))));

		int mini;

		mini = Math.min(num1, num2);
		supermin = Math.min(mini, num3);


		/*if(a > b)
		{
			a = a - 1;
			num1 = ((int)(((Math.random() * (a - b + 1) + b))));
			num2 = ((int)(((Math.random() * (a - b + 1) + b))));
			num3 = ((int)(((Math.random() * (a - b + 1) + b))));

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);

			mini = Math.min(num1, num2);
			supermin = Math.min(mini, num3);

			System.out.println("The minimal generated number was " + supermin);
		}
		else
		{
			b = b - 1;
			num1 = ((int)(((Math.random() * (b - a + 1) + a))));
			num2 = ((int)(((Math.random() * (b - a + 1) + a))));
			num3 = ((int)(((Math.random() * (b - a + 1) + a))));

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);

			mini = Math.min(num1, num2);
			supermin = Math.min(mini, num3);

			System.out.println("The minimal generated number was " + supermin);
		} */
	}
}
 