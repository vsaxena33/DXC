package string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName1 = "Vaibhav";
		String fullName2 = "Saxena";
		fullName2 = fullName1;
		System.out.println(fullName2.equals(fullName1));
		System.out.println(fullName2 == fullName1);

	}

}
