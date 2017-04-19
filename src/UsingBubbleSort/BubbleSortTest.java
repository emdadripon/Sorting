package UsingBubbleSort;

public class BubbleSortTest {
	public static void main(String[] args){
		int[] array ={9,7,8,6,5,2,4,3,1};
		SampleBubbleSort SampleBubbleSort  = new SampleBubbleSort();
		SampleBubbleSort.bubblesort(array);
		
		System.out.println("Retriving Data");
		
		for(int j = 0; j<array.length; j++){
			System.out.println(array[j]);
		}
		
	}
	

}
