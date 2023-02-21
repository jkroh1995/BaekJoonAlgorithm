import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
      
        int N = sc.nextInt();
        int [] numbers = new int [N];
      
        for(int i = 0; i<N;i++){
            numbers[i]=sc.nextInt();
        }
      
        int v = sc.nextInt();
        
        int count=0;
      
        for(int number : numbers){
            if(number==v){
                count++;
            }
        }
        System.out.print(count);
    }
}
