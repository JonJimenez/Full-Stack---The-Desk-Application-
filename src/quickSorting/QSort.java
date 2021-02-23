package quickSorting;

public class QSort {
	public void sort(int arr[],int first,int last) {
		if(first<last) {
			int partIndex = partition(arr,first,last);
			sort(arr,first,partIndex-1);
			sort(arr,partIndex+1,last);
		}
	}
	public int partition(int[] arr,int first,int last) {
		int pivot = arr[last];
	    int i = (first-1);

	    for (int j = first; j < last; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[last];
	    arr[last] = swapTemp;

	    return i+1;
		
	}
}
