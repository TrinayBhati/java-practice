// whenever sum is less than max then we set sum equals to zero

public static void main(String[] args) {
 	int arr[] = {3,,4,-2,7,0,1};
 	int n = arr.length;

 	int sum = 0; 
 	int max = Math.MIN_VALUE;

 	for(int i = 0; i<n ; i++){
 		sum += arr[i];
 		max = Math.max(max, sum);
        if(sum <0){
            sum =0;
        }
 	}
 	System.out.println(max);
 } 

 //====================================================================

 class Solution {
    //kadane algo as a function
    public int maxSubArray(int[] nums) {
        
        int sum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum =0;
            }
        }
        return maxSum;
    }   
}
