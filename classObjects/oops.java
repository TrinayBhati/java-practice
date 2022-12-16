package classObjects;

public class oops {


    /*      time complexity is the time taken for a programme to complete depending upon the input size(n)
            time space trade off
        Structural/functional programming = everything was focused on funtions
        Object oriented programming = everything focuses on classes and objects

      class - like a blueprint of how each object will be
      objects - instances. clone of the class
        class className{ // how we create class
        data members
        methods
        }
        className object // how we create object
        use new keyword

     access modifiers
        1. private - can be used inside its own class only
                cannot use private in derrived class as well

        2. public - can be used in the whole application

        3. protected - accessible within the package in which it is defined and in it's subclass

        4. default - accessible within same class and package within which it's defined
                    no need to write anything it is default Access modifier
                    can access inside own class, derived class and also using object in main class
                                works only inside same package
        5. protected - accessible inside own class
                       accessible through objects
                       accessible inside the package
                       can be used outside the package inside the derrived class
                       cannot be used through object outisde the package
                                          only the derrived class feature can be used outide the package as well


     getter and setters
        we use this when we made private and can't use in another class
        so we make getters
        public int getRollNumber{
        return rollNo
        }      now we can get roll number or anything that we have made private

     this keyword :
        when we use this keyword it points to the real one which we have defined before
        it points to the object reference from which it is invoked in the same class
     super keyword : this gets invo ked in its parent class
                super(parameters); should be in the first line in the constructor body

     constructors :
        constructors are used to construct the objects
        they are by default public
        to create constructor we use same name as of class
        they don't have any return type

        class Student{
        private int rollNo;

        Student(){
        System.out.println("new Student is added"};
        }
        }
        so now every time student is called the above statement will be printed

        1. default - it does not have any parameters
        2. parameterized constructors -  it has some parameters
           if u are making a parameterized constructor then iţis necessary to make a default also if not then it'll throw error

           in java we don't have destructors

        import a class so we can use the features of another class
        in order to use the specifiers of the class we will use . operoters like animal.bark or smthn like that
        or we can use the entire class by using .*
        cannot use default members outside package without public

        Static keyword - to keep it same or consistent
        Static variables works as a global variable just in a class
                same memory is shared with all the objects so the value remains same
        Static method - you do not need to create the object.
                    can use only static variables also you can call only other static methods
        Final keyword - things that cannot be changed
                        finalized thing
                                int x = 10;
                                int x = 22; // can be changed
                                final int x = 20; cannot be changed
                                final int x ;
                                x = 100; cannot be changed
         variable value can be set only once
                        for final methods it cannot be overriden
                        if a class is final then it cannot be inheritted




















     */



}
