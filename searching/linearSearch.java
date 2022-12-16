package searching;

public class linearSearch {

 //   public static void main(String[] args) {


        /*
        // basic algo with hardcoded values

        int arr[] = {10,20,30,40,22,44,90};
        int n = arr.length;
        int x = 90;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] ==x){
                System.out.println(i);
            }
        }
*/
        // basic also with user input values

      /*    Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of array :");
        int n = sc.nextInt();
        System.out.println("enter the value you want to find :");
        int x = sc.nextInt();
        System.out.println("enter the array :");
        int array[] = new int[n];

        for(int i = 0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n ; i++){
            if(array[i] == x){
                System.out.println("element found at index : " + i) ;
            }
        }

*/
/*

        // algo using count variable to check weather element is present or not
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of array :");
        int n = sc.nextInt();
        System.out.println("enter the value you want to find :");
        int x = sc.nextInt();
        System.out.println("enter the array :");
        int array[] = new int[n];
        int count = 0 ;

        for(int i = 0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n ; i++){
            if(array[i] == x){
                System.out.println("element found at index : " + i) ;
                count++;
            }
        }
        if(count == 0){
            System.out.println("element not found");

*/


    /*    // if the element is present only once
        int a[] = {12,22,32,45,78,98,01};
        int x = 77777;
        int n = a.length;

        int i =0;
        for( i=0; i<n;i++){
            if(a[i] == x){
                System.out.println(i);
                break;
            }

        }
        if(i==n){
            System.out.println("element not found");
        }
*/

    public static int linearSearch(int num[], int key){

        for( int i = 0 ; i< num.length; i++){
            if(num[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4, 10,5,7,8,1,9,19};
        int numToFind = 10;
        int index = linearSearch(numbers, numToFind);

        if (index == -1){
            System.out.println("number not found");
        }
        else{
            System.out.println("number found at " + index);
        }

    }
}
