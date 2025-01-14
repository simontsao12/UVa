package cpe49.cpe11067;

import java.util.*;

public class UVA11150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int bottles = sc.nextInt();
			int sum = 0;
			int empty = 0;
			while (bottles > 0) {
				sum += bottles; // 喝可樂
				empty += bottles; // 喝完得到空瓶
				if (empty == 2) empty++; // 等於 2 時可以借一個空瓶，因為可以換一瓶可樂喝還就能還空瓶
				bottles = empty / 3; // 用空瓶換可樂
				empty = empty % 3; // 剩下的不能換可樂的空瓶
			}
			System.out.println(sum);
		}
	}
}
/*
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int ans = 0;
			if(n <= 1){
				//當n<=1時，直接印出目前有幾罐可樂。因為再怎麼跟朋友借瓶子，也無法歸還空瓶。
				System.out.println(n);
			} else {
				//ans = 最多可以喝多少可樂。初始化為一開始所擁有的可樂數量。
				ans = n;
				
				//當瓶子剩下1個時，結束迴圈。
				while(n != 1){
					
					if(n == 2) n = n + 1; //當n == 2時再跟朋友借一個瓶子。
					
					ans = ans + (n / 3); //喝掉的可樂數量
					
					n = (n % 3) + (n / 3); //目前的瓶子 = 原本剩下的瓶子 + 兌換後的瓶子
				}	
				//結果輸出
				System.out.println(ans);
			}
		}
	}
}
*/
