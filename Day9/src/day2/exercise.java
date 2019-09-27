package day2;

import java.util.Scanner;

public class exercise
{
	Scanner scan = new Scanner(System.in);
	int num1;
	int num2;
	// instance variable
	public void add()
	{
		// local variable
		System.out.println("Enter number one: ");
		num1 = scan.nextInt();
		System.out.println("Enter number two: ");
		num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is: " + sum);
	}
	public static void main(String args[])
	{
		exercise d = new exercise();
		d.add();
	}
}
