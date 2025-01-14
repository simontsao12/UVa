package cpe49.cpe10431;

import java.util.*;

public class UVA10268 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int x = Integer.parseInt(sc.nextLine().split("\\s+")[0]);
			String[] cof = sc.nextLine().split("\\s+");
			int power = cof.length - 1;
			long result = 0;
			for (int i = 0; i < cof.length; i++) {
				if (power > 1) result += power * Integer.parseInt(cof[i]) * Math.pow(x, power - 1);
				else if (power == 1) result += Integer.parseInt(cof[i]);
				power--;
			}
			System.out.println(result);
		}
	}
}
