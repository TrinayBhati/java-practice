package classObjects;
/*  abstraction - very minimal not described or not defined
    what it does
    do not know how it does
    hiding the implimentation and providing the functionality to the user

    how to use abstraction
    1. using abstract classes - to declare abstract methods - who does not have any definition
                                                              needs to be defined in inherited class or object
          able to achieve 0 to 100%  of abstraction
    2. using interfaces - all methods are by default abstract
                            instead of using extends to call the class we use implement for interfaces
                            we have only abstract methods i n interfaces unlike classes
                            all methods are by default abstract and public
                            by default all the variables in interfaces are final
                        class can implement amny interfaces but can only extend to a single class

            class can extend only one class but class can implement many interfaces and while doing so can also extend a class as well
                        interface to interface --- extends
                        class to class ---- extends
                        interface to class ---- extends


*/

class Gadi {
    void horn(){
        System.out.println("poppadom");
    }
    void brakes(){};

}
interface anime{

    String msg = "One Piece is real";
    void op(); // no need to define no need to add any abstract keyword
    void naruto();
}
interface mom{
    void cook();
    void teach();
}
interface dad{
    void beat();
    void drive();
}

class Child implements mom , dad{
    @Override
    public void drive() {

    }

    @Override
    public void beat() {

    }

    @Override
    public void cook() {

    }

    @Override
    public void teach() {

    }
}

class big3 implements anime{

    @Override
    public void op() {
        System.out.println("best of big 3");

    }

    @Override
    public void naruto() {
        System.out.println("second best of big3");

    }
}
class Bikee{

}

public class abstraction {
    public static void main(String[] args) {
            anime a = new anime() {
                @Override
                public void op() {

                }

                @Override
                public void naruto() {

                }
            };

        System.out.println(a.msg);


    }
}
