
public class MergeSort {

	 int[] mergeSort(int[] a){
		int Alength = a.length;
		int mid = Alength/2;
		if(Alength < 2){
			return a ;
		}
		
		int left[] = new int[mid];
		int right[] = new int[Alength-mid];
		
		for(int i=0;i<mid ;i++){
			left[i] = a[i];
		}
		
		for(int i=mid;i<Alength ;i++){
			right[i-mid] = a[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		return a;
	}
	 public void merge(int[] left, int[] right, int[] ar) {
		 int leftLen = left.length;
		 int rightLen = right.length;
		 int i=0,j=0,k = 0;
		 while(i<leftLen && j<rightLen){
			 if(left[i] <= right[j]){
				 ar[k] = left[i];
				 i++;k++;
			 }else {
				ar[k]= right[j];
				k++;j++;
			}
		 }
		 while(i<leftLen){
			 ar[k]=left[i];
			 i++;k++;
		 }
		 while(j<rightLen){
			 ar[k]=right[j];
			 j++;k++;
		 }
	}
	public static void main(String as[]){
		 int ar[] ={9,5,8,3,4,9,002};
		 MergeSort mergeSort = new MergeSort();
		 int sortedArray[] = mergeSort.mergeSort(ar);
		 for(int i=0;i<=sortedArray.length-1;i++){
				System.out.println("-->"+sortedArray[i]);
			}
		
	 }
}
