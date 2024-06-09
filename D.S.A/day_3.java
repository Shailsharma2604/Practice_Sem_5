public class day_3 {
    public static void main(String[] args) {

        int n=5;
        int m=5;

        // Half Pyramid

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid(180)

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Half Pyramid with Numbers

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.err.println();
        // }

        // Invereted Half Pyramid with Numbers

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Floyd's Triangle

        // int x=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(x+" ");
        //         x++;
        //     }
        //     System.out.println(" ");
        // }


        // 0-1 Triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if (sum%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
