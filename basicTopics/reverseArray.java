package basicTopics;

public class reverseArray {
    public static void reverse(int num[]){
        int f = 0 ;
        int e = num.length - 1;
        while(f < e){
            int temp = num[e];
            num[e] = num[f];
            num[f] = temp;

            f++;
            e--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2,5,6,8,19,3};

        reverse(number);
        for(int i = 0 ; i <number.length; i++){
            System.out.print(number[i] + " ");
        }
    }



}
