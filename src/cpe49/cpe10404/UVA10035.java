package cpe49.cpe10404;

import java.util.*;

public class UVA10035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			if (left == 0 && right == 0) return;
			boolean hasCarry = false;
			int count = 0;
			while ((left > 0 && right > 0) || hasCarry) {
				int tempLeft = left % 10;
				int tempRight = right % 10;
				int partialSum = 0;
				if (hasCarry) {
					partialSum = 1 + tempLeft + tempRight;
				} else {
					partialSum = tempLeft + tempRight;
				}
				if (partialSum > 9) {
					hasCarry = true;
					count++;
				} else hasCarry = false;
				left = left / 10;
				right = right / 10;
			}
			if (count > 0) {
				System.out.println(count == 1 ? count + " carry operation." : count + " carry operations." );
			} else System.out.println("No carry operation.");
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
			String left = sc.next();
			String right = sc.next();
			if ("0".equals(left) && "0".equals(right)) return;
			String up = null;
			String down = null;
			if (left.length() > right.length()) { // 數字大的固定放上面
				up = new StringBuilder(left).reverse().toString();
				down = new StringBuilder(right).reverse().toString();
			} else {
				up = new StringBuilder(right).reverse().toString();
				down = new StringBuilder(left).reverse().toString();
			}
			int minLen = Math.min(left.length(), right.length());
			boolean hasCarry = false;
			int count = 0;
			for (int i = 0; i < minLen; i++) {
				int temp = 0;
				if (hasCarry) temp++;
				temp += up.charAt(i) - '0' + down.charAt(i) - '0';
				if (temp > 9) {
					hasCarry = true;
					count++;
				} else hasCarry = false;
			}
			if (hasCarry) {
				for (int i = minLen; i < up.length(); i++) { // 處理數字較大的值後續進位影響的個數
					int temp = 0;
					if (hasCarry) temp++;
					temp += up.charAt(i) - '0';
					if (temp > 9) {
						hasCarry = true;
						count++;
					} else hasCarry = false;
				}
			} 
			if (count == 0) System.out.printf("No carry operation.%n");
			else System.out.printf("%d carry %s.%n", count, count > 1 ? "operations" : "operation");
		}
		sc.close();
	}
}
*/
