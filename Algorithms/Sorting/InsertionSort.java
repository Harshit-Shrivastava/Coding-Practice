public class InsertionSort{

  public static void main(String args[]){
    int arr[] = {12, 11, 13, 5, 6};
    InsertionSort objInsertionSort = new InsertionSort();
    objInsertionSort.sort(arr);
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

    for(int i = 1; i < n; i++){
      int key = arr[i];
      int j = i-1;
      while(j >=0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }
}
