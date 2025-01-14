package cpe49.cpe10454;

import java.util.*;

public class UVA10812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			long sum = sc.nextLong(); // x + y = sum
			long diff = sc.nextLong(); // | x - y | = diff
			if (sum < diff || (sum + diff) % 2 != 0) System.out.println("impossible");
			else {
				System.out.printf("%d %d%n",(sum + diff) / 2, Math.abs(sum - diff) / 2);
			}
		}
	}
}
