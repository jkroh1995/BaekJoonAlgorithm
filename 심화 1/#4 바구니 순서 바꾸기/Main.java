import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] numbers = new int[N];

        for(int i=0;i<N;i++){
            numbers[i]=i+1;
        }

        for(int i=0;i<M;i++){
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int mid = sc.nextInt();
          
            //바뀔 정보를 담을 임시 배열을 생성한다.
            int [] tmp =new int[end-begin+1];

            int index = 0;
            for(int j=0;j<tmp.length;j++){
                if(mid+j<=end){    // mid ~ end까지 담는다.
                    tmp[j] = numbers[mid+j-1];
                }
                else{   //begin ~ mid-1까지 담는다.
                    tmp[j] = numbers[begin+index-1];
                    index++;
                }
            }

            for(int j=0;j<tmp.length;j++){
                numbers[begin+j-1]=tmp[j];
            }
        }

        for(int num :numbers){
            System.out.print(num+" ");
        }
    }
}
