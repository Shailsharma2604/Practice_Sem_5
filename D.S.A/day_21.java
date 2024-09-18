import java.util.LinkedList;

public class day_21 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            // tail.next = temp;
            // tail = temp;
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            // tail.next = temp;
            // tail = temp;
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll =new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.insertAt(1,3);
        ll.display();
        System.out.println(ll.size());
    }
}
