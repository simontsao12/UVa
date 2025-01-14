package cpe49.cpe10480;

import java.util.*;

public class UVA11461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			if (left == 0 && right == 0) return;
			int count = 0;
			for (int i = left; i <= right; i++) {
				if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i) count++;
			}
			System.out.println(count);
		}
	}
}
