package classObjects;

class Student {
        private int rollNo;
        String name;
        int age;

        static int count = 0;

        public int getRollNumber(){
            return rollNo;
        }


       Student(){
            System.out.println("a new student is registered");
            rollNo = -1;
            name = "ABC";
            age = -1;
        }

    Student(int rollNo, String name, int age){
           this.rollNo = rollNo;
           this.name = name;
           this.age = age;
    }

        void printDetails(){
            System.out.println(rollNo);
            System.out.println(age);
            System.out.println(name);
        }

        void message(){
            System.out.println("hello everyone");
        }

        public void setRoleNo(int rollNo ){
            this.rollNo = rollNo;
        }

        String getName(){
            return name;
        }
    }

public class test {
    public static void main(String[] args) {

        Student std1 = new Student(20,"trin",3);
/*
        std1.setRoleNo(23);
        std1.age = 4;
        std1.name = "trinay";
        std1.name = "nik";
        std1.printDetails();

        Student std2 = new Student();
        std2.setRoleNo(99);
        std2.age = 3;
        std2.name = "shourya";

        std2.printDetails();

        std1.message();

        System.out.println(std1.getName());

        Scanner sc = new Scanner(System.in);
        Student std3 = new Student();
        std3.setRoleNo(sc.nextInt());
        sc.nextLine();
        std3.name = sc.nextLine();
        std3.age = sc.nextInt();

        std3.printDetails();
        std3.getRollNumber();
*/
        // commented above code to check what will happen when no value is passed
        // the constructor is used where we provided default values


        std1.printDetails();
        System.out.println(std1.count);









    }
}






