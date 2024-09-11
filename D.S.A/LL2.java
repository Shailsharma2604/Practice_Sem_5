import java.util.*;

class LL2 {
    class Node{
        String print="this is from the Node class";
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
        String print(){
            return print;
        }
    }
    public static void main(String[] args) {
        LL2 n=new LL2();
    }
}
