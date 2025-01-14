package cpe49.cpe10447;

/*
 * 每一層加總相同: 例如 (0, 0) -> x 座標 0 加上 y 座標 0 等於 0
 * 第一層: (0, 1) (1, 0) -> 每組 x 座標加上 y 座標都會等於 1
 * 第二層: (0, 2) (1, 1) (2, 0) ->	每組 x 座標加上 y 座標都會等於 2 , 此值也就是到(0, 2)的移動次數, 要計算到 (1, 1) 則是再加上其 x 值即 1 即可
 * 類推得到第 n 層: 其 x 座標加上 y 座標會等於到達(0, n)的移動次數, 再加上 x 即是到達第 n 層 (x, y) 的移動次數
 * 先算 (0, 0) 到第一個點的距離s1
 * 再算 (0, 0) 到第二個點的距離s2
 * 再將s2 - s1
 */
import java.util.*;

public class UVA10642 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int caseCount = sc.nextInt();
			for (int i = 0; i < caseCount; i++) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				//s1
				long count1 = 0;
				for (int j = 1; j <= x1 + y1; j++) {
					count1 += j;
				} 
				count1 += x1;
				//s2
				long count2 = 0;
				for (int j = 1; j <= x2 + y2; j++) {
					count2 += j;
				}
				count2 += x2;
				System.out.println("Case " + (i + 1) + ": " + (count2 - count1));
			}
		}
	}
}
