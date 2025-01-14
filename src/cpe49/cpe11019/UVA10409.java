package cpe49.cpe11019;

import java.util.*;
/*
往北翻: 相對於原本朝上的數字 其北方會變成朝下 --> 朝上的就是7-朝下數字 且東西不變
往南翻: 相對於原本朝上的數字 其南方會變成朝下 --> 朝上的就是7-朝下數字 且東西不變
往東翻: 相對於原本朝上的數字 其東方會變成朝下 --> 朝上的就是7-朝下數字 且南北不變
往西翻: 相對於原本朝上的數字 其西方會變成朝下 --> 朝上的就是7-朝下數字 且南北不變
*/
public class UVA10409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int ops = sc.nextInt();
			if (ops == 0) return;
			// 一開始 1 朝上 2 朝北 3 朝西
			int up = 1;
			int north = 2; 
			int west = 3;
			int down = 7 - up;
			int south = 7 - north;
			int east = 7 - west;
			while (ops-- > 0) {
				String op = sc.next();
				int temp = 0; // 儲存其中一面翻轉前的資料
				switch(op) {
					case "east":
						temp = east;
						east = up;
						up = west;
						west = down;
						down = temp;
						break;
					case "west":
						temp = west;
						west = up;
						up = east;
						east = down;
						down = temp;
						break;
					case "north":
						temp = north;
						north = up;
						up = south;
						south = down;
						down = temp;
						break;
					case "south":
						temp = south;
						south = up;
						up = north;
						north = down;
						down = temp;
						break;
				}
			}
			System.out.println(up);
		}
	}
}
