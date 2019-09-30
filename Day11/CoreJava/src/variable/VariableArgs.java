package variable;

public class VariableArgs {
	public static int sum(int...numbers) {
		int sum = 0;
		for (int i:numbers) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2,70));

	}

}
