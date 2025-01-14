package cpe49.cpe21914;

import java.util.*;

public class UVA490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sRow = 0;
		int sMaxLen = 0;
		ArrayList<String> list = new ArrayList<>();
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			sRow++;
			if (input.length() > sMaxLen) sMaxLen = input.length();
			list.add(input);
		}
		for (int i = 0; i < sMaxLen; i++) {
			for (int j = list.size() - 1; j >= 0; j--) {
				String temp = list.get(j);
				if (i < temp.length())System.out.print(temp.charAt(i));
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
