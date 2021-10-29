package com.Day_7;

public class Gambling 
{
	public static int DAILY_LIMIT=100;
	public static int PER_GAME_LIMIT=1;
	public static int WIN=1;
	public static int loss=0;
	public static void main(String[] args) 
	{
		int check;
		check = (int) (Math.random()*10)%2;
		System.out.println("Check:: "+check);
		if(check==WIN)
		{
			System.out.print("Won: ");
			DAILY_LIMIT++;
		}
		else
		{
			System.out.print("Lost: ");
			DAILY_LIMIT--;
		}
		System.out.println(+DAILY_LIMIT);
	}
}
