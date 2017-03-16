import java.util.Scanner;

public class BubbleSort {

	void bubbleSort(int ar[],int n){
		
		for(int i=0;i<=n-1;i++){
			for(int j = i+1 ; j<=n-1;j++){
				if(ar[i]>ar[j]){
					int temp = ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
				}
			}
			
		}
		for(int i=0;i<=n-1;i++){
			System.out.println("-->"+ar[i]);
		}
	}
	public static void main(String ar[]){
		
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Enter size of array :: ");
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		int array[] = new int[element];
		int length = array.length;
		System.out.println("Enter all the elements:");
			for(int i = 0 ; i < element ; i++){
				array[i] = scanner.nextInt();
			}
		bubbleSort.bubbleSort(array, 6);
	}
}
