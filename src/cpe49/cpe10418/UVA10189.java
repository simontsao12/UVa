package cpe49.cpe10418;

import java.util.*;

public class UVA10189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = 0;
		while (sc.hasNextLine()) {
			caseCount++;
			String[] nm = sc.nextLine().trim().split("\\s+");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			if (n == 0 && m == 0) return;
			if (caseCount != 1) System.out.println(); // 控制換行
			System.out.printf("Field #%d:%n", caseCount);
			long[][] field = new long[n][m];
			List<Integer> xList = new ArrayList<>();
			List<Integer> yList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String row = sc.nextLine().trim();
				for (int j = 0; j < m; j++) {
					if (row.charAt(j) == '*'){
						field[i][j] = -1;
						xList.add(j);
						yList.add(i);
					} else field[i][j] = 0;
					// System.out.print(j == m - 1 ? field[i][j] + "\r\n" : field[i][j]);
				}
			}
			int mineCount = xList.size();
			for (int i = 0; i < mineCount; i++) {
				int r = yList.get(i);
				int c = xList.get(i);
				// 上
				for (int j = c - 1; j < c + 1; j++) {
					if (j >= 0 && j < m && (r - 1) >= 0) 
						if(field[r - 1][j] != -1) field[r - 1][j]++;
				}
				// 右
				for (int j = r - 1; j < r + 1; j++) {
					if (j >= 0 && j < n && (c + 1) < m) 
						if(field[j][c + 1] != -1) field[j][c + 1]++;
				}
				// 下
				for (int j = c + 1; j > c - 1; j--) {
					if (j >= 0 && j < m && (r + 1) < n) 
						if(field[r + 1][j] != -1) field[r + 1][j]++;
				}
				// 左
				for (int j = r + 1; j > r - 1; j--) {
					if (j >= 0 && j < n && (c - 1) >= 0) 
						if(field[j][c - 1] != -1) field[j][c - 1]++;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (j == m - 1) System.out.print(field[i][j] == -1 ? "*"  + "\r\n" : field[i][j] + "\r\n");
					else System.out.print(field[i][j] == -1 ? "*" : field[i][j]);
				}
			}
		}
	}
}
/*
import java.util.*;

public class main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int field = 0, h, w; //高(rows)與寬(columns)
		while(sc.hasNextInt() && (h = sc.nextInt()) != 0 && (w = sc.nextInt()) != 0){
			if(field != 0) System.out.println();
			char arr[][] = new char[h][w];
			//讀地圖
			for(int i = 0; i < h; i++){
				String temp = sc.next();
				for(int j = 0; j < w; j++){
					arr[i][j] = temp.charAt(j);
				}
			}
			//輸出
			System.out.println("Field #" + (++field) + ":");
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					int ans=0;
					if(i - 1 >= 0 && arr[i - 1][j ] == '*') ans++;
					if(i + 1 < h && arr[i + 1][j] == '*') ans++;
					if(j - 1 >= 0 && arr[i][j - 1] == '*') ans++;
					if(j + 1 < w && arr[i][j + 1] == '*') ans++;
					
					if((j + 1 < w && i + 1 < h) && arr[i + 1][j + 1] == '*') ans++;
					if((j + 1 < w && i - 1 >= 0) && arr[i - 1][j + 1] == '*') ans++;
					if((j - 1 >= 0 && i + 1 < h) && arr[i + 1][j - 1] == '*') ans++;
					if((j - 1 >= 0 && i - 1 >= 0) && arr[i - 1][j - 1] == '*') ans++;
					
					if(arr[i][j] == '*') System.out.print("*");
					else System.out.print(ans);
				}
				System.out.println("");
			}
		}
	}
}
*/
