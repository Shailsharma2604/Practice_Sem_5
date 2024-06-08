
import java.util.*;

public class day_2 {
    public static void main(String[] args) {
        // Loops
        // System.out.println("Hello World!");

        // for
        // for(int counter=0;counter<30;counter++){
        //     System.out.println("Hello world!");
        // }
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(i);
        // }

        // While
        // int i=0;
        // while (i<11) {
        //     System.out.println(i);
        //     i++;
        // }

        // do while
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<11);


        // ques1
        // Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        // ques2
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int multi=0;
        // int ans=0;
        // for(int i=1;i<11;i++){
        //     ans=n*i;
        //     // System.out.println(ans);
        //     multi=multi+1;
        //     System.out.println(n+" x "+multi+" = "+ans);
        // }


        // Ques1

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("*");
        // }

        // int n=10;
        // int m=10;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        // Ques2

        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
