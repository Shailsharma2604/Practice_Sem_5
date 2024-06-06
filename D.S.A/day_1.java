
import java.util.*;

public class day_1 {
    public static void main(String[] args) {
        // Basic
        System.out.println("Hello World!");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("End");
        System.out.println("Start");
        System.out.println("*\n**\n***\n****");
        // variable
        String name = "tony stark";
        int age =25;
        double price=45.32;
        int a = 25;
        int b = 15;
        int sum=a+b;
        int sub=a-b;
        int cal1=a*b/a-b;
        int cal2=(a*b)/(a-b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(name);
        System.out.println(price);
        System.out.println(age);
        System.out.println(cal1);
        System.out.println(cal2);
        // intput
        Scanner sc=new Scanner(System.in);
        // String name_in = sc.next();
        String name_in = sc.nextLine();
        System.out.println(name_in);
    }
}
