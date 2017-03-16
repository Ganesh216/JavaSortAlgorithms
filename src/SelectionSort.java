import java.util.Scanner;

public class SelectionSort {
	
	public void selectionSort(int[] ar, int n) {
		for(int i=0;i<n;i++){
			int Minindex = i;
				for(int j=i+1;j<n;j++){
					if(ar[j]<ar[Minindex]){	
						Minindex = j;
					}
				}
			int temp = ar[i];
			ar[i] = ar[Minindex];
			ar[Minindex] = temp;
		}
		for(int i=0;i<=n-1;i++){
			System.out.println("-->"+ar[i]);
		}
		
	}

	public static void main(String ar[]){
			
			SelectionSort selectionSort = new SelectionSort();
			System.out.println("Enter size of array :: ");
			Scanner scanner = new Scanner(System.in);
			int element = scanner.nextInt();
			//int array[] = {7,2,9,1,0,5};
			int array[] = new int[element];
			int length = array.length;
			System.out.println("Enter all the elements:");
				for(int i = 0 ; i < element ; i++){
					array[i] = scanner.nextInt();
				}
			selectionSort.selectionSort(array, 6);
		}

	
}
