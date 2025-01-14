package cpe49.cpe10425;

import java.util.*;

public class UVA10222 {
	private static final String TEMPLATE = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./"; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			StringBuilder sb = new StringBuilder();
			String input = sc.nextLine().toLowerCase();
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '`') sb.append("`");
				else if (input.charAt(i) == '1') sb.append("1");
				else {
					boolean isContain = false;
					for (int j = 0; j < TEMPLATE.length(); j++) {
						if (j >= 2 && input.charAt(i) == TEMPLATE.charAt(j)) { 
							sb.append(TEMPLATE.charAt(j - 2));
							isContain = true;
							break;
						} 
					}
					if (!isContain) sb.append(input.charAt(i));
				}

			}
			System.out.println(sb.toString());
		}
	}
}
