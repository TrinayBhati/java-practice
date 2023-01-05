package practiceScalerCourse;

public class sorting {

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1 ; i++){
            int minVal = arr[i];
            int minInd = i;
            for(int j = i+1; j<n ; j++){
                if(arr[j]<minVal){
                    minVal = arr[j];
                    minInd = j;
                }
            }

            int temp =  arr[i];
            arr[i] = arr[minInd];
            arr[minInd] =temp;
        }
        for(int val : arr){
            System.out.print(val);  
        }
    }

    public static void main(String[] args) {
        
        //selection sort
        int a[] = {2,3,1,5,8,9,4,10};
        selectionSort(a);

    }
    
}
