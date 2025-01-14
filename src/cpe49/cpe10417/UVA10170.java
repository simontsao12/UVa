package cpe49.cpe10417;

import java.util.*;

public class UVA10170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int people = sc.nextInt();
			long day = sc.nextLong();
			// 等差級數公式: (a1 + an) / 2 -> (a1 + a1 + (n - 1) * d) / 2
			// 概念上求n: (people + people + (n - 1) * 1) * n / 2 >= day 求 n
			long sum = people;
			while (sum < day) {
				people += 1;
				sum += people;
			}
			System.out.println(people);
		}
	}
}
