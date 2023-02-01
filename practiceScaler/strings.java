package practiceScalerCourse;

public class strings {
    
    public static void removeVowels(String str){

        for(int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e'|| ch =='i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }
    }

    public static void reverseVowels(String str){
        char[] ch = str.toCharArray();

        int i = 0; 
        int j = ch.length - 1;
        while(i<j){
            while(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != '0' && ch[i] != 'u'){
                i++;
            }
            while(ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != '0' && ch[j] != 'u'){
                j--;
            }
            if(i>=j){
                break;
            }
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
            
        }
        for(char c:ch){ //this is how we take every element from array
                System.out.print(c);
            };

    }

    public static void toLowerCase(String str){
        char[] ch =  str.toCharArray();
        for(int i = 0; i<ch.length; i++){
            char s = ch[i];
            if(s>='A' && s<='Z'){
                char ans = (char)(s - 'A' +'a');
                ch[i] = ans;
            } 
        }
        for(char c:ch ){
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        
        //remove vowels from a given string
        String str = "youcandoit";
        removeVowels(str);
        System.out.println();

        //reverse Vowels in given String
        String str1 = "youcandoit";
        reverseVowels(str1);
        System.out.println();
        
        //convert upper case to lower case
        String str2 = "yoU cAn dO It";
        toLowerCase(str2);

        
    }
    
    
}
