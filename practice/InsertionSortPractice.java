//package practice;
//
//import java.util.Scanner;
//
//public class InsertionSort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array : ");
//        int n = sc.nextInt();
//
//        System.out.println("enter the elements of unsorted array : ");
//        int arr[] = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 1; i<n ; i++){
//            int key = arr[i];
//
//            int j = (i-1);
//            for(; j>=0  ; j--){
//                if(arr[j] >= key){
//                    arr[j+1] = arr[j];
//                }
//                else{
//                    arr[j+1] = key;
//                    break;
//                }
//            }
//            if(j<0){
//                arr[0] = key;
//            }
//        }
//        System.out.println("sorted array is : ");
//        for(int i = 0 ; i<n ; i++){
//            System.out.print(arr[i]);
//        }
//
//
//    }
//}    2 december 2022
