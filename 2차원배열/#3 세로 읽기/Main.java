import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String[] A = new String[5];

        for (int i = 0; i < 5; i++) {
            A[i] = sc.next();
        }

        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            if (A[i].length() > maxLength) {
                maxLength = A[i].length();
            }
        }

        String[][] second = new String[5][maxLength];
        for (int i = 0; i < 5; i++) {
            String[] tmp = A[i].split("");
            for (int k = 0; k < tmp.length; k++) {
                second[i][k] = tmp[k];
            }
        }

        for (int i = 0; i <maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if(second[j][i]!=null) {
                    System.out.print(second[j][i]);
                }
            }
        }
    }
}
