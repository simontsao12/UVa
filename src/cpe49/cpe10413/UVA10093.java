package cpe49.cpe10413;

import java.util.*;

public class UVA10093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			int maxBitVal = 0; // 紀錄最大位數數值
			long bitValSum = 0;
			for (int i = 0; i < input.length(); i++) {
				int temp = 0;
				char c = input.charAt(i);
				if (c >= '0' && c <= '9') { // 使用 '0' ~ '9' 表示 0 ~ 9
					temp = c - '0' + 0;
					bitValSum += temp;
				} else if (c >= 'A' && c <= 'Z') { // 使用 'A' ~ 'Z' 表示 10 ~ 35
					temp = c - 'A' + 10;
					bitValSum += temp;
				} else if (c >= 'a' && c <= 'z') { // 使用 'a' ~ 'z' 表示 36 ~ 61
					temp = c - 'a' + 36;
					bitValSum += temp;
				} // 其他的符號不考慮，題目有講會符合整數
				if (temp > maxBitVal) maxBitVal = temp; // 紀錄最大位數數值
			}
			// 題目給的條件推出，若為 n 進位，則每個位數加總後 % n - 1 為 0
			for (int i = 2; i <= 62; i++) {
				if (maxBitVal > i - 1) // 檢查假設為 n 進位則其最大位數是否 > n - 1
						continue;
				if (bitValSum % (i - 1) == 0) { // 小到大，符合就可以終止
					System.out.println(i);
					break;
				} else if (i == 62) System.out.println("such number is impossible!"); // 到 62 都還是無法符合條件
			}
		}
	}
}
/*
// 之前的筆記
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String input = sc.next();
			int sum = 0;
			int base = 0;
			boolean flag = true;
			int maxBitVal = 1; 
			for (int i = 0; i < input.length(); i++) {
				char bitVal = input.charAt(i);
				int val = 0;
				//N在[2, 62]之間表示進位例如62進位每一位數字可能從0~61
				if (bitVal >= '0' && bitVal <= '9') //若符號為0~9 
					val = bitVal - '0'; //要使用'0'~'9'代表0~9
				if (bitVal >= 'A' && bitVal <= 'Z') //若符號為A~Z
					val = bitVal - 'A' + 10; //要使用'A'~'Z'代表10~35
				if (bitVal >= 'a' && bitVal <= 'z') //若符號為a~z
					val = bitVal - 'a' + 36; //要使用'a'~'z'代表36~61
				sum += val; //紀錄一個輸入字串所有位數中最大的數字
				if (val > maxBitVal) maxBitVal = val;
			}
			for (int j = maxBitVal; j <= 62; j++) { //從位數中最大的數字開始檢測
				if (j == 62){
					flag = false;						
					break;
				} 
				if (sum % j == 0) {
					base = j + 1;
					break;
				}
			}
			if (flag) System.out.println(base);
			else System.out.println("such number is impossible!");
		}
	}
}
*/
