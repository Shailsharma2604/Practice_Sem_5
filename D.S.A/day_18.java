public class day_18 {


    public static void displayr(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"->");
        displayr(head.next);
    }

    public static int length(Node head){
        int count =0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }

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


        System.out.println(length(a));

        // display(a);
        // System.out.println();
        // display(b);
        // System.out.println();
        // displayr(a);
        // System.err.println();
        // displayr(b);
    }
}
