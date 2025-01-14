package cpe49.cpe10407;

import java.util.*;

public class UVA10055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong())); // 注意測資大小要使用long
		}
	}
}
