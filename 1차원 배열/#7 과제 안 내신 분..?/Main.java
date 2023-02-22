import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        //30명의 List 제작
        int [] numbers = new int [30];
        for(int i=0;i< 30;i++){
            numbers[i]=i+1;
        }

        for(int i=0;i<28;i++){
            int n = sc.nextInt();
            numbers[n-1]=0;
        }

        for(int num : numbers){
            if(num!=0){
                System.out.println(num);
            }
        }
    }
}
