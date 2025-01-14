package cpe49.cpe22811;

import java.util.*;

public class UVA299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();
		while (caseCount-- > 0) {
			int count = sc.nextInt();
			int[] arr = new int[count];
			for (int i = 0; i < count; i++) {
				arr[i] = sc.nextInt();
			}
			int swaps = 0;
			for (int i = 0; i < count - 1; i++) {
				for (int j = 0; j < count - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
						swaps++;
					}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.%n", swaps);
		}
	}
}

/*
// cpp
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int caseCount;
    cin >> caseCount;  // 讀取測試案例數量

    while (caseCount--) {
        int length;
        cin >> length;  // 讀取數組長度
        vector<int> list(length);  // 使用 vector 來存儲數據
        
        // 讀取數組元素
        for (int i = 0; i < length; i++) {
            cin >> list[i];
        }

        int count = 0;
        // 冒泡排序並計算交換次數
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // 交換兩個元素
                    swap(list[j], list[j + 1]);
                    count++;  // 每次交換計數
                }
            }
        }

        // 輸出結果
        cout << "Optimal train swapping takes " << count << " swaps." << endl;
    }

    return 0;
}
*/
 