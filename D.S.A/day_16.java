public class day_16 {

    public static class Node{
        int data;  // value
        Node next;  //address
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        System.out.println();
        display(b);

        // Node temp = a;
        // // for(int i=1;i<=5;i++){
        // //     System.out.print(temp.data+"->");
        // //     temp=temp.next;
        // // }
        // while (temp!=null) {
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
        // }
    }
}
