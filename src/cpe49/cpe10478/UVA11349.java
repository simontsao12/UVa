package cpe49.cpe10478;

import java.util.*;

public class UVA11349 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = Integer.parseInt(sc.nextLine().trim().split("\\s+")[0]);
		for (int i = 0; i < caseCount; i++) {
			boolean isSymmetric = true;
			long n = Long.parseLong(sc.nextLine().trim().split("\\s+")[2]);
			//if (n % 2 == 0) isSymmetric = false; //偶數也可以
			long[][] matrix = new long[(int)n][(int)n];
			for (int j = 0; j < n; j++) {
				String[] row = sc.nextLine().trim().split("\\s+");
				for (int k = 0; k < n; k++) {
					matrix[j][k] = Long.parseLong(row[k]);
					if (matrix[j][k] < 0L) isSymmetric = false;
				}
			}
			for (int j = 0; j < n && isSymmetric; j++) {
				for (int k = 0; k < n; k++) {
					if (matrix[j][k] != matrix[(int)(n - 1 - j)][(int)(n - 1 - k)]) isSymmetric = false; 
				}
			}
			System.out.printf("Test #%d: %s%n", (i + 1), isSymmetric ? "Symmetric." : "Non-symmetric.");
		}
	}
}
