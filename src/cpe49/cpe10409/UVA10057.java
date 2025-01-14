package cpe49.cpe10409;

import java.util.*;
import java.io.*;
/*
 * 找出最小的中位數
 * 計算有幾個和中位數一樣的數字
 * 資料偶數個時中位數有 2 個
 * 資料是奇數個時中位數有 1 個
 * 找出可能有幾種最小值(包含不在所輸入的資料裡面)
 * 資料為奇數個時答案為 1 ，資料為偶數個時答案為 2 個中位數相減加 1
 */
public class UVA10057 {
	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		// 因應 ZeroJudge 會 MLE 改用 StreamTokenizer
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(reader);
		// while (sc.hasNext()) {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			// int count = sc.nextInt();
			int count = (int)st.nval;
			int[] arr = new int[count];
			// for (int i = 0; i < count; i++) arr[i] = sc.nextInt();
			for (int i = 0; i < count; i++) {
				st.nextToken();
				arr[i] = (int)st.nval;
			}
			Arrays.sort(arr);
			// 求最小的中位數
			int ans1 = arr[(arr.length - 1) / 2];
			// 求與中位數相同的個數
			int ans2 = 0;
			for (int i = 0; i < arr.length; i++) {
					if (arr[i] ==  arr[(arr.length - 1) / 2] || arr[i] == arr[(arr.length) / 2]) ans2++;
			}
			// 求長度奇數偶數情況下的中位數，注意偶數的話要取區間，不一定只是陣列中的數字
			int ans3 = 0;
			if (arr.length % 2 != 0) ans3 = 1;
			else {
				ans3 = arr[(arr.length) / 2] - arr[(arr.length - 1) / 2] + 1;
			}
			System.out.printf("%d %d %d%n", ans1, ans2, ans3);
		}
	}
}
