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
    public static void main(String[] args) {
        
        //remove vowels from a given string
        String str = "youcandoit";
        removeVowels(str);

        //reverse Vowels in given String
        
    }
    
    
}
