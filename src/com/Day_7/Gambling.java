package com.Day_7;

public class Gambling 
{
	public static final int  DAILY_LIMIT=100;
	public static final int PER_GAME_LIMIT=1;
	public static final int MAX_DAYS=20;
	public static final int WIN=1;
	public static final int LOSS=0;
	public static void main(String[] args) 
	{
		int check;
		int day=1;
		int profit;
		int lost;
		int total=DAILY_LIMIT*MAX_DAYS;
		while(day<=MAX_DAYS)
		{
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
			System.out.println("DAY:: "+day);
			if(daily_limit>100)
			{
				profit=daily_limit-100;
				total=total+profit;
				System.out.println("DAY "+day+" has Profit of :: "+profit);
			}
			else
			{
				lost=100-daily_limit;
				total=total-lost;
				System.out.println("DAY "+day+" has Loss of :: "+lost);
			}
			day++;
		}
		if(total>DAILY_LIMIT*MAX_DAYS)
		{
			profit=total-(DAILY_LIMIT*MAX_DAYS);
			System.out.println("Month has a profit of: "+profit);
		}
		else if(total<DAILY_LIMIT*MAX_DAYS)
		{
			lost=(DAILY_LIMIT*MAX_DAYS)-total;
			System.out.println("Month has a profit of: "+lost);
		}
		else
		{
			System.out.println("No Profit or No Loss");
		}
	}
}
