package main;

import java.util.Scanner;

public class Java3004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rank = 0;
		
		int[] arr = new int[n];
		int[] ranking = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n; k++) {
				if(i == arr.length) break;
				if(arr[i] > arr[k]) rank++;
				
			}
			ranking[i] = rank;
			rank = 0;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(ranking[i]+" ");
		}
		
		//t.o c
	}

}
