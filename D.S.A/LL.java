import java.util.*;

public class LL {


    // Node head; 
    // private int size;

    // LL(){
    //     this.size = 0;
    // }

    // class Node{
    //     String data;
    //     Node next;

    //     Node(String data){
    //         this.data=data;
    //         this.next=null;
    //         size++;
    //     }
    // }

    // public void addFirst(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    // }


    // public void deleteFirst(){
    //     if(head ==null){
    //         System.out.println("this list is empty");
    //         return;
    //     }
    //     head=head.next;
    //     size--;
    // }


    // public void deleteLast(){
    //     if(head ==null){
    //         System.out.println("this list is empty");
    //         return;
    //     }

    //     size--;
    //     if(head.next==null){
    //         head=null;
    //         return;
    //     }

    //     Node secondLast = head;
    //     Node lastNode = head.next;
    //     while (lastNode.next != null) {
    //         lastNode=lastNode.next;
    //         secondLast=secondLast.next;
    //     }

    //     secondLast.next=null;
    // }

    // public void addLast(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode.next != null){
    //         currNode = currNode.next;
    //     }

    //     currNode.next = newNode;
    // }

    // public void printList(){
    //     if(head==null){
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode != null){
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }

    //     System.out.println("NULL");
    // }


    // public int getsize(){
    //     return size;
    // }

    // public static void main(String[] args) {
    //     LL list = new LL();
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     list.printList();
    //     list.addLast("list");
    //     list.printList();
    //     list.deleteFirst();
    //     list.printList();
    //     list.deleteLast();
    //     list.printList();
    //     System.out.println(list.getsize());
    // }
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("List");
        list.addLast("is");       
        list.addLast("created");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
