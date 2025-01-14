package cpe49.cpe10419;

import java.util.*;

public class UVA10190 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long left = sc.nextLong();
			long right = sc.nextLong();
			if (left < right || right == 0 || right == 1) {
				System.out.println("Boring!");
				continue;
			}
			long check = 1; // 有可能 left 是 int 天花板，當超過left時會產生運算上的錯，所以使用 long
			while (check < left) {
				check *= right;
			}
			if (check == left) {
				while (check > 1) {
					System.out.print(check + " ");
					check /= right;
				}
				System.out.println(check);
			} else System.out.println("Boring!");
		}
	}
}
