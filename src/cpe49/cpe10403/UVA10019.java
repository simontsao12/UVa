package cpe49.cpe10403;

import java.util.*;

public class UVA10019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			String input = sc.next();
			int deciVal = Integer.parseInt(input);
			String deciToBinaryStr = Integer.toBinaryString(deciVal);
			int hexToDeciVal = Integer.parseInt(input, 16); // 以16進位將輸入字串解析成10進位數值
			String hexToBinaryStr = Integer.toBinaryString(hexToDeciVal); // 再轉成2進位
			// 直接使用bitCount API
			System.out.printf("%d %d%n", Integer.bitCount(deciVal), Integer.bitCount(hexToDeciVal));
		}
	}
}

/* 其他較正統的解法
import java.util.*;

public class main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			int input = sc.nextInt();
			System.out.println(base10(input) + " " + base16(input));	
		}
	}
	private static int base10(int n) {
		int count = 0;
		while (n > 0) {
			int temp = n % 2;
			if (temp == 1) count++;
			n /= 2;
		}
		return count;
	}
	
	private static int base16(int n) {
		int count = 0;
		while (n > 0) {
			int temp1 = n % 10;
			n /= 10;
			while (temp1 > 0) {
				int temp2 = temp1 % 2;
				if (temp2 == 1) count++;
				temp1 /= 2;
			}
		}
		return count;
	}
}
*/
