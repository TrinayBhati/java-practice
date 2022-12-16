package classObjects;
/* Polymorphism : representing something in different forms
        1. Static - handled at the compile time
            example of static polymorphism - overloading 1. method
                                                         2. constructor
        2. Dynaimc - happens at the runtime
             example is overriding - methods
             use object of parent class and reference of child class


*/

/*  class Arena{

    //square
    int calcArea(int side){
        return side * side;
    }

    //rectangle
    int calcArea(int length, int breadth){
        return length * breadth;
    }

    //circle
    float calcArea(float radius){
        return (float)(Math.PI * radius);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Arena a = new Arena();
        System.out.println(a.calcArea(4, 6));
    }
    }
 */


class Vehicle{
    void brake(){
        System.out.println("brakes aplied");
    }
}

class Bike extends Vehicle{
    void brake(){
        System.out.println("disc brakes applied");
    }
}
class Aeroplane extends Vehicle{
    void brake(){
        System.out.println("hydraulic brakes applied");
    }
}

public class  polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.brake();
        Bike b = new Bike();
        b.brake();
        Aeroplane a = new Aeroplane();
        a.brake();
        Vehicle v1 = new Aeroplane();
        Vehicle v2 = new Bike();
        v1.brake();
        v2.brake();


    }

}
