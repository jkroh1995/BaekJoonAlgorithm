import java.util.*;


public class Main {
    static Set<Integer> primeList = makePrimeSet();

    private static Set<Integer> makePrimeSet() {
        Set<Integer>list = new HashSet<>();
        for(int i=2;i<=1000000;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int input = sc.nextInt();
            int numbers = makeCount(input);
            System.out.println(numbers);
        }
    }

    private static int makeCount(int input) {
        int count = 0;
        for(int i=2;i<=input/2;i++){
            if(primeList.contains(i) && primeList.contains(input-i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
