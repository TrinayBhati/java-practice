package sorting;

public class bubbleSort {
    public static void main(String[] args){
        // compare 2 values and put the smaller one ahead n move the next after
        // we compare 2 values and keep moving larger values to the end
        int a[] = {3,2,1,7,5};
        int n = a.length;
        
        for(int i = 0; i<n-1 ; i++){
            for(int j=0; j<n-i-1 ; j++ ){
                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    }
            }
        }

        for(int i = 0; i<n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}







