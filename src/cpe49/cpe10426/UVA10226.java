package cpe49.cpe10426;

import java.util.*;

public class UVA10226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = Integer.parseInt(sc.nextLine().trim().split("\\s+")[0]);
		int caseNum = 0;
		while (caseCount-- > 0) {
			caseNum++;
			Map<String, Integer> map = new TreeMap<>(); // 省去排序
			int count = 0;
			while (sc.hasNextLine()) {
				String input = sc.nextLine();
				if (input.trim().length() == 0) {
					if (caseNum == 1) { // 讀取的是第一組測資就繼續讀取
						caseNum++; 
						continue;
					} 
					else break; // 若非第一組測資表示後面的資料是下一組的，所以 break
				}
				if (!map.containsKey(input)) {
					if (input.length() != 0) map.put(input, 1);
				} else map.put(input, map.get(input) + 1);
				count++;
			}
			for (String key : map.keySet()) System.out.printf("%s %.4f%n", key, (double)100 * map.get(key) / count);

			if (caseCount > 0) System.out.println(); // 處理換行
		}
	}
}
/* 
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while(sc.hasNextLine()){
			HashMap<String, Integer> map = new HashMap<>(); // 存放資料
			String st;
			int count = 0;
			// 讀取物種名稱
			while(sc.hasNextLine() && !("".equals(st = sc.nextLine()))){
				if(map.containsKey(st)) map.put(st, map.get(st) + 1); // 物種數量 + 1
				else map.put(st, 1); // 建立此物種在表中
				count++;
			}
	        // 取得鍵並排序
	        List<String> keys = new ArrayList<>(map.keySet());
	        Collections.sort(keys);
			//Output
			for(String key : keys){
				System.out.printf("%s %.4f", key, map.get(key) * 100.0 / count);
				System.out.println();
			}
			if(map.size() != 0 && (--caseCount) > 0) System.out.println();
		}
	}
}
*/
