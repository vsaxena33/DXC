package variable;

public class Z {
	W w = new W();
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");
	}
	Z(){
		System.out.println("Z constructor");
	}
	public static void main(String[] args) {
		System.out.println("In main");
		new Z();
		new Z();
	}

}
