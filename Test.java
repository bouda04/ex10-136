import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr ={5, -2, 17, 4, 0, 100, 7};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] data)
	{
		int iMin;
		for(int i = 0; i < data.length - 1; i++)
		{
			iMin= findMinIndex(data, i);
			swap(data, i, iMin);
		}
	} 
	
	private static void swap(int[]data, int i, int j) {
		int temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}
	
	private static int findMinIndex(int[]data, int from) {
		int iMin= from;
		for(int j = from + 1; j < data.length; j++)
			if(data[j] < data[iMin])
				iMin = j;
		
		return iMin;
	}

}
