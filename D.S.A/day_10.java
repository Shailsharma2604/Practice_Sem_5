
import java.util.*;

public class day_10 {
    public static void main(String[] args) {

        // Scanner in =new Scanner (System.in);
        // int [] arr=new int[9];
        // // System.out.println(rnos[0]);

        // // String[] arr= new String[8];
        // // System.out.println(arr[0]);

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=in.nextInt();
        // }
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.print(arr[i]+" ");
        // // }
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // System.out.println(Arrays.toString(arr));



        Scanner in =new Scanner(System.in);
        int [][]arr = new int[5][5];
        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                arr[rows][cols]=in.nextInt();
            }
        }
        
        // for(int rows=0;rows<arr.length;rows++){
        //     for(int cols=0;cols<arr[rows].length;cols++){
        //         System.out.print(arr[rows][cols]+" ");
        //     }System.out.println();
        // }

        for(int rows=0;rows<arr.length;rows++){
            System.out.println(Arrays.toString(arr[rows]));
        }
        
            


    }
}
