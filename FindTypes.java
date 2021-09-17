package week2day1assign;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char chartest[]=test.toCharArray();
		for(int i = 0; i <chartest.length; i++) {
			if(Character.isLetter(chartest[i])) {
				letter++;
			}
			
			else if(Character.isDigit(chartest[i])) {
				space++;
			}
			else if(Character.isSpaceChar(chartest[i])){
				num++;
			}
			else 
				specialChar++;
			
		}
		System.out.println("Count of letters:  "+letter);
		System.out.println("count of space  " +space);
		System.out.println("Count of numbers:  "+num);
		System.out.println("Count of special characters:  "+specialChar);
		

	}

}
