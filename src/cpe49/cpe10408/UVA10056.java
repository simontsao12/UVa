package cpe49.cpe10408;

import java.util.*;

public class UVA10056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			double p = sc.nextDouble();
			int i = sc.nextInt();
			// 設 n == 3
			// i == 1 時可能勝利的遊玩次數: 1 4 7 10...
			// i == 2 時可能勝利的遊玩次數: 2 5 8 11...
			// 推得 n == x 時
			// 且 i == y 時可能勝利的遊玩次數: y (y + x) (y + 2x)...
			// 機率: p(1 - p) ^ (y - 1) + p(1 - p) ^ (y + x - 1) + p(1 - p) ^ (y + 2x - 1)...
			// 將 p(1 - p) ^ (y - 1) 提出得到公比為 (1 - p) ^ x
			// 當x趨近無限直接取極限的結果: p(1 - p) ^ (y - 1) / (1 - (1 - p) ^ x)
			if (p == 0) {
				double zero = 0;
				System.out.printf("%.4f%n", zero);
				continue;
			}
			double ans = p * Math.pow((1 - p), (i - 1)) / (1 - Math.pow((1 - p), n));
			System.out.printf("%.4f%n", ans);
		}
	}
}
