package sorting;

public class insertionSort {

    public static void main(String[] args){

/*
        int a[] = {12,13,14,15,18,20,1};
        int n = a.length;
        int key = a[n-1];
        int i = 0;

        for(i = n-2 ; i>=0 ; i--){
            if(a[i] >= key){
                a[i+1] = a[i];
            }
            else{
                a[i+1] = key;
                break;
            }
        }

        if(i<0){
            a[0] = key;
        }

        for(int j = 0; j<n ;j++){
        System.out.print(a[j] + " ");

    }
*/



        int a[] = {7,8,9,2,2};
        int n = a.length;

        for(int i = 1; i<n ; i++){
            int key = a[i];

            int j = (i-1);
            for(; j>=0; j--){
                if(a[j] >= key){
                    a[j+1] = a[j];
                }
                else{
                    a[j+1] = key;
                    break;
                }
            }
            if(j<0){
                a[0] = key;
            }


        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}


class Sort{
    public static void sorting(int arr[]) {
        for(int i = 1; i<arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }    
    }
}