

import java.util.Scanner;

public class InsertionSort {

	void insertionSort(int ar[],int n){
		int hole ;
		int value ;
		for(int i = 1 ; i <= n-1 ; i++){
		  value = ar[i];
		  hole = i;
		  while(hole>0 && ar[hole-1] > value){
			  ar[hole] = ar[hole-1];
			  hole = hole-1;
		  }
		 ar[hole] = value;
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(" --> "+ar[i]);
		}
		
	}
	
	public static void main(String sr[]){
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("Enter size of array :: ");
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		int ar[] = new int[element];
		int length = ar.length;
		System.out.println("Enter all the elements:");
		for(int i = 0 ; i < element ; i++){
			ar[i] = scanner.nextInt();
		}
		insertionSort.insertionSort(ar, length);
	}
}
