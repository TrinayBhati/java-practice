//package practice;
//
//import java.util.Scanner;
//
//public class BinarySearchPractice {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array : ");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        System.out.println("enter the elements of the array : ");
//        for (int i = 0; i<n ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("enter the number to be found : ");
//        int x = sc.nextInt();
//
//        int s = 0;
//        int e = n-1;
//
//        while(s<=e){
//            int mid = s+(e-s)/2;
//
//            if(x == arr[mid]){
//                System.out.println("element found at : " + mid );
//                break;
//            }
//            else if(x < arr[mid]){
//                e = mid - 1;
//            }
//            else{
//                s = mid + 1;
//            }
//        }
//        if(s>e){
//            System.out.println("element not found");
//        }
//
//
//    }
//}   1 december 2022
//
