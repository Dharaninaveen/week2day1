package week2day1assign;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "dharani";
		char chstr[] = str.toCharArray();
		String rev = "";
		for (int i = chstr.length - 1; i >= 0; i--) {
			rev = rev + chstr[i];
		}

		System.out.println("reverse string is " + rev);
		if (str.equals(rev)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
