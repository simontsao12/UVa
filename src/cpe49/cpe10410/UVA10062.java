package cpe49.cpe10410;

import java.util.*;

public class UVA10062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int[] arr = new int[129];
			String input = sc.nextLine();
			int max = 0;
			for (int i = 0; i < input.length(); i++) {
				arr[input.charAt(i)]++;
				if (arr[input.charAt(i)] > max) max = arr[input.charAt(i)];	
			}
			for (int i = 1; i <= max; i++) {
				for (int j = 128; j >= 32 ; j--) {
					if (i == arr[j]) System.out.println(j + " " + i);
				}
			}
			if (sc.hasNextLine()) System.out.println();
		}
	}
}
