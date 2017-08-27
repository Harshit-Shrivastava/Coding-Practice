public class SelectionSort{
  public static void main(String args[]){
    int arr[] = {12, 11, 13, 5, 6};
    SelectionSort objSelectionSort = new SelectionSort();
    objSelectionSort.sort(arr);
    printArr(arr);
  }

  static void printArr(int arr[]){
    System.out.println();
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  void sort(int arr[]){
    int n = arr.length;
    for(int i = 0; i < n-1; i++){
      int min = i;
      for(int j = i+1; j < n; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
}
