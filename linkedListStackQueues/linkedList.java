package linkedListStackQueues;


    


        /*
        node = it is single unit of a linkedlist consists of 2 parts {data and next node}
        linked list = collectoin of nodes
        store the first value which is data
        store the second value's position to navigate

        1 node is like this = [data][address of next]

        first node of ll is called head

        array : got a limit, pre defined size, length is initiated initially
        ( int arr[] = new int[5];)
        ll : no predefined size

        array : it needs memory for data only (int arr[] = {2,3,4,3,4,3};)
        ll : needs memory for both value and storing the position of next value
               needs extra memory storing next node's address

        array : fast access time = O(1)
        ll : not as fast access time = O(n)

        array : insert is lengthy
               have to shift all the elements ahead or back, which is not feasible
               insertion and deletion takes O(n) which is not good
        ll : just need to change the next node's address with the one which we need to insert
              insertion n deletion takes O(1) which is dope

        where u want insertion deletion fast use ll
        where u want fast access time wanna use searching n some operations then use array

        while creating array we can define data line int arr[] String str[]
        in ll we gotta store 2 different types one data and other is address

        operations in ll
        push :insertion of data




         */

 /*       class Node{
            int data;

            Node next;
        }

public class linkedList {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.data = 10;
        node1.next = node2;
        node2.data = 20;
        node2.next = node3;
        node3.data = 30;
        node3.next = node4;
        node4.data = 40;
        node4.next = null;

     //   System.out.println(node2.data);

        Node head = node1;
        //to traverse ll we need to start from head that's node 1 and end when node has null as address

      //  for( Node temp = head ; temp!=null ; temp = temp.next){}

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
       // System.out.println(temp); prints the null or the last value of temp
       // is empty - if head is equal to null


    }
}*/

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class list{
    // push - insertion of data,¿when there is no data then head is null
    //head = null meaning list is empty

    private Node head; // making it private so that user cannot access or change head
   // Node head;
    void pushLast(int data){
        Node newNode = new Node(data);
       // newNode.data = data; with the use of constructor this can be eliminated

        if(head == null){
           // Node newNode = new Node(); // instead of using both these statements in  if and else we can use it above common
           // newNode.data = data;

            head = newNode;
        }
        else{
            // Node newNode = new Node();
            // newNode.data = data;

            Node temp = head;
            // goes to last node
            while(temp.next != null){
                temp = temp.next;
            }
            //connect last node to newNode
            temp.next = newNode;
        }
    }
    void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    int popLast(){
            if(head == null){ // when list is empty
                    System.out.println("list is empty");
                    return -1;
            }
            if(head.next == null){ // when list got only 1 node
                    int deletedValue = head.data;
                    head = null;
                    return deletedValue;
            }
            Node temp = head;
            while(temp.next.next != null){
                    temp = temp.next;
            }
            int deletedValue = temp.next.data;
            temp.next = null;
            return deletedValue;
    }

    int popBegin(){
        if(head == null){
            System.out.println("error");
            return -1;
        }
        int deletedValue = head.data;
        head = head.next;
        return deletedValue;
    }
    boolean isEmpty(){
          /*  if(head == null){
                    return true;
            }
            else{
                    return false;
            }*/
            return head == null; // simplified form of the above if else
    }
    void print(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp);
    }
}
public class linkedList {
    public static void main(String[] args) {

        list myList = new list();

        System.out.println(myList.isEmpty());

        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.pushLast(40);
        myList.pushLast(50);

        myList.print();
        System.out.println();

      /*  System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
        System.out.println(myList.head.next.next.data);*/

        //myList.pop();
        //myList.print();

            System.out.println(myList.popLast());
            System.out.println(myList.isEmpty());
            myList.pushBegin(10);
            myList.print();
            myList.popBegin();
            System.out.println();
            myList.print();
    }
}

    

