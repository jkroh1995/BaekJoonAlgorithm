import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] numbers = new int [N];
        for(int i=0;i<N;i++){
            numbers[i] = i+1;
        }

        for(int i=0;i<M;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            
            int firstBall = numbers[first-1]; // 첫 번째로 선택한 바구니에서 공을 꺼냄
            int secondBall = numbers[second-1]; // 두 번째로 선택한 바구니에서 공을 꺼냄
            
            numbers[first-1] = secondBall;
            numbers[second-1] = firstBall;
        }

        for(int num : numbers){
            System.out.print(num+" ");
        }
    }
}
