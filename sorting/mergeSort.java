package sorting;

public class mergeSort {

   public static void merge(int arr[] , int f, int mid , int e){
       int merged[] = new int[e - f + 1];

       int a1 = f;
       int a2 = mid + 1;
       int a = 0;
       while(a1 <= mid && a2 <= e){
           if(arr[a1] <= arr[a2]){
               merged[a] = arr[a1];
               a++ ; a1++;
           }
           else{
               merged[a] = arr[a2];
               a++ ; a2++;
           }
       }
       while(a1 <= mid){
           merged[a] = arr[a1];
           a++ ; a1++;
       }
       while(a2 <= e){
           merged[a] = arr[a2];
           a++ ; a2++;
       }
       for(int i = 0 , j = f ; i<merged.length ; i++ , j++){
               arr[j] = merged[i];
       }
   }
   public static void divide(int arr[] ,  int f , int e){
       if(f<e){
           int mid = f + (e-f) / 2;
           divide(arr , f , mid  );
           divide(arr , mid + 1 , e );
           merge(arr, f , mid , e);
       }
   }
   public static void main(String[] args) {
     int arr[] = { 12, 11, 13, 5, 6, 7};
     int n = arr.length;

     divide(arr ,0 , n-1 );

     for(int i = 0 ; i <n ; i++){
         System.out.println(arr[i] + " ");
     }
       System.out.println();
   }

}

//=============================================================================

// The main method starts by creating an array of integers arr: int arr[] = { 12, 11, 13, 5, 6, 7}; and initializing a variable n with the length of the array.

// The divide method is called with the input array, arr, and the starting and ending indices of the array, 0 and n-1 respectively: divide(arr ,0 , n-1 );

// Inside the divide method, the first thing it does is check the base case: if the starting index is greater than the ending index, then the portion of the array is already sorted and the method returns.

// If the starting index is less than the ending index, it calculates the middle index mid by adding the starting and ending indices and dividing by 2: int mid = f + (e-f) / 2;

// Next, the divide method recursively calls itself for the left and right half of the array:
// divide(arr , f , mid );
// divide(arr , mid + 1 , e );

// Once both halves of the array have been divided and sorted, the merge method is called to merge the two sorted halves back together: merge(arr, f , mid , e);

// Inside the merge method, it creates a new temporary array merged with the same number of elements as the portion of the array to be merged. It then initializes two pointers, a1 and a2, to the f and mid + 1 indices of the portion of the array to be merged, respectively. And it initializes a which will be used as an index for the merged array.

// Then it enters a loop where it compares the elements at the a1 and a2 indices and adds the smaller of the two elements to the merged array at the a index.

// After the merge process is done, the elements in the merged array are copied back to the input array.

// The recursive call of divide method will continue until the base case is reached and each time when merge method is called it will merge two sorted halves of the array.

// Once the divide method has returned, the main method prints the sorted array to the console by iterating through the array and printing each element:

// for(int i = 0 ; i <n ; i++){
//          System.out.println(arr[i] + " ");
//      }
     
// And then the program ends.