package basicTopics;

public class subArrays {
    public static void main(String[] args) {
        // part of array contiunous and same order
        //  -3, 4,-2 , 7, 0, 1
        // subarray would be -3 4 -2 or 4 -2 7 0  or 0 1 or 7 0 1 or 1 or -3 
        //have to be in same order
        // every single element can be a subarray
        
        int arr[] = {-3,4,-2,7,0,1};
        int n = arr.length;
        for(int i =0; i<n ; i++){
            for(int j = i; j<n ; j++){
                for (int k = i;k<=j ; k++ ) {
                    System.out.println(arr[k] + " ");
                }
            }
        }

    }
}
