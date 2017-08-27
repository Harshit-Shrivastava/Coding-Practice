public class BubbleSort{
  public static void main(String args[]){
    int arr[] = {12, 11, 13, 5, 6};
    BubbleSort objBubbleSort = new BubbleSort();
    objBubbleSort.sort(arr);
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
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}
