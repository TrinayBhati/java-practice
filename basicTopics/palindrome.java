package basicTopics;

public class palindrome {
    public static void main(String[] args) {

        String str = "madam";
        int n = str.length();

        int s = 0;
        int e = n-1;

        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                break;
            }
            s++;
            e--;
        }
        if(s>=e){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}

