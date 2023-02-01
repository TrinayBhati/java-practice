package practiceScalerCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        // no need to specify the size of arraylist
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //add operation
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //add at index
        list.add(1,40);
        list.add(3,11);
        System.out.println(list);

        //get at index
        System.out.println(list.get(2));

        //set at index
        list.set(2,123);
        System.out.println(list.get(2));
 
        //remove
        list.remove(2);
        System.out.println(list);
        //removal from the end is really fast

        //size
        System.out.println(list.size());

        //calling the removeEven function
        RemoveEven(list);
        System.out.println(list);
        
    }
    
    //remove all even number given in Array
    public static void RemoveEven(ArrayList<Integer>list){
            
        for(int i = list.size() - 1; i>=0; i--){
            if(list.get(i)%2 == 0){
                list.remove(i);
            }
        }
    }
}
