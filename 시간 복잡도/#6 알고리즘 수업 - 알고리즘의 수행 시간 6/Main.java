import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        List<Long>sumsList = makeSumsList(n);
        long sum = 0;
        for(long num : sumsList){
            sum+=num;
        }
        System.out.println(sum);
        System.out.println(3);
    }

    private static List<Long> makeSumsList(long n) { // 1~n-2까지 각각 경우의 합들이 시간 복잡도가 된다.
        List<Long>list = new ArrayList<>();
        for(long i=1;i<=n-2;i++){
            list.add(i*(i+1)/2);
        }
        return list;
    }
}
