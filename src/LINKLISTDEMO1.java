import java.util.LinkedList;

class LINKLISTDEMO1 {


    Node head;
    private int size;


    LINKLISTDEMO1() {
        size = 0;
    }


    public class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data) {
        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            return;
        }


        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;
    }


    public void printList() {
        Node currNode = head;


        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }


        System.out.println("null");
    }


    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        head = this.head.next;
        size--;
    }


    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        size--;
        if (head.next == null) {
            head = null;
            return;
        }


        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }


        currNode.next = null;
    }


    public int getSize() {
        return size;
    }


    public static void main(String args[]) {
        LINKLISTDEMO1 list = new LINKLISTDEMO1();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();


        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());


        list.removeFirst();
        list.printList();


        list.removeLast();
        list.printList();
    }
}


class DEMOLINKEDLIST0 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);


        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}

/* public void addInMiddle(int index, String data) {
     if (index > size || index < 0) {
         System.out.println("Invalid Index value");
         return;
     }
     size++;


     Node newNode = new Node(data);
     if (head == null || index == 0) {
         newNode.next = head;
         head = newNode;
         return;
     }
     Node currNode = head;
     for (int i = 1; i < size; i++) {
         if (i == index) {
             Node nextNode = currNode.next;
             currNode.next = newNode;
             newNode.next = nextNode;
             break;
         }
         currNode = currNode.next;
     }
 }
}

*/
 class CustomLinkedList {
    static class Node{
        int value;
        Node next;
        Node(int a){
            value = a;
            next = null;
        }
    }
    //currently null
    Node head;


    //I have to mention the list where i am adding and i have to mention what i am adding
    public static CustomLinkedList insert(CustomLinkedList list ,int d){
        Node newNode = new Node(d);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void display(CustomLinkedList list){
        Node current = list.head;
        while(current !=null){
            System.out.println(current.value + "   ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList.insert(list1 , 10);
        CustomLinkedList.insert(list1 , 11);
        CustomLinkedList.insert(list1 , 23);
        CustomLinkedList.display(list1);
    }


}

class CustomLinkedList2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
class List2{
    public static void main(String[] args) {
        CustomLinkedList2 list1 = new CustomLinkedList2();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.display();
    }
}