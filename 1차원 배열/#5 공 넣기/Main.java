import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] numbers = new int [N];
        
        //공을 집어 넣음
        for(int i=0;i<M;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt();
            for(int j=start-1;j<end;j++){
                numbers[j] = number;
            }
        }
        
        for(int num : numbers){
            System.out.print(num+" ");
        }
    }
}
