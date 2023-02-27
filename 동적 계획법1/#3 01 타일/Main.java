import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-2]%15746+arr[i-1]%15746;
        }

        System.out.println(arr[n-1]%15746);
    }
}

/*
 * 점화식이 나오는 이유
 * 처음에 올 수 있는 타일은 00 또는 1 뿐이다.
 * 이때 00타일이 온다면 해당 부분은 n-2개의 타일을 가지고 만들 수 있는 경우의 수와 같다.
 * 마찬가지로 1타일이 온다면 해당 부분은 n-1개의 타일을 가지고 만들 수 있는 경우의 수와 같다.
 * 따라서 f(n) = f(n-2) + f(n-1)의 식이 성립한다.
 */
