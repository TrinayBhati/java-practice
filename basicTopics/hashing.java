package basicTopics;

import java.util.*;

public class hashing {
    public static void main(String[] args) {


        /* way to store data in form of <key, value> pair
        <character, String>
        we can have any datatype key and values

        to input hashmap we have to put key and value together

        hm.put('k',"king")

        have to use classes inside, hashing only works on classes

 */

/*
        HashMap<Character,String> myMap = new HashMap<>();
        // this is how we declare hashmap

        myMap.put('t', "trinay");
        myMap.put('p', "papu");
        myMap.put('s', "shourya");

        System.out.println(myMap.get('s'));
        myMap.put('s' ,"shaksham");
        System.out.println(myMap.get('s'));
        //ovewrites just like in arrays

        //enhanced for loops
        // for(int x : value to be pointed at){work can be done here}

        int arr[] = { 12,33,44};
        int n = arr.length;

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        String str[] = {"stfu" , "fufu"};
        int m = str.length;

        for(String y : str){
            System.out.print(y +" ");
        }


        // printing hashmaps

        for(Map.Entry<Character , String> x : myMap.entrySet()){
            System.out.println(x.getKey() + " " +x.getValue());

        }
        System.out.println();
        // map interfaces : hashMap || linkedHashMap || treeMap
        // hashMap randomly, linkedHashMap sames as inserted, treeMap sorted order based on keys

        TreeMap<Integer , String> urMap = new TreeMap<>();
        urMap.put(1,"yeye");
        urMap.put(4,"whoo");
        urMap.put(2,"wassup");

        for(Map.Entry<Integer, String> y : urMap.entrySet()){
            System.out.println(y.getKey() + " " + y.getValue());
        }

        LinkedHashMap<Integer , Character> noMap = new LinkedHashMap<>();
        noMap.put(1,'t');
        noMap.put(3,'y');
        noMap.put(2,'r');

        for(Map.Entry<Integer, Character> z : noMap.entrySet()){
            System.out.println(z.getKey() + " " + z.getValue());
        }

        System.out.println((myMap.containsKey('t')));
        System.out.println(myMap.containsValue("Trinay"));

*/

/*
        // frequency count

        int a[] = {1,7,2,7,7, 9, 2, 1};
        int n = a.length;
        HashMap<Integer,Integer> myMap = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            int key = a[i];
            if(myMap.containsKey(key) == false){
                myMap.put(key, 1);
            }
            else{
                int count = myMap.get(key);
                myMap.put(key,count +1);
            }

        }
        System.out.println(myMap);

        for(Map.Entry<Integer,Integer> x : myMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

*/

/*
        // Given a string s, find the first non-repeating character in the string and return its index. If it does not exist, return -1.
        // https://my.newtonschool.co/playground/code/2gcblf1zif01/
        String str = "newtonschool";
        int n = str.length();
        LinkedHashMap<Character,Integer> myMap =  new LinkedHashMap<>();
        char ans = '#';
        for(int i = 0; i<n ; i++) {
            char ch = str.charAt(i);
            if (myMap.containsKey(ch) == false) {
                myMap.put(ch, 1);
            } else {
                int count = myMap.get(ch);
                myMap.put(ch, count + 1);
            }
        }


            for(Map.Entry<Character,Integer> x : myMap.entrySet()){
                if(x.getValue()==1){
                    ans = x.getKey();
                    break;
                }
            }
            if(ans == '#'){
                System.out.println(-1);
            }
            else{
                for(int j = 0 ; j<n ; j++){
                    if(str.charAt(j) == ans){
                        System.out.println(j);
                        break;
                    }
                }
            }
*/

        //Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
        //https://my.newtonschool.co/playground/code/4i6pja45y5ed/

        int a[] = {7,1,1,2,3,2,2,2,3,7,7,7,7,7,4,4,4,4};
        int n = a.length;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i<n ; i++){
            int num = a[i];
            if(!freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
                int count  = freq.get(num);
                freq.put(num,count + 1);
            }
        }

        TreeMap<Integer, ArrayList<Integer>> freqRev = new TreeMap<>();
        for(Map.Entry<Integer,Integer> x : freq.entrySet()){
            int count = x.getValue();
            int num = x.getKey();

            if(!freqRev.containsKey(count)){
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(num);
                freqRev.put(count,nums);

            }

        }

        for(Map.Entry<Integer,ArrayList<Integer>> y :freqRev.entrySet() ){
             int count = y.getKey();
             ArrayList<Integer> nums =y.getValue();

             for(int i = nums.size() -1; i<=0 ;i++){

                 for(int j = 0 ; j<count ; j++) {
                     System.out.print(nums + " ");
                 }
             }

        }






        }


    }

