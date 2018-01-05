public class Solution{
	public static void main(String args[]){
		int[] arr = new int[]{2, 3, 4, 5, 5, 1, -7, 8};
		int index = partition(arr);
		System.out.println("Missing value: " + missing(arr, index));
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
	
	public static int partition(int arr[]){
		int j = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <= 0){
				int temp = arr[i];
				arr[i] = arr[j];
				j++;
			}
		}
		return j;
	}
	
	public static int missing(int arr[], int index){
		for(int i = 0; i < arr.length - index; i++){
			if(Math.abs(arr[i]) -1 < (arr.length - index) && arr[Math.abs(arr[i]) - 1] > 0){
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
		}
		for(int i = 0; i < arr.length - index; i++){
			if(arr[i] > 0){
				return i+1;
			}
		}
		return arr.length - index;
	}
}