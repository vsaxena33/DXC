
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated meth od stub
		Apple a = new Apple();
		a.displayApple();
		Ball b = new Ball();
		b.displayBall();
		Cat c = new Cat();
		c.displayCat();
		Dog d = new Dog();
		d.displayDog();
		Elephant e = new Elephant();
		e.displayElephant();
		
	}

}


class Apple {
	public  void displayApple()
	{
		System.out.println("Apple");
	}

}
class Ball{
	public void displayBall()
	{
		System.out.println("Ball");
	}
}
class Cat
{
	public void displayCat()
	{
		System.out.println("Cat");
	}
}
class Dog
{
	public void displayDog()
	{
		System.out.println("Dog");
	}
}
class Elephant
{
	public void displayElephant()
	{
		System.out.println("Elephant");
	}
}