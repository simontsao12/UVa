package cpe49.cpe10421;

import java.util.*;

//reaptly subtract: 重複減 --> 減完之後得到與較小值相同的數 --> 求最大公因數
public class UVA10193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		for (int i = 0; i < caseCount; i++) {
			int s1 = Integer.parseInt(sc.next(), 2); // 以2進位去解析成10進位整數
			int s2 = Integer.parseInt(sc.next(), 2); // 以2進位去解析成10進位整數
			System.out.printf("Pair #%d: %s!%n", (i + 1), gcd(s1, s2) == 1 ? "Love is not all you need" : "All you need is love");
		}
	}
	private static int gcd(int n1, int n2) {
		if (n2 == 0) return n1;
		else return gcd(n2, n1 % n2);
	}
}
