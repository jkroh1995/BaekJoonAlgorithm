import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer>setOne = new HashSet<>();
        Set<Integer>setTwo = new HashSet<>();

        for(int i=0;i<n;i++){
            setOne.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            setTwo.add(sc.nextInt());
        }

        int one = 0;
        int two = 0;

        for(int number : setOne){
            if(!setTwo.contains(number)){
                one++;
            }
        }

        for(int number : setTwo){
            if(!setOne.contains(number)){
                two++;
            }
        }

        System.out.println(one+two);
    }
}
