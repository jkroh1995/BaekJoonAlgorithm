import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] arr = new BigInteger[100];

        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.ONE;

        for(int i=3;i<100;i++){
            arr[i] = arr[i-3].add(arr[i-2]);
        }

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(arr[sc.nextInt()-1]);
        }

    }
}
