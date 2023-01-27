// Start with the middle element of the array/list.
// If the middle element is the element you're looking for, you're done.
// If the middle element is greater than the element you're looking for, repeat the search on the left half of the array/list.
// If the middle element is less than the element you're looking for, repeat the search on the right half of the array/list.
// Repeat steps 1-4 until you find the element or the search interval is empty.

package searching;

public class binarySearch {

    public static void main(String[] args) {

       // prequisite for binary search is that array have to be sorted
       // l = first elemt meaning left most part, r= last element meaning right most part
       // middle element = (l+r)/2
       // middle element = l + (r-l)/2

        int array[] = {10,12,40,57,90,109,200};
        int n = array.length;

        int x = 200;

        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(array[mid] == x){
                System.out.println(mid);
                break;
            }
            else if(x<array[mid]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        if(l>r){
            System.out.println("element not found");
        }
    }
}

//===================================================================

import java.util.*;
class HelloWorld {
    public static boolean isSorted(int arr[]){
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
            return true;      
    }
    public static int binarySearch(int arr[] , int x){
        int f = 0;
        int l = arr.length-1;
        while( f<=l){
            int mid = f + (l-f)/2;
            if(x == arr[mid]){
                return mid;
            }
            else if(x>arr[mid]){
                f = mid +1;
            }
            else{
                l = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8, 12, 19, 22, 45, 987, 5765};
        int x = 11;
        System.out.println(binarySearch(arr, x));
    }

}