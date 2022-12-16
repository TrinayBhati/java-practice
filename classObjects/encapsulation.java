package classObjects;

// wrapping up of data members and methods together
    /* how to achieve encapsulation

    make all data members as private
    access them using getters and setters
     */


class User{
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if(num >0){
            this.num =  num;
        }
        else{
            System.out.println("no negatives allowed");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    User(){
        System.out.println("hello World");
    }
    User(int num , String name){
        this.num = num;
        this.name = name;
    }

    public void print(){
        System.out.println(this.num);
        System.out.println(this.name);
    }

}
public class encapsulation {

    public static void main(String[] args) {
        User user1 = new User(101,"trinay");
        // if we remove the setter then this number will never change

        user1.setNum(30);
        user1.print();



    }
}
