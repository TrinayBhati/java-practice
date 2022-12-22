// package practice;

// import java.util.Scanner;

// public class MergeSortingPractice {

//     public static void merge(int arr[] , int s, int mid , int e){


//     }
//     public static void divide(int arr[] , int s , int e){
//         int mid = s + (e - s)/2;

//         if(s<e){
//             divide(arr , s , mid);
//             divide(arr , mid +1 , e);
//             merge(arr , s , mid , e);
//         }

//     }
//     public static void main(String[] args) {

//         System.out.println("enter the size of unsorted array : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("enter the elements of array : ");
//         for(int i = 0; i<n ; i++){
//             arr[i] = sc.nextInt();
//         }
//         divide(arr,  0 , n-1);


//     }
// }
