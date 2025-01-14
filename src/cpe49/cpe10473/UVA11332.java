package cpe49.cpe10473;

import java.util.*;

public class UVA11332 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if (input.equals("0")) return;
			while (input.length() >= 2) {
				int temp = 0;
				for (int i = 0; i < input.length(); i++) {
					temp += input.charAt(i) - '0';
				}
				input = String.valueOf(temp);
			}
			System.out.println(input);
		}
	}
}
