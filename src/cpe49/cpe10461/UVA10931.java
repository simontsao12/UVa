package cpe49.cpe10461;

import java.util.*;

public class UVA10931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long input = sc.nextLong();
			if (input == 0) return;
			String binaryStr = Long.toBinaryString(input);
			// 直接使用API算bitCount
			// int bitCount = 0;
			// for (int i = 0; i < binaryStr.length(); i++) 
			//	 if (binaryStr.charAt(i) == '1') bitCount++;
			System.out.printf("The parity of %s is %d (mod 2).%n", binaryStr, Long.bitCount(input));
		}
	}
}
