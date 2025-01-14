package cpe49.cpe10517;

import java.util.*;

public class UVA10050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			int days = sc.nextInt();
			int parties = sc.nextInt();
			int[] table = new int[days + 1]; // 索引0沒意義 要包含最後一天所以 +1 

			int count = 0;
			for (int i = 0; i < parties; i++) {
				int day = sc.nextInt();
				int durationToNextDay = day;
				while (day <= days) {
					if (day % 7 != 6 && day % 7 !=0 && table[day] == 0) count++; // 第一次登記
					table[day]++;
					day += durationToNextDay; // 不能直接用 day += day 會越加越大
				}
			}
			System.out.println(count);
		}
	}
}
