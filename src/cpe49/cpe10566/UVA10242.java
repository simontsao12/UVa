package cpe49.cpe10566;

import java.util.*;

public class UVA10242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = 0;
		while (sc.hasNext()) {
			caseCount++;
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			double x = 0;
			double y = 0;
			// 題目沒說點的順序
			// 某一次提交出現奇怪測資 10 5 2 1 2 1 10 5 導致提交失敗
			if (x1 == x3 && y1 == y3) {
				x = x2 + (x4 - x3);
				y = y2 + (y4 - y3);
			} else if (x1 == x4 && y1 == y4) {
				x = x2 + (x3 - x4);
				y = y2 + (y3 - y4);
			} else if (x2 == x3 && y2 == y3) {
				x = x1 + (x4 - x3);
				y = y1 + (y4 - y3);
			} else if (x2 == x4 && y2 == y4) {
				x = x1 + (x3 - x4);
				y = y1 + (y3 - y4);
			}
			System.out.printf("%.3f %.3f%n", x, y);
		}
	}
}
