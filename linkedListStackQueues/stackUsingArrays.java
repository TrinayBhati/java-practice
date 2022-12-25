package linkedListStackQueues;

   /*  last in first out
     first in last out

     implementing stack using arrays
            isEmpty function - if top == -1 then stack is empty
            push fundtion - push(20)
                            top ++;
                            stack[top]
            pop function - int deletedValue = stack[top]
                           top --;
                           return deledetvalue;
            peak - returns the top most value


    */
    class Stack{
        private int maxSize = 100;
        private int stack[] = new int[maxSize];
        private int top = -1;


       boolean isEmpty() {
           return top <= -1;
       }
        void push(int data){
            if(top + 1 >= maxSize){
                System.out.println("stack reached it's limit");
                return;
            }
            top++;
            stack[top] = data;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int deletedValue = stack[top];
            top--;
            return deletedValue;
        }
       int peek(){
           if(isEmpty()){
               System.out.println("Stack is Empty!!");
               return -1;
           }
           return stack[top];
       }

        void print(){
            for(int i = 0; i<=top ; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
   }
   public class stackUsingArrays {
       public static void main(String[] args) {
           Stack myStack = new Stack();
           myStack.push(10);
           myStack.push(20);
           myStack.push(30);
           myStack.push(40);

           myStack.print();
           System.out.println(myStack.pop());

           myStack.print();
           System.out.println("Top => " + myStack.peek());
       }

}
