package classObjects;
/*
   creating new classes from the existing ones
   1. usecase is the reusability
   2. inheritence establishes an is A relationship

   we have base class also known as paretn class or super class
   this is a class from which new class is created or derrived

   second class called derrived class also known as child class or sub class
   this is a newly created class or derrived one

   to make use of inheritence we gotta use the keyword extends

   class BaseClass{
   features
   }
   class DerrivedClass extends Baseclass{
   all the features of baseclass will be here and it'll have it's new features as well
   }

   1. Single level inheritence : the above is an example of single level inheritence
   2. Multi level inheritence : A derrived class becomes base for another class
       like animal is base for dog
                      dog can be base for puppy
   3. Heirerichal inheritence: many subclasses are formed from a single class
        like a single animal class but it can have many child class like dog and cat

   child class can have properties of parent class but no t the other way around
   4. Multiple inheritence : when one class is derrived from many classes
         like base 1 is a base class and base 2 is a base class
         child is derrived from base 1 and base 2
         child can use the features of both base 1 and 2 but when a function of same name
                is called in both the parent classes the compiler gets confused and this scenario
                        is called ambiguity, in java multiple inheritence is not allowed
  5. Hybrid inheritence : Combination of different inheritences




    */

    class Animal{
        int legs;
        void eat(){
            System.out.println("eating");
        }

    }
class Dog extends Animal{
    int tail;
    void bark(){
        System.out.println("barking");
    }
}
class Puppy extends Dog{
        void sleep(){
            System.out.println("sleeping");
        }
}
class Cat extends Animal{
        void meow(){
            System.out.println("meoww");
        }
}

public class inheritence {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.tail = 1;
        d.bark();
        d.legs = 4; // we can use features of base class like this
        d.eat();
        Puppy p = new Puppy();
        p.eat();
        p.sleep();
        p.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();


    }


}
