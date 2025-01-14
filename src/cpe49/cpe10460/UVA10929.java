package cpe49.cpe10460;

import java.util.*;

public class UVA10929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if ("0".equals(input)) return;
			int temp = 0;
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 != 0) temp += input.charAt(i) - '0';
				else temp -= input.charAt(i) - '0';
			}
			if (temp % 11 == 0) System.out.printf("%s is a multiple of 11.%n", input);
			else System.out.printf("%s is not a multiple of 11.%n", input);
		}
	}
}

/*
// 之前筆記
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if ("0".equals(input)) return;
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0)sum += input.charAt(i) - '0'; //奇數位相加
				else sum -= input.charAt(i) - '0'; //偶數位相減
				
			}
			//System.out.println(-121 % 11 == 0); //true 不用考慮正負
			if (sum % 11 == 0) System.out.println(input + " is a multiple of 11.");
			else System.out.println(input + " is not a multiple of 11.");
		}
	}
}
*/
