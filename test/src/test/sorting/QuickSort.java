package test.sorting;


  public class QuickSort {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  int arr[]= {1,4,3,5,2,3,5,9};
  
  QuickSortLogic quickSortLogic=new QuickSortLogic();
  quickSortLogic.sortData(arr,0,arr.length-1);
  System.out.println("sorted array");
  int n = arr.length; 
  for (int i=0; i<n; ++i) 
	  System.out.print(arr[i]+" ");
     System.out.println();
  
  }
  
  }
  
  
  class QuickSortLogic {
  
  QuickSortLogic(){
  
  }
  
  public void sortData(int[] arr, int low, int high) { 
	  
	  if(low<high)
	  {
		  int part=partition(arr,low,high);
		  sortData(arr,low,part-1);
		  sortData(arr,part+1,high);
  
	  } 
  }
  
  
  private int partition(int[] arr, int low, int high) { 
	  // TODO Auto-generatedmethod stub
  
  int pivot = arr[high];
  
  int i = (low-1);
  // index of smaller element 
  for (int j=low; j<high; j++) {
	  
	  // If current element is smaller than or equal to pivot
	  
	  if (arr[j] <= pivot) {
		  i++;
  
  // swap arr[i] and arr[j] 
		  
	  int temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
  } 
  }
  
  // swap arr[i+1] and arr[high] (or pivot)
    
  int temp = arr[i+1];
  arr[i+1] =arr[high]; 
  arr[high] = temp;
  return i+1; 
  
 







/*
public class QuickSort {
	
	 public static void main(String a[]){
         
	        QuickSort sorter = new QuickSort();
	        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	        sorter.sort(input);
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
    
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            *//**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             *//*
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     */
  }
}