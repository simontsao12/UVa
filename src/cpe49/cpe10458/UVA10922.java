package cpe49.cpe10458;

import java.util.*;

public class UVA10922 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if ("0".equals(input)) return;
			int degree = 0;
			int num = mod9(input);
			if (num == -1) {
				System.out.printf("%s is not a multiple of 9.%n", input);
			} else {
				degree++;
				while (num > 9) { // 注意檢查條件
					num = mod9(String.valueOf(num));
					degree++;
				}
				System.out.printf("%s is a multiple of 9 and has 9-degree %d.%n", input, degree);
			}
		}
	}
	private static int mod9(String num) {
		int bitValSum = 0;
		for (int i = 0; i < num.length(); i++) bitValSum += num.charAt(i) - '0';
		if (bitValSum % 9 != 0) return -1;
		else return bitValSum;
	}
}
