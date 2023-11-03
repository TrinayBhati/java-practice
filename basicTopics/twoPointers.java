package basicTopics;

//Merge Array (assignment question)
//two pointers concept
// just an approach to solve certain problems using two variables to reduce time complexity


public class twoPointers {
    public static void main(String[] args) {

        int a[] = {1, 4, 7, 20, 30};
        int n = a.length;

        int b[] = {1, 3, 3, 9};
        int m = b.length;

        int i=0;
        int j=0;
        int k=0;

        int c[] = new int[n+m];

        while(i<n && j<m){
            if(a[i] == b[j]){
                c[k] = a[i]; i++; k++;
                c[k] = b[j]; j++; k++;
            }
            else if(a[i] < b[j]){
                c[k] = a[i]; i++; k++;
            }
            else{
                c[k] = b[j]; j++; k++;
            }
        }
        while(i<n){
            c[k++] = a[i++]; //we can write a[i]; i++ as a[i++] also
        }
        while(j<m){
            c[k++] = b[j++];
        }
        for(k=0; k<n+m; k++){
            System.out.print(c[k] + " ");
        }


    }
}

//===================================================================================

// The two pointers approach is a technique used to solve problems that involve arrays. The basic idea behind this approach is to use two pointers to traverse the array, one pointer starting at the beginning of the array and the other pointer starting at the end of the array. The two pointers move towards each other, depending on the conditions of the problem, until they meet in the middle or a specific condition is met.

// Here's an example of using the two pointers approach to solve a problem:


// Given an array of integers, find the pair of indices whose elements have the smallest difference.


// int[] arr = {4, 2, 1, 8, 3, 9};
// int minDiff = Integer.MAX_VALUE;
// int left = 0, right = arr.length - 1;
// int leftIndex = 0, rightIndex = 0;

// Arrays.sort(arr);
// while (left < right) {
//     int diff = arr[right] - arr[left];
//     if (diff < minDiff) {
//         minDiff = diff;
//         leftIndex = left;
//         rightIndex = right;
//     }
//     if (arr[left] < arr[right]) {
//         left++;
//     } else {
//         right--;
//     }
// }

// System.out.println("The pair of indices whose elements have the smallest difference are: " + leftIndex + " and " + rightIndex);
// In the above example, we first sort the array to make it easy to compare the values. Then, we use two pointers, left and right, to traverse the array. We initialize left pointer to the first element of the array and right pointer to the last element of the array. In each iteration, we calculate the difference between the values at the left and right pointers. If the difference is less than the current minimum difference, we update the minimum difference and the indices. Then, we check which value is smaller, the one at the left pointer or the one at the right pointer. If the value at the left pointer is smaller, we increment the left pointer, otherwise, we decrement the right pointer. We continue this process until the left pointer is greater than or equal to the right pointer.

// Two pointers approach is very efficient in solving problems that involve arrays, especially when the array is sorted.It can be used to solve problems like two sum, three sum, closest pair of elements, finding duplicate elements and many more.It can also be used to solve problems in which you have to find the first or last occurrence of an element in an array.

// It's important to note that the solution of the problem may be different depending on the direction of traversing the array, if you start from left pointer or right pointer.

// In general, the two pointers approach can be a good choice when you need to traverse an array in a specific order, and when you can use the order of the elements in the array to your advantage.