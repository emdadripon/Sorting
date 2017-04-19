package UsingBubbleSort;

public class SampleBubbleSort {
    public int[] bubblesort(int[] array){
    	int[] sortedArray = new int[array.length];
    	for(int i = (array.length-1); i>=0; i--){
    		for(int j = 1; j<=i; j++){
    			if(array[j-1]>array[j]){
    				int temp = array[j-1];
    				array[j-1] = array[j];
    				array[j] = temp;
    			}
    		}
    	}
    	return sortedArray;
    }
}
