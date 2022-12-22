//package practice;
//
//import java.util.Scanner;
//
//public class BubbleSort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array : ");
//        int n = sc.nextInt();
//
//        System.out.println("enter the elements of the unsorted array : ");
//        int arr[] = new int[n];
//        for(int i = 0 ; i<n ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i<n ; i++){
//            for(int j = 0 ; j<n - i -1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }
//        System.out.println("sorted array is ");
//        for(int i = 0; i<n ; i++){
//            System.out.print( arr[i] + " " );
//        }
//
//
//    }
//
//} 1 december 2022
