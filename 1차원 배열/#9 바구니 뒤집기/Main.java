import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i]=i+1;
        }

        for(int i=0;i<M;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int [] tmp = new int[end-start+1]; //뒤집힌 공을 담을 임시 배열 생성
            for(int j=0;j<tmp.length;j++){
                tmp[j] = numbers[end-j-1];
            }
            for(int j=0;j<tmp.length;j++){
                numbers[start+j-1]=tmp[j];
            }
        }

        for (int num : numbers) {
                System.out.print(num+" ");
        }
    }
}
