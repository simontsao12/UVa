package cpe49.cpe10414;

import java.io.*;

public class UVA10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(reader);
        int caseCount = 0;
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	caseCount++;
            long num = (long)st.nval;
            System.out.printf("%4d.", caseCount);
            if (num == 0) {
                System.out.print(" 0");
            } else if (num >= 10000000) {
                helper(num / 10000000); // 最大999999999999999所以處理一次即可
                System.out.print(" kuti");
                helper(num % 10000000);
            } else {
                helper(num);
            }
            System.out.println();
        }
		reader.close();
    }
    private static void helper(long num) {
        while (num > 0) { // 每輪從上到下處理
            if (num >= 10000000) {
                System.out.print(" " + (num / 10000000) + " kuti");
                num %= 10000000;
            } else if (100000 <= num && num < 10000000) {
                System.out.print(" " + (num / 100000) + " lakh");
                num %= 100000;
            } else if (1000 <= num && num < 100000) {
                System.out.print(" " + (num / 1000) + " hajar");
                num %= 1000;
            } else if (100 <= num && num < 1000) {
                System.out.print(" " + (num / 100) + " shata");
                num %= 100;
            } else {
                System.out.print(" " + num);
                //num /= 100; // 也可以使用break結束循環
                break;
            }
        }
    }
}

