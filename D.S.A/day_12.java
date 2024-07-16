
import java.util.*;

public class day_12 {
    public static void main(String[] args) {

        Scanner arr = new Scanner(System.in);

        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);

        // for(int i=0;i<5;i++){
        //     list.add(arr.nextInt());
        // }
        // for(int i=0;i<5;i++){
        //     System.out.println(list.get(i));
        // }
        // // System.out.println(list);


        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        // initialisation
        
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(arr.nextInt());
            }
        }
        System.out.println(list);
    }
}
