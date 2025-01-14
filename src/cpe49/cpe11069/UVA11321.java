package cpe49.cpe11069;

import java.util.*;

public class UVA11321 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int numCount = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(numCount + " " + m);
			if (numCount == 0 && m == 0) return;	
			Integer[] arr = new Integer[numCount]; // 注意要使用參考型別
			for (int i = 0; i < numCount; i++) arr[i] = sc.nextInt();
			Arrays.sort(arr, new Comparator<Integer>(){
				@Override
				public int compare(Integer n1, Integer n2) {
					if (n1 % m == n2 % m) {
						if (n1 % 2 != 0 && n2 %2 != 0) {
							return -(n1 - n2);
						} else if (n1 % 2 == 0 && n2 %2 == 0) {
							return (n1 - n2);
						} else {
							if (n1 % 2 != 0) return -1;
							else return 1;
						}
					} else return (n1 % m) - (n2 % m);
				}
			});
			for (int i : arr)
				System.out.println(i);
		}
	}
}
