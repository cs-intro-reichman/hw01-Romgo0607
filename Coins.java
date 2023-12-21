
public class Coins {
	public static void main(String[] args) 
	{
		int sum = Integer.parseInt(args[0]);

		int coins, quaters;

		quaters = sum/25;
		coins = sum%25;

		System.out.println("Use " + quaters + " quarters and " + coins + " cents");
	}
}