public class day_17 {


    public static void displayr(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"->");
        displayr(head.next);
    }

    // public static void displayrev(Node head){
    //     if(head==null){
    //         return;
    //     }
    //     displayr(head.next);
    //     System.out.print(head.data+"->");
    // }

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
        System.out.println();
        displayr(a);
        System.err.println();
        displayr(b);
        // System.out.println();
        // displayrev(a);
        // System.err.println();
        // displayrev(b);

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
