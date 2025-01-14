package cpe49.cpe22131;

import java.util.*;

public class UVA272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int count = 0; // 控制器
		boolean control = false;
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '"') {
					// count = (count + 1) % 2; // 控制器
					// if (count % 2 != 0) sb.append("``");
					control = control == true ? false : true; // 控制器
					if (control) sb.append("``");
					else sb.append("''");
				} else sb.append(input.charAt(i));
			}
			System.out.println(sb.toString()); 
		}
	}
}

