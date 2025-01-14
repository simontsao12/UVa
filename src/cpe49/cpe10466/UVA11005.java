package cpe49.cpe10466;

import java.util.*;

public class UVA11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		for (int i = 0; i < caseCount; i++) {
			if (i == 0) System.out.printf("Case %d:%n", (i + 1)); // 控制換行
			else System.out.printf("%nCase %d:%n", (i + 1));
			int[] cost = new int[36];
			for (int j = 0; j < 36; j++) cost[j] = sc.nextInt();
			int queries = sc.nextInt();
			for (int j = 0; j < queries; j++) {
				int num = sc.nextInt();
				int minPrice = Integer.MAX_VALUE;
				List<Integer> priceList = new ArrayList<>();
				for (int k = 2; k <= 36; k++) { // 2 進位到 36 進位都算一遍取最小
					int price = 0;
					int[] count = translate(num, k);
					for (int l = 0; l < 36; l++) {
						price += count[l] * cost[l];
					}
					if (price < minPrice) minPrice = price;
					priceList.add(price);
				}
				System.out.printf("Cheapest base(s) for number %d:", num);
				for (int k = 0; k < priceList.size(); k++) {
					if (minPrice == priceList.get(k)) System.out.printf(" %d", (k + 2)); // 索引 0 放的是 2 進位所以 + 2 ，以此類推
				}
				System.out.println();
			}
		}
	}
	private static int[] translate(int deciVal, int nBase) {
		int[] count = new int[36];
		int temp = 0;
		while (deciVal > 0) {
			temp = deciVal % nBase;
			count[temp]++;
			deciVal /= nBase;
		}
		return count;
	}
}
/*
// 之前的筆記
import java.util.*;
// 進位數範圍[2, 36]
// 其中每列測資是以0~2000000000的十進位表示
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int caseNum = 0;
		while ((testCases--) > 0) {
			System.out.println("Case " + (++caseNum) + ":");
			int[] cost = new int[36];
			//讀取每個數字的cost
			for (int i = 0; i < 36; i++) {
				cost[i] = sc.nextInt();
			}
			//讀取測資
			int rows = sc.nextInt(); //共有rows個數字
			for (int i = 0; i < rows; i++) {
				int input = sc.nextInt();
				//十進位轉換成不同進位[2, 36]進位之間//計算出不同進位需要多少錢
				int totalMoney[] = new int[37]; //每個進位的價錢
				for (int j = 2; j < 37; j++) {
					int tenBaseTempValue = input; 
					while (tenBaseTempValue > 0) {
						//以j = 10(十進位)為例 假設測資input為101
						int temp = tenBaseTempValue % j; //e.g. 101 % 10 = 1 --(10 > 0)--> 10 % 10 = 0 --(1 > 0)--> 1 % 10 = 1
						tenBaseTempValue /= j; //e.g. 101 / 10 =10 -->  10 / 10 = 1 --> 1 / 10 = 0
						//每次while中累加最低位數價錢 
						totalMoney[j] +=  cost[temp]; //e.g. 個位數:1的cost 十位數:0的cost 百位數:1的cost
					}
					
				}
				int minMoney = totalMoney[2]; //初始值為2進位價錢
				for (int j = 3; j < 37; j++) {
					if (totalMoney[j] < minMoney) minMoney = totalMoney[j];
				}
				//輸出
				System.out.print("Cheapest base(s) for number " + input + ":");
				for (int j = 2; j < 37; j++) {
					if (totalMoney[j] == minMoney) System.out.print(" "+j);
				}
				System.out.println();
			}
			if (testCases > 0)System.out.println();
		}
	}
}
*/
