import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int count = sc.nextInt();
        int standard = sc.nextInt();

        for(int i=1;i<count;i++){
            int input=sc.nextInt();
            if(standard>input){
                int gcd = gcd(standard, input);
                System.out.printf("%d/%d\n",standard/gcd, input/gcd);
                continue;
            }
            int gcd = gcd(input, standard);
            System.out.printf("%d/%d\n",standard/gcd, input/gcd);
        }

    }
    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
