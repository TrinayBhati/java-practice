//package basicTopics;
//
//public class recursion {
//
//
///*
//          // basic notation of how calling methods functions works
//
//    static void message(){
//        System.out.println("hello all");
//    }
//    static void happy(){
//        System.out.println("happy ");
//    }
//    static void welcome(String str){
//        message();
//        System.out.println(str);
//        happy();
//    }
//
//    public static void main(String[] args) {
//
//        welcome("wassup");
//        }
//*/
//
//
///*
//    static void fun() {
//        System.out.println("fun");
//        fun();
//        // calling a funtion inside itself is called basicTopics.recursion
//        // calling a function inside its own definition
//        // calling a method inside own definition basicTopics.recursion
//    }
//
//    public static void main(String[] args){
//
//        fun();
//
//
//    }
//*/
//
///*
//
//    // basicTopics.recursion
//    //needs to have a base condition to avoid stack overflow running infinite times
//    // needs return statement
//    // after return statement it goes back to the last called function n execute the lines if any
//    static void fun(int n){
//        if(n==8){
//            return;
//        }
//        System.out.println(n);
//        n++;
//        fun(n);
//        System.out.println("yoho");
//    }
//
//    public static void main(String[] args){
//        fun(0);
//
//        // any problem can be done by interation method that is loops or basicTopics.recursion
//        // time complexity is same in loops n basicTopics.recursion
//        // basicTopics.recursion is costly memory wise, uses more memory bc it uses more call stacks
//
//
//
//
//    }
//*/
//
///*
//
//    // printing number in reverse order using basicTopics.recursion
//
//    static void math(int i , int n ){
//        if(i==n){
//           return;
//        }
//        System.out.println(i);
//        i++;
//        math(i,n); // to increment in this particular statement we can use pre increment can't use post increment in here
//        // math(++i,n); or use i+1
//    }
//
//    public static void main(String[] args){
//        int n = 10 ;
//        math(1,n);
//
//
//    }
//*/
//
//
//
///*
//   static void rev(int m, int n){
//
//        if( m==n){
//           return;
//           }
//           m++;
//        //just by calling the print statement after the calling of function again we can make it print in reverse
//       //so now the print isn't happening like it was before
//       //now the printing is done after making all the function stacks then printing is done
//        rev(m,n);
//        System.out.println(m);
//}
//
//    public static void main(String[] args){
//
//       rev(0,5);
//
//    }
//*/
//
//
//
//
//    static int sum(int m , int n ){
//        if(m>n){
//            return 0;
//        }
//        return m + sum(m+1,n);
//
//
//    }
//
//    public static void main(String[] args){
//        int n = 3;
//        System.out.println(sum(1,n));
//
//    }
//
//
//
//
//
//    // multiply by basicTopics.recursion without using multiplication sign, using repetetive addition
//    static int  Multiply_by_recursion(int M, int N)
//    {
//        if(N==0){
//            return 0;
//        }
//        return M + Multiply_by_recursion(M, N-1);
//
//
//    }
//    public static void main(String[] args){
//        System.out.println( Multiply_by_recursion(2,3));
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//}
//
