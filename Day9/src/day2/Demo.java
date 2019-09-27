package day2;

import java.util.Date;

public class Demo {
	int num;
	float marks;
	byte b;
	boolean married;
	char alphabet = 100;
	long c;
	double d;
	short s;
	int main = 'C';
	String name = "Vaibhav";
	Date date = new Date();
	public void display()
	{
		System.out.println("Default value of int is: " + num);
		System.out.println(marks);
		System.out.println(married);
		System.out.println(alphabet);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(main);
		System.out.println(name);
		System.out.println(date); //it will display system date, after importing java.util.Date
	}
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.display();
	}

}
