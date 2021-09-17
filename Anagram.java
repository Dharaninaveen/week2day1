package week2day1assign;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int lentxt1 = text1.length();
		int lentxt2 = text2.length();
		if (lentxt1 == lentxt2) {
			char chartxt1[] = text1.toCharArray();
			char chartxt2[] = text2.toCharArray();
			Arrays.sort(chartxt1);
			Arrays.sort(chartxt2);
			if (Arrays.equals(chartxt1, chartxt2)) {

				System.out.println(text1 + " and " + text2 + " are anagrams ");
			}

		}

	}
}