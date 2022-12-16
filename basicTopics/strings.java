package basicTopics;

public class strings {
    public static void main(String[] args){

        char a[] = new char[5];
        a[0] = 'h';
        a[1] = 'f';
        a[2] = '2';
        System.out.println(a);

        String str = "surprise ";
        System.out.println(str.charAt(2));


        // char array is mutable String is not
        //in string pool constant even if we try to change it it just points to another one doesn't change
        //cancatination operators

        String mtr = "papu";
        mtr += "pajer";
        System.out.println(mtr);

        // methods for basicTopics.strings

        int n = str.length();
        System.out.println(n);

        char chp[] = str.toCharArray();
        System.out.println(chp);

        char cho[] ="papupajer".toCharArray(); // can use the string instead of the name
        System.out.println(cho);

        String mn = "trinay";
        String nm = "trinay";
        String mm = new String("trinay");

        // in string == compares references not values ...... returns true or false

        System.out.println(mn == nm); // pointing to the same reference of trinay
        System.out.println(nm == mm); // mm made a new trinay so mm and nm are pointing to different references

        // in order to compare values we can use .equals() method ..... returns true or false

        System.out.println(nm.equals(mn));
        System.out.println(nm.equals(mm));

        // in order to compare values we can use .equalsIgnoreCase() ignores case senstivity

        String g = "PoP";
        String h = "pOp";

        System.out.println(g.equalsIgnoreCase(h));

        // another method to compare is .compareTo() this checks lexiographycally
        // simillarly is another mehthod named . compareToIgnoreCase()
        // returns greater or smaller or zero int value

        String x = "ABC";
        String y = "XYZ";

        System.out.println(x.compareTo(y)); // checks and give ascii differences just like in dictionary

        // method to find index of any element in string .indexOf()

        System.out.println(x.indexOf("C")); // prints -1 if value not present

        //to replace all the elemnts with a new element or smthn like that .replace(arguments)
        // basicTopics.strings still not mutable just makes a new reference and points to that

        x = x.replace("A", "B");
        System.out.println(x);

        // toLowerCase() and toUpperCase() makes all characters lower and upper case respectively

        String s = "123";
        char chq = s.charAt(1);
        int j = 0;
        j = chq;
        System.out.println(chq);
        System.out.println(j); // prinitng the ascii value of the character
        // if we want the number itself then subtract '0' it'll minus 48 ascii value and provide the desired output

        j = chq - '0';
        System.out.println(j);













    }
}
