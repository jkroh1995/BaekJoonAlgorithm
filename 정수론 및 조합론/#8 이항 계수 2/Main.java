import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        BigInteger son = factorial(n); //1000!까지 갈 수 있기 때문에 BigInteger를 사용한다.
        BigInteger mother = factorial(k).multiply(factorial(n-k));

        System.out.println(son.divide(mother).remainder(new BigInteger("10007")));
    }

    private static BigInteger factorial(int n) {
        BigInteger number = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            number=number.multiply(new BigInteger(String.valueOf(i%10007)));
        }
        return number;
    }
}
