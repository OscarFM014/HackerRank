//!Problem
//https://codeforces.com/contest/405/problem/A

import java.util.Scanner;
public class GravityFlip {
    

    public static void quickSort(int[] boxes, int low, int high) {
		if (boxes == null || boxes.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = boxes[middle];
 
		int i = low, j = high;
		while (i <= j) {
			while (boxes[i] < pivot) {
				i++;
			}
			while (boxes[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = boxes[i];
				boxes[i] = boxes[j];
				boxes[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(boxes, low, j);
		if (high > i)
			quickSort(boxes, i, high);
	}
    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int colums = res.nextInt();
        int[] boxes = new int[colums];
        for (int i = 0; i < colums; i++){
            boxes[i] =  res.nextInt();
        }
        quickSort(boxes, 0, colums-1);
        
        for (int i = 0; i < colums; i++){
            if(i < colums - 1){
                System.out.print(boxes[i] + " ");
            }else{
                System.out.print(boxes[i]);
            }
        }
        
        res.close();
    }
}

//Oscar