package cpe49.cpe23621;

import java.util.*;

public class UVA11063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = 0;
		while (sc.hasNext()) {
			caseCount++;
			boolean isB2 = true;
			int count = sc.nextInt();
			int[] arr = new int[count];
			for (int i = 0; i < count; i++) {
				arr[i] = sc.nextInt();
				//根據題目要自己加以下檢查
				if (i != 0 && arr[i - 1] >= arr[i] || arr[i] < 1) {
					isB2 = false;
				}
			}
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < count && isB2; i++) {
				for (int j = i; j < count; j++) {
					if (!list.contains(arr[i] + arr[j])) list.add(arr[i] + arr[j]);
					else isB2 = false;
				}
			}
			System.out.printf("Case #%d: It is %s B2-Sequence.%n%n", caseCount, isB2 ? "a" : "not a");
		}
	}
}
