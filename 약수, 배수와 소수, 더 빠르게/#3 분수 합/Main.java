import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstUpper = scanner.nextInt();
        int firstDown = scanner.nextInt();
        int secondUpper = scanner.nextInt();
        int secondDown = scanner.nextInt();

        int upperSum = firstUpper*secondDown + secondUpper*firstDown;
        int downSum = firstDown*secondDown;

        System.out.printf("%d %d", upperSum/gcd(Math.max(upperSum, downSum), Math.min(upperSum, downSum)), downSum/gcd(Math.max(upperSum, downSum), Math.min(upperSum, downSum)));
    }

    static long gcd(long a, long b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
