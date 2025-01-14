package cpe49.cpe10406;

import java.util.*;
import java.io.*;

public class UVA10041 {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(reader);
		st.nextToken();
		short caseCount = (short) st.nval; 
        while (caseCount-- > 0) {
        	st.nextToken();
        	short numCount = (short) st.nval; 
        	short[] arr = new short[numCount];
        	for (int i = 0; i < numCount; i++) {
        		st.nextToken();
        		arr[i] = (short) st.nval;
        	}
        	Arrays.sort(arr);
        	//取中位數
			int m = arr[(arr.length - 1) / 2];
			int sum = 0;
			for (int i : arr) sum += Math.abs(i - m);
			System.out.println(sum);
        }
        reader.close();
	}
}
