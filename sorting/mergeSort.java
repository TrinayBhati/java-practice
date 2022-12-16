//package sorting;
//
//public class mergeSort {
//
//    public static void merge(int arr[] , int f, int mid , int e){
//        int merged[] = new int[e - f + 1];
//
//        int a1 = f;
//        int a2 = mid + 1;
//        int a = 0;
//        while(a1 <= mid && a2 <= e){
//            if(arr[a1] <= arr[a2]){
//                merged[a] = arr[a1];
//                a++ ; a1++;
//            }
//            else{
//                merged[a] = arr[a2];
//                a++ ; a2++;
//            }
//        }
//        while(a1 <= mid){
//            merged[a] = arr[a1];
//            a++ ; a1++;
//        }
//        while(a2 <= e){
//            merged[a] = arr[a2];
//            a++ ; a2++;
//        }
//        for(int i = 0 , j = f ; i<merged.length ; i++ , j++){
//                arr[j] = merged[i];
//        }
//    }
//    public static void divide(int arr[] ,  int f , int e){
//        if(f<e){
//            int mid = f + (e-f) / 2;
//            divide(arr , f , mid  );
//            divide(arr , mid + 1 , e );
//            merge(arr, f , mid , e);
//        }
//    }
//    public static void main(String[] args) {
//      int arr[] = { 12, 11, 13, 5, 6, 7};
//      int n = arr.length;
//
//      divide(arr ,0 , n-1 );
//
//      for(int i = 0 ; i <n ; i++){
//          System.out.println(arr[i] + " ");
//      }
//        System.out.println();
//
//
//
//
//
//    }
//
//}
