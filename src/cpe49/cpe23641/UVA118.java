package cpe49.cpe23641;

import java.util.*;

public class UVA118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] xy = sc.nextLine().split("\\s+");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);
		int[][] grid = new int[x + 1][y + 1]; // 注意2維陣列長相與座標圖方向不同, 但是概念上可以直接用
		while (sc.hasNextLine()) {
			String[] robotInfo = sc.nextLine().split("\\s+");
			int robX = Integer.parseInt(robotInfo[0]);
			int robY = Integer.parseInt(robotInfo[1]);
			String robDirection = robotInfo[2];
			String ops = sc.nextLine();
			
			boolean isLost = false;
			for (int i = 0; i < ops.length(); i++) {
				switch(ops.charAt(i)) {
					case 'R':
						switch(robDirection) {
							case "E":
								robDirection = "S";
								break;
							case "W":
								robDirection = "N";
								break;
							case "S":
								robDirection = "W";
								break;
							case "N":
								robDirection = "E";
								break;
						}
						break;
					case 'L':
						switch(robDirection) {
							case "E":
								robDirection = "N";
								break;
							case "W":
								robDirection = "S";
								break;
							case "S":
								robDirection = "E";
								break;
							case "N":
								robDirection = "W";
								break;
						}
						break;
					case 'F':
						switch(robDirection) {
							case "E":
								if (robX == x) { // 如果往前走會落下就要檢查有無標記
									if (grid[robX][robY] != -1) {
											grid[robX][robY] = -1; // 落下前做標記
											isLost = true;
									}
								} else robX++;
								break;
							case "W":
								if (robX == 0) { // 如果往前走會落下就要檢查有無標記
									if (grid[robX][robY] != -1) {
											grid[robX][robY] = -1; // 落下前做標記
											isLost = true;
									}
								} else robX--;
								break;
							case "S":
								if (robY == 0) { // 如果往前走會落下就要檢查有無標記
									if (grid[robX][robY] != -1) {
											grid[robX][robY] = -1; // 落下前做標記
											isLost = true;
									}
								} else robY--;
								break;
							case "N":
								if (robY == y) { // 如果往前走會落下就要檢查有無標記
									if (grid[robX][robY] != -1) {
											grid[robX][robY] = -1; // 落下前做標記
											isLost = true;
									}
								} else robY++;
								break;
						}
						break;
				}
				if (isLost) break;
			}
			System.out.printf("%d %d %s%s%n", robX, robY, robDirection, isLost ? " LOST" : "");
		}
	}
}
/*
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mx = sc.nextInt();
		int my = sc.nextInt();
		int[][] mark = new int[mx + 1][my + 1];
		while (sc.hasNext()) {
			int rx = sc.nextInt();
			int ry = sc.nextInt();
			String ori = sc.next();
			int oriNum = 0;
			switch(ori) {
				case "N":
					oriNum = 0;
					break;
				case "E":
					oriNum = 1;
					break;
				case "S":
					oriNum = 2;
					break;
				case "W":
					oriNum = 3;
					break;
			}
			String ops = sc.next();
			boolean lost = false;
			for (int i = 0; i < ops.length(); i++) {
				if (lost) break;
				char temp = ops.charAt(i);
				switch(temp) {
					case 'L':
						oriNum = (oriNum + 3) % 4;
						break;
					case 'R':
						oriNum = (oriNum + 1) % 4;
						break;
					case 'F':
						switch(oriNum) {
							case 0:
								if (mark[rx][ry] == -1) {
									if (ry + 1 > my) continue; //此continus影響的是for迴圈寫break也可以break是影響switch
								}
								if (ry + 1 > my) {
									mark[rx][ry] = -1;
									lost = true;
								} else ry = ry + 1;
								break;
							case 1:
								if (mark[rx][ry] == -1){
									if (rx + 1 > mx) continue;
								}
								if (rx + 1 > mx) {
									mark[rx][ry] = -1;
									lost = true;
								} else rx = rx + 1;
								break;
							case 2:
								if (mark[rx][ry] == -1){
									if (ry - 1 < 0) continue;
								}
								if (ry - 1 < 0) {
									mark[rx][ry] = -1;
									lost = true;
								} else ry = ry - 1;
								break;
							case 3:
								if (mark[rx][ry] == -1) {
									if (rx - 1 < 0) continue;
								}
								if (rx - 1 < 0) {
									mark[rx][ry] = -1;
									lost = true;
								} else rx = rx - 1;
								break;
						}
						break;
				}
			}
			switch(oriNum) {
				case 0:
					ori = "N";
					break;
				case 1:
					ori = "E";
					break;
				case 2:
					ori = "S";
					break;
				case 3:
					ori = "W";
					break;
			}
			if (lost) System.out.printf("%d %d %S LOST%n", rx, ry, ori);
			else System.out.printf("%d %d %S%n", rx, ry, ori);
		}
	}
}
*/
