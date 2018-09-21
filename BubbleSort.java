public class BubbleSort implements SortingAlgorithm{

	public void sort(int[] a){
		for(int j = 0; j < a.length - 1; j++){
			for(int i = 0; i< a.length -1 -j; i++){
				if(a[i] > a[i+1])
					swap(i, i+1,a);
			}
		}
	}
	public void swap(int a, int b, int[] arr){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}