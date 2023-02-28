import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        if(c-a1>0){
            if(a0<=(c-a1)*n){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        if(c-a1==0){
            if(a0<=0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        if(c-a1<0){
            System.out.println(0);
        }
    }
}
