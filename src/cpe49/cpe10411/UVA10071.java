package cpe49.cpe10411;

import java.util.*;

public class UVA10071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int v = sc.nextInt(); // v = v0 + a * t
			int t = sc.nextInt(); // d = v0 * t + 1 / 2 * a * (2t)^2
			// => d - v * t = 2 * a * t^2 - a * t^2
			// 而 a(預設等加速度) = v / t => d = v * t + v * t = 2 * v * t
			int s = 2 * v * t;
			System.out.println(s);
		}
	}
}
