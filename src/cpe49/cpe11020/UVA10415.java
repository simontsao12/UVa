package cpe49.cpe11020;

import java.util.*;

public class UVA10415 {
	private static Map<Character, List<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		map.put('c', Arrays.asList(2 ,3, 4, 7, 8, 9 ,10));
		map.put('d', Arrays.asList(2 ,3, 4, 7, 8, 9));
		map.put('e', Arrays.asList(2 ,3, 4, 7, 8));
		map.put('f', Arrays.asList(2 ,3, 4, 7));
		map.put('g', Arrays.asList(2 ,3, 4));
		map.put('a', Arrays.asList(2 ,3));
		map.put('b', Arrays.asList(2));
		map.put('C', Arrays.asList(3));
		map.put('D', Arrays.asList(1, 2 ,3, 4, 7, 8, 9));
		map.put('E', Arrays.asList(1, 2 ,3, 4, 7, 8));
		map.put('F', Arrays.asList(1, 2 ,3, 4, 7));
		map.put('G', Arrays.asList(1, 2 ,3, 4));
		map.put('A', Arrays.asList(1, 2 ,3));
		map.put('B', Arrays.asList(1, 2));
		List<Integer> t1 = Arrays.asList(1, 2, 3);
		List<Integer> t2 = Arrays.asList(2, 3);
		Scanner sc = new Scanner(System.in);
		int caseCount = Integer.parseInt(sc.nextLine().trim());
		while (caseCount-- > 0) {
			List<Integer> fingers = new ArrayList<>();
			String input = sc.nextLine(); 
			int[] pressCount = new int[10 + 1]; 
			List<Integer> temp = null;
			for (int i = 0; i < input.length(); i++) {
				temp = new ArrayList(map.get(input.charAt(i))); // 因為從 map 中拿到的不能更動所以新建立
				if (i == 0) {
					fingers.addAll(temp); // 第一個音按完就更新
					helper(pressCount, fingers); // 更新紀錄
				}
				fingers.retainAll(temp); // 保留重複按法的手指
				temp.removeAll(fingers); // 刪除需要重複案的手指，保留還需要案的手指
				helper(pressCount, temp); // 更新紀錄
				fingers.addAll(temp); // 將還需要案的手指按下
			}
			for (int i = 1; i < pressCount.length; i++) { // 索引 0 沒有用
				System.out.printf("%s", i == pressCount.length - 1 ? pressCount[i] + "\r\n" : pressCount[i] + " ");
			}
		}
	}
	private static void helper(int[] pressCount, List<Integer> fingers) {
		for (int i = 0; i < fingers.size(); i++) {
			pressCount[fingers.get(i)]++;
		}
	}
}
/*
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < cases; i++){
		    //紀錄每個英文字母所會按到的鍵 e.g. c:2~4, 7~10
			String finger[]={"c0111001111", "d0111001110", "e0111001100", "f0111001000", "g0111000000", "a0110000000", "b0100000000", 
						"C0010000000", "D1111001110", "E1111001100", "F1111001000", "G1111000000", "A1110000000", "B1100000000"};
			
			int count[] = new int[10]; //紀錄每個鍵所按的次數
			String st = sc.nextLine();
			String current = "0000000000"; //目前手指所按的鍵
			for(int j = 0; j < st.length(); j++){
				String temp="";
				//找出目前的英文字母所需要案的鍵
				for(int k = 0; k < finger.length; k++){
					if(st.charAt(j) == finger[k].charAt(0)){
						temp = finger[k].toString();
						break;
					}
				}
				//判斷次數是否++
				StringBuilder stB = new StringBuilder(temp);
				temp = stB.substring(1);
				for(int k = 0; k < 10; k++){
					if(current.charAt(k) != temp.charAt(k) && temp.charAt(k) == '1') count[k]++;
				}
				current = temp;
			}
			
			//輸出
			for(int j = 0; j < 10; j++){
				if(j != 9) System.out.print(count[j] + " ");
				else System.out.print(count[j]);
			}
			System.out.println("");
		}
	}
}
*/
