public class day_26 {
    public static void main(String[] args) {
        int ans_1=fact(5);
        System.out.println(ans_1);
        int ans_2=sum(5);
        System.out.println(ans_2);
        
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);

    }

    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);

    }
}
