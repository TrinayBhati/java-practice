// package practice;

// import java.util.Scanner;

// public class TwoPointersPractice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the size of first array : ");
//         int n = sc.nextInt();
//         System.out.println("enter the size of second array : ");
//         int m = sc.nextInt();

//         int arr1[] = new int[n];
//         int arr2[] = new int[m];

//         System.out.println("enter the first array : ");
//         for(int i = 0 ; i<n ; i++){
//             arr1[i] = sc.nextInt();
//         }
//         System.out.println("enter the second array : ");
//         for(int i = 0 ; i<m ; i++){
//             arr2[i] = sc.nextInt();
//         }

//         int i = 0;
//         int j = 0;
//         int k = 0;
//         int arr[] = new int[m+n];

//         while(i<n && j<m){
//             if(arr1[i] == arr2[j]){
//                 arr[k] = arr1[i]; k++; i++;
//                 arr[k] = arr2[j]; k++; j++;
//             }
//             else if(arr1[i] < arr2[j]){
//                 arr[k] = arr1[i];
//                 k++; i++;
//             }
//             else{
//                 arr[k] = arr2[j];
//                 k++; j++;
//             }
//         }

//         while(i<n){
//             arr[k] = arr1[i];
//             k++; i++;
//         }
//         while(j<m){
//             arr[k] = arr2[j];
//             k++ ; j++;
//         }

//         System.out.println("merged array is : ");
//         for(k = 0; k<n+m ; k++){
//             System.out.print(arr[k]);
//         }

//     }
// }
