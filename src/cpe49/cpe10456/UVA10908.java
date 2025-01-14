package cpe49.cpe10456;

import java.util.*;

public class UVA10908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (caseCount-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int q = sc.nextInt();
			System.out.printf("%d %d %d%n", m, n, q);
			char[][] grid = new char[m][n];
			for (int i = 0; i < m; i++) {
				String row = sc.next(); // 一次一列省去考慮空白與換行的問題
				for (int j = 0; j < row.length(); j++) grid[i][j] = row.charAt(j);
			}
			for (int i = 0; i < q; i++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				char center = grid[r][c];
				int sideLen = 1; // 一開始中心長度為 1
				int count = 1; // 上下左右每輪要扣掉的量
				boolean continueFlag = true;
				while (continueFlag) {
					// 檢查條件
					if (r - count < 0 || c - count < 0 || r + count > m - 1 || c + count > n - 1) break;
					// 上
					for (int j = c - count; j < c + count; j++) {
						if (center != grid[r - count][j]) {
							continueFlag = false;
							break;
						}
					}
					// 右
					for (int j = r - count; j < r + count; j++) {
						if (center != grid[j][c + count]) {
							continueFlag = false;
							break;
						}
					}
					// 下
					for (int j = c + count; j > c - count; j--) {
						if (center != grid[r + count][j]) {
							continueFlag = false;
							break;
						}
					}
					// 左
					for (int j = r + count; j > r - count; j--) {
						if (center != grid[j][c - count]) {
							continueFlag = false;
							break;
						}
					}
					// 若 continueFlag 為真要進行更新
					if (continueFlag) {
						count++; // 向外擴展所以 count 要 + 1
						sideLen += 2; // 向外擴展邊長每輪 + 2
					}
				}
				System.out.println(sideLen);
			}
		}
	}
}
