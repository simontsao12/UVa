package cpe49.cpe10405;

import java.util.*;

public class UVA10038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			boolean isJolly = true;
			int temp = sc.nextInt();
			for (int i = 1; i < n; i++) {
				int num = sc.nextInt();
				if (Math.abs(num - temp) < n) arr[Math.abs(num - temp)]++;
				else isJolly = false;
				temp = num;
			}
			for (int i = 1; i < n; i++) {
				if (!isJolly) break;
				if (arr[i] == 0) {
					isJolly = false;
					break;
				}
			}
			System.out.println(isJolly ? "Jolly" : "Not jolly");
		}
	}
}
