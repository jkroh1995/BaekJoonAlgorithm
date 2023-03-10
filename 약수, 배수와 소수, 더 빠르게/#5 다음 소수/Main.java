import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            BigInteger n = new BigInteger(sc.next());
            if (n.isProbablePrime(10)) {
                System.out.println(n);
            } else {
                System.out.println(n.nextProbablePrime());
            }
        }
    }
}
