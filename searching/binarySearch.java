package searching;

public class binarySearch {

    public static void main(String[] args) {

       // prequisite for binary search is that array gotta be sorted
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
