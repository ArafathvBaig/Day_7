package com.Day_7;

public class Gambling 
{
	public static final int DAILY_LIMIT=100;
	public static final int PER_GAME_LIMIT=1;
	public static final int MAX_DAYS=20;
	public static final int WIN=1;
	public static final int LOSS=0;
	public static final int MAX_MONTHS=12;
	public static final int MAX_PROFIT=50;
	public static final int MAX_LOST=50;
	public static void main(String[] args) 
	{
		int months=1;
		while(months<=MAX_MONTHS)
		{
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("$$$$$$$$$ Month::"+months+" $$$$$$$$$");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			int check;
			int day=1;
			int profit;
			int lost;
			int total=DAILY_LIMIT*MAX_DAYS;
			int daysWon=0;
			int daysLost=0;
			while(day<=MAX_DAYS)
			{
				int daily_limit=DAILY_LIMIT;
				//System.out.println(+daily_limit);
				while((daily_limit>50) && (daily_limit<150))
				{
					check = (int) (Math.random()*10)%2;
					//System.out.println("Check:: "+check);
					if(check==WIN)
					{
						//System.out.print("Won: ");
						daily_limit++;
						//System.out.println(+daily_limit);
					}
					else
					{
						//System.out.print("Lost: ");
						daily_limit--;
						//System.out.println(+daily_limit);
					}
				}
				//System.out.println("DAY:: "+day);
				if(daily_limit>100)
				{
					profit=daily_limit-100;
					total=total+profit;
					daysWon++;
					System.out.println("DAY "+day+" has a Profit of :: "+profit);
					if(profit==MAX_PROFIT)
					{
						System.out.println("Day "+day+" is a Luckiest Day.");
					}
				}
				else
				{
					lost=100-daily_limit;
					total=total-lost;
					daysLost++;
					System.out.println("DAY "+day+" has a Loss of :: "+lost);
					if(lost==MAX_LOST)
					{
						System.out.println("Day "+day+" is a UnLuckiest Day.");
					}
				}
				day++;
			}
			if(total>(DAILY_LIMIT*MAX_DAYS))
			{
				profit=total-(DAILY_LIMIT*MAX_DAYS);
				System.out.println("Month "+months+" has a profit of: "+profit);
			}
			else if(total<(DAILY_LIMIT*MAX_DAYS))
			{
				lost=(DAILY_LIMIT*MAX_DAYS)-total;
				System.out.println("Month "+months+" has a Loss of: "+lost);
			}
			else
			{
				System.out.println("Month "+months+" has No Profit or No Loss");
			}
			System.out.println("No.of Days Won in Month "+months+" : "+daysWon);
			System.out.println("No.of Days Lost in Month "+months+" : "+daysLost);
			months++;
		}
	}
}
