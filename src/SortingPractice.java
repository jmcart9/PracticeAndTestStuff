import java.util.Random;

public class SortingPractice {
	
	public SortingPractice() {
	}
	
	public void printArray(int array[]){
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public void printArray(String array[]){
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public int[] quicksort(int array[], int lo, int hi){
		if (lo < hi){
			int p = partition(array, lo, hi);
			quicksort(array, lo, p-1);
			quicksort(array, p+1, hi);
		}
		return array;
	}
	
	public String[] quicksort(String array[]){
		return array;
	}
	
	public int partition(int array[], int loPosition, int hiPosition){
		int pivot = array[hiPosition];
		int i = loPosition;
		for (int j=loPosition; j < hiPosition; j++){
			if (array[j] <= pivot){
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i = i+1;
			}
		}
		int temp = array[i];
		array[i]=array[hiPosition];
		array[hiPosition] = temp;
		return i;
	}
	
	public void sortStringOnPlace(String s){
		
	}
	
	/*The shuffler. 
	 * shuffles an array
	Random rn = new Random();
	int temp=0;
	for (int i=0; i < array.length; i++){
		
		int j = rn.nextInt(array.length);
		
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	*/

	public static void main(String[] args) {
		SortingPractice x = new SortingPractice();
		int test[] = {9, 8, 7, 6, 5, 87, 3, 44, 2, 1, 753};
		
		int a [] = x.quicksort(test, 0, test.length-1);
		x.printArray(a);
	}

}
