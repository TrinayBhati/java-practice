package practiceScalerCourse;

import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {

 //===============================================================
        //basics

        // int arr[] = {2, 3, 5, 7, 8, 566, 765};
        // System.out.println(arr[2]);

        // int a[] = new int[4];
        // System.out.println(a[2]);

        // arr[2] = 30;
        // System.out.println(arr[2]);

        // System.out.println(arr.length);

        // for(int i = 0; i<arr.length ; i++){
        //     //array traversal
        // }

//===============================================================        

        // sum of array

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // for(int i =0; i<n ;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int sum = 0; 
        // for(int i = 0 ; i<n; i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);


        //maximum of array

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int arr[] = new int[n];
        // for(int i = 0 ; i< n ; i++){
        //     arr[i] = sc.nextInt();
        //  }

        //  int max = Integer.MIN_VALUE;
        //  for(int i = 0 ; i< n ; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        //     System.out.println(max);
            
        //  }

//===============================================================        

        // reverse an array

        //  Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();

        //  int arr[] = new int[n];
        //  for(int i = 0 ; i<n ; i++){
        //     arr[i] = sc.nextInt();
        //  }

        //  int i = 0; 
        //  int j = n-1;

        //  while(i<j){
        //     int temp = arr[i];
        //     arr[i] =   arr[j];
        //     arr[j] = temp;

        //     i++;
        //     j--;
        //  }
        //  for(int k = 0 ; k<n; k++){
        //     System.out.println(arr[k] + " ");
        //  }

//===============================================================        
        

            // subarray of an array

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();

            // int arr[] = new int[n];
            // for(int i = 0 ; i<n ; i++){
            //     arr[i] = sc.nextInt();
            // }

            // for(int s =0; s<n ; s++){
            //     for(int e = s; e<n ; e++){
                    
            //         for(int k = s ; k <e; k++){
            //             System.out.print(arr[k] + " ");
            //         }
            //         System.out.println();
            //     }
            // }

//===============================================================        
                
            // 2d array basics

            // int arr[][] = new int[5][6];

            // arr[1][3] = 10;

            // System.out.println(arr[1][3]);    
            // System.out.println(arr[2][5]);    

            // // row count
            // System.out.println(arr.length);
             
            // //column count
            // System.out.println(arr[0].length);
                
            // //traversal
            // for(int i = 0 ; i<arr.length ; i++){
            //     for(int j = 0 ; j <arr[0].length ; j++){
                    
            //     }
            // }

//===============================================================        

            //transpose of matrix
             
            // Scanner sc = new Scanner(System.in);
            // int m = sc.nextInt();
            // int n = sc.nextInt();

            // int arr[][] = new int[m][n];
            // for(int i = 0 ; i< m ; i++){
            //     for(int j = 0 ; j<n; j++){
            //         arr[i][j] = sc.nextInt();
            //     }
            // }
                
            //     //traversing on lower triangle
            // for(int i = 0 ; i<m ; i++){
            //     for(int j = 0; j<i ;j++){
            //         int temp = arr[i][j];
            //         arr[i][j] = arr[j][i] ;
            //         arr[j][i] = temp;
            //     }
            // }    
            // for(int i = 0 ; i<m ; i++){
            //     for(int j = 0 ; j<n ; j++){
            //         System.out.print(arr[i][j] + " ");
            //     }
            //     System.out.println();
            
                
            // }

//===============================================================        

            // // rotate 2d array clockwise 90 degree
            // // transpose the matrix then reverse row wise
            // Scanner sc = new Scanner(System.in);
            // int m = sc.nextInt();
            // int n = sc.nextInt();

            // int arr[][] = new int[m][n];
            // for(int i = 0 ; i<m; i++){
            //     for(int j = 0; j<n ; j++){
            //         arr[i][j] = sc.nextInt();
            //     }
            // }
            
            // for(int i = 0 ; i< m ; i++){
            //     for(int j =0; j<i ; j++){
            //         int temp = arr[i][j];
            //         arr[i][j] = arr[j][i];
            //         arr[j][i] = temp;
            //     }
            // }
            // // only thing left now is to reverse each row in the 2d array
            // // that idk how to do 
            

    }
}