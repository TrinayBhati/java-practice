package linkedListStackQueues;

/*
        isEmpty function - if top == null
        push - similar to pushBegin in ll
        pop - similar to popBegin in ll
        peak - returns the top most value

 */



 class Nodee{
    int data;
    Nodee next;
    Nodee(int data){
        this.data = data;
    }
}

class Stack{
    Nodee top;

    void push(int data){
        Nodee newNodee = new Nodee(data);
        newNodee.next = top;
        top = newNodee;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        int delVal = top.data;
        top = top.next;
        return delVal;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top == null;
    }

    void print(){
        Nodee temp = top;
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class stackUsingLinkedList {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.push(60);

        myStack.print();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);

        myStack.print();
        System.out.println("Top => " + myStack.peek());
    }
}