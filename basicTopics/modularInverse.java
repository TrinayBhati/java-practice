package basicTopics;

public class modularInverse {
    public static void main(String[] args) {

        // if only a and m are coprime then only there exists modular inverse for a and m.
        // (a*b)%m = 1 this is the formula where m is the number
        // b is mod inverse of a by the formula
        //
        int a = 2;
        int b = -1; 
        int m = 5;

        for(int i=1; i<m; i++){
            if((a*i)%m ==1){
                b = i;
                break;
            }
        }
        System.out.println(b);

    }
}
