package Loops;

import java.util.Scanner;

public class breakTopic 
{
	Scanner scan = new Scanner(System.in);
	int sum ;
	int num = 0;
	int count = 0;
	int choice = 0;
	public void display()
	{
		do
		{
			System.out.println("Please enter number (between 0-100) " + (++count));
			num = scan.nextInt();
			if(num < 0)
			{
				System.out.println("Negative number are not allowed");
				count--;
				continue;
			}
			sum += num;
			System.out.println("Do you want to continue (1 to continue, any number to exit)");
			choice = scan.nextInt();
		}
		while(choice == 1);
		{
			System.out.println("Your sum is: " + sum);
		}
		
	
	}
	public static void main(String args[])
	{
		breakTopic d = new breakTopic();
		d.display();
		System.out.println("Thanks for using my program");
	}
}
