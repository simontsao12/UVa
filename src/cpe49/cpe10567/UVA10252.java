package cpe49.cpe10567;

import java.util.*;

public class UVA10252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String up = sc.nextLine();
			String down = sc.nextLine();
			int[] arrUp = new int[26];
			int[] arrDown = new int[26];
			for (int i = 0; i < up.length(); i++) {
				if (up.charAt(i) >= 'a' && up.charAt(i) <= 'z') arrUp[up.charAt(i) - 'a']++;
			}
			for (int i = 0; i < down.length(); i++) {
				if (down.charAt(i) >= 'a' && down.charAt(i) <= 'z') arrDown[down.charAt(i) - 'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 26; i++) {
				if (arrUp[i] > 0 && arrDown[i] > 0) {
					int temp = Math.min(arrUp[i], arrDown[i]);
					for (int j = 0; j < temp; j++) sb.append((char)(i + 'a'));
				}
			}
			System.out.println(sb.toString());
		}
	}
}
