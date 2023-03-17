import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aRow = sc.nextInt();
        int aColumn = sc.nextInt();
        int [][] a = new int[aRow][aColumn];

        for(int i=0;i<aRow;i++){
            for(int j=0;j<aColumn;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int bRow = sc.nextInt();
        int bColumn = sc.nextInt();
        int [][] b = new int[bRow][bColumn];

        for(int i=0;i<bRow;i++){
            for(int j=0;j<bColumn;j++){
                b[i][j] = sc.nextInt();
            }
        }

        int [][] result = new int[aRow][bColumn];
        int x=0;
        int y=0;
        while(true){
            int sum=0;
            for(int i=0;i<a[0].length;i++){
                sum+=a[x][i]*b[i][y];
            }
            result[x][y]=sum;
            if(y!=b[0].length-1) {
                y++;
            }
            else{
                y=0;
                x++;
            }
            if(x==a.length){
                break;
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
