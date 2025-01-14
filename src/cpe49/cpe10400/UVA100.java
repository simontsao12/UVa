package cpe49.cpe10400;

import java.util.*;

public class UVA100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			int lower = Math.min(left, right);
			int upper = Math.max(left, right);
			int max = 0;
			for (int i = lower; i <= upper; i++) {
				int count = helper(i);
				if (count > max) max = count;
			}
			System.out.printf("%d %d %d%n", left, right, max);
		}
	}
	private static int helper(int num) {
		int count = 1; // 第一個一定會 print 所以 count 從 1 開始
		int temp = num;
		while (temp > 1) {
			if (temp % 2 != 0) temp = 3 * temp + 1;
			else temp /= 2;
			count++;
		} 
		return count;
	}
}
