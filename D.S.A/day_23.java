public class day_23 {
    public static void main(String[] args) {
        int ans_1=fibo(4);
        System.out.println(ans_1);
        print(1);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
