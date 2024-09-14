public class day_15 {
    public static class Node{
        int data;  // value
        Node next;  //address
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        System.out.println(a.data);
        System.out.println(a.next);
        System.out.println(b.data);
        System.out.println(b.next);
        System.out.println(c.data);
        System.out.println(c.next);
        System.out.println(d.data);
        System.out.println(d.next);
        System.out.println(e.data);
        System.out.println(e.next);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        System.out.println(a.data);
        System.out.println(a.next);
        System.out.println(a.next.data);
        System.out.println(a);
        System.out.println(b.next);
        System.out.println(b.next.data);
        System.out.println(b);
        System.out.println(c.next);
        System.out.println(c.next.data);
        System.out.println(c);
        System.out.println(d.next);
        System.out.println(d.next.data);
        System.out.println(d);
        System.out.println(e.next);
        // System.out.println(e.next.data);

    }
}
