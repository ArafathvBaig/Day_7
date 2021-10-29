package com.Day_7;

public class Gambling 
{
	public static final int  DAILY_LIMIT=100;
	public static final int PER_GAME_LIMIT=1;
	public static final int WIN=1;
	public static final int LOSS=0;
	public static void main(String[] args) 
	{
		int check;
		int profit;
		int lost;
		int daily_limit=DAILY_LIMIT;
		System.out.println(+daily_limit);
		while((daily_limit>50) && (daily_limit<150))
		{
			check = (int) (Math.random()*10)%2;
			System.out.println("Check:: "+check);
			if(check==WIN)
			{
				System.out.print("Won: ");
				daily_limit++;
				System.out.println(+daily_limit);
			}
			else
			{
				System.out.print("Lost: ");
				daily_limit--;
				System.out.println(+daily_limit);
			}
		}
		if(daily_limit>DAILY_LIMIT)
		{
			profit=daily_limit-DAILY_LIMIT;
			System.out.println("Profit of the Day: "+profit);
		}
		else
		{
			lost=DAILY_LIMIT-daily_limit;
			System.out.println("Loss of the Day: "+lost);
		}
	}
}
