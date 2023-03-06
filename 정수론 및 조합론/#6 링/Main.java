import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        for(int i=1;i<one;i++){
            int three=sc.nextInt();
            if(two>three){
                int gcd = gcd(two, three);
                System.out.printf("%d/%d\n",two/gcd, three/gcd);
                continue;
            }
            int gcd = gcd(three, two);
            System.out.printf("%d/%d\n",two/gcd, three/gcd);
        }

    }
    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
