public class day_25 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        fun(n-1);
        System.out.print(n);
    }
}
