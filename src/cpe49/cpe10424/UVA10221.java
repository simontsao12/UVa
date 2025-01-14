package cpe49.cpe10424;

import java.util.*;

public class UVA10221 {
	final static double r = 6440;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double distance = sc.nextInt();
			double degree = sc.nextInt();
			String unit = sc.next();
			if ("min".equals(unit)) degree = degree / 60; // 遇到分就先轉成 degree
			
			// 設degree 630 度，應相當於處理 270 度，
			// 如果沒有先 % 360 會變成 Math.min(-270, 630) 得到 -270，將導致 Math.toRadians(degree) 得到弧長為負數 
			degree = degree % 360;
			degree = Math.min(360 - degree, degree);
			
			double arcDist = (distance + r) *  Math.toRadians(degree); // 弧長是否等於半徑 * 弧度
			// 弦長根據餘弦定理: c^2 = r^2 + r^2 - 2 * r * r * cos(D) -> c^2 = 2 * r^2 * (1 - cos(D)) c還要開根號
			double chordDist = Math.sqrt(2 * Math.pow(distance + r, 2) * (1 - Math.cos(Math.toRadians(degree))));
			System.out.printf("%.6f %.6f%n", arcDist, chordDist);
		}
	}
}
