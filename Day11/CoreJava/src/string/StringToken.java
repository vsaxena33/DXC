package string;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer message = new StringTokenizer("String:is:immutable",":");
		System.out.println(message.countTokens());
		
		while (message.hasMoreTokens()) {
			System.out.println(message.nextToken());
		}
	}

}
