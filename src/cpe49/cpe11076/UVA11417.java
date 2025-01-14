package cpe49.cpe11076;

import java.util.*;

public class UVA11417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int input = sc.nextInt();
			if (input == 0) return;
			int g = 0;
			for (int i = 1; i < input; i++) {
				for (int j = i + 1; j <= input; j++) {
					g += gcd(i, j);
				}
			}
			System.out.println(g);
		}
	}
	private static int gcd(int n1, int n2) {
		if (n2 == 0) return n1;
		else return gcd(n2, n1 % n2);
	}
}
