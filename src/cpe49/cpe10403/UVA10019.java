package cpe49.cpe10403;

import java.util.*;

public class UVA10019 {
	private static List<Integer> fibRecord = new ArrayList<>();
	public static void main(String[] args) {
		fibRecord.add(1);fibRecord.add(1);
		for (int i = 2; fibRecord.get(fibRecord.size() - 1) < 100000000; i++) { // 依據題目先建好
			fibRecord.add(fibRecord.get(i-2) + fibRecord.get(i-1));
		}
		// System.out.println(fibRecord);
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (caseCount-- > 0) {
			int input = sc.nextInt();
			int temp = input;
			StringBuilder sb = new StringBuilder();
			while (temp > 0) {
				int index = 0;
				for (int i = fibRecord.size() - 1; i >= 0; i--) {
					if (temp >= fibRecord.get(i)) { // 找到 fib 進制最大的位數為第 i 位，所以會有 i 位數字(i ~ 1)
						index = i;
						break;
					} 
				}
				for (int i = index; i >= 1; i--) { // 表示第 index 位到第 1 位數字
					if (temp >= fibRecord.get(i)) {
						sb.append(1);
						temp -= fibRecord.get(i);
					} else sb.append(0);
				}
			}
			System.out.printf("%d = %s (fib)%n", input, sb.toString());
		}
	}
}
/*
// 之前的筆記
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		while (sc.hasNext()) {
			int input = sc.nextInt();
			int temp = list.get(list.size() - 1);
			while (input > temp) {
				temp = list.get(list.size() - 1) + list.get(list.size() - 2);
				list.add(temp);
			}
			//System.out.println(list);
			int num = input;
			int idx = list.size() - 1;
			String result = "";
			int zero = 0;
			while (num >= 1) { 
				for (int i = idx; i >= 0; i--) {
					if (num >= list.get(i)) {
						num -= list.get(i);
						result = result + "1";
					} else if (num < input && num < list.get(i)) {
						result = result + "0";
					}
				}
			}
			System.out.println(input + " = " + result + " (fib)");
		}
	}
}
*/
