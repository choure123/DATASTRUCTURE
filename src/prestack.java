import java.util.Stack;
class CustomStack {
    //try with other arrays
    int arr[];
    int top;
    int capacity;
    CustomStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    //use this one to implement dry principle
    public boolean isEmpty(){
        return top == -1;
    }


    public void isFull(){
        if(top == capacity-1){
            System.out.println("Stack is full");
        }
    }
    //push function is used to add any element at the top position of stack
    public void push(int a) {
        if(top == capacity-1){
            System.out.println("Stack is full");
        }else{
            //incrementing the top because our element will be sitting upont the top
            top = ++top;
            arr[top]= a;
        }

    }
    //pop function is to remove the topmost element from the stack
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Element is poping:  " + arr[top]);
            //We are decrementing top to let the previous member be top as the current member will be removed from the stack
            top = --top ;
            System.out.println("Element poped");
        }
    }
    //peek function is used to display the top mosty element in the stack
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else {
            System.out.println(arr[top]);
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }

}
class StackExe{
    public static void main(String[] args) {
        CustomStack s1 = new CustomStack(10);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.peek();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.peek();
        s1.display();

    }
}
public class prestack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}

