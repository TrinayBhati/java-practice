//package practice;
//import java.util.*;
//public class LinearSearch {
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the size of array : ");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        System.out.println("enter the elements of array : ");
//        for(int i = 0; i<n ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("enter the number to be find : ");
//        int x = sc.nextInt();
//
//        int num = 0;
//        int count = 0;
//        for(int i = 0; i<n ; i++){
//            if(arr[i] == x){
//                num = i;
//                count++;
//
//            }
//        }
//        if(count == 0){
//            System.out.println("number not present");
//        }
//        else {
//            System.out.println("number found at index : " + num);
//        }
//    }
//
//}   1 december 2022
