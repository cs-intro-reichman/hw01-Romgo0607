/*
 * The program gets a number of cents as a commandline argument and prints how to
 *represent this quantity using as many quarters as possible plus the remainder in cents
 */
public class Coins 
{
	public static void main(String[] args) 
	{
		int sum = Integer.parseInt(args[0]);

		int coins, quaters;

		quaters = sum/25;
		coins = sum%25;

		System.out.println("Use " + quaters + " quarters and " + coins + " cents");
	}
}