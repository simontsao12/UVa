package cpe49.cpe10428;

import java.util.*;

public class UVA10235 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if (isPrime(Integer.parseInt(input))) {
				StringBuilder sb = new StringBuilder(input);
				String reverse = sb.reverse().toString(); // 多次操作會影響資料所以反轉另外存
				if (reverse.equals(input)) // 注意考慮此情況
					System.out.printf("%s is prime.%n", input);
				else if (isPrime(Integer.parseInt(reverse)))
					System.out.printf("%s is emirp.%n", input);
				else System.out.printf("%s is prime.%n", input);
			} else System.out.printf("%s is not prime.%n", input);
		}
	}
	private static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
