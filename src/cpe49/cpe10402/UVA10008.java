package cpe49.cpe10402;

import java.util.*;

public class UVA10008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = Integer.parseInt(sc.nextLine().trim());
		int[] arr = new int[26];
		int max = 0;
		while (caseCount-- > 0) {
			String input = sc.nextLine();
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					arr[input.charAt(i) - 'a']++;
					if (arr[input.charAt(i) - 'a'] > max) max = arr[input.charAt(i) - 'a'];
				}
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
					arr[input.charAt(i) - 'A']++;
					if (arr[input.charAt(i) - 'A'] > max) max = arr[input.charAt(i) - 'A'];
				}
			}
		}
		for (int i = max; i > 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) System.out.println((char)('A' + j) + " " + i);
			}
		}
	}
}
