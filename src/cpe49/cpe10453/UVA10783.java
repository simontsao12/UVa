package cpe49.cpe10453;

import java.util.*;

public class UVA10783 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		for (int i = 0; i < caseCount; i++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			int sum = 0;
			for (int j = left; j <= right; j++) {
				if (j % 2 != 0) sum += j;
			}
			System.out.printf("Case %d: %d%n", (i + 1), sum);
		}
	}
}
