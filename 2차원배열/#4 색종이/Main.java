import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int [][] square = new int[100][100]; 
        for(int i=0;i<100;i++){   // 흰 부분은 0으로 저장
            for(int j=0;j<100;j++){
                square[i][j]=0;
            }
        }

        int papers = sc.nextInt();
      
        for(int i=0;i<papers;i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            for(int j=row;j<row+10;j++){    // 검은 부분은 1로 저장
                for(int k=column;k<column+10;k++){
                    if(square[j][k]==0){
                        square[j][k]=1;
                    }
                }
            }
        }
        
        int count = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(square[i][j]==1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
