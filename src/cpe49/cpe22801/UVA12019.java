package cpe49.cpe22801;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class UVA12019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (sc.hasNext()) {
			int year = 2011;
			int month = sc.nextInt();
			int day = sc.nextInt();
			LocalDate date = LocalDate.of(year, month, day);
			System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		}
	}
}
