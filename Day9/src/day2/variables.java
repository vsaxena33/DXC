package day2;

public class variables
{
	int i = 100;
	public void display()
	{
		int j;
		if(i < 100)
		{
			j = 20;
		}
		else
		{
			j = 0;
		}
		System.out.println(i + j);
	}
	public static void main(String args[])
	{
		variables d = new variables();
		d.display();
	}
}
