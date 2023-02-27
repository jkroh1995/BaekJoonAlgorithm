import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Set<String> set = new HashSet<>();
        
        int length = 1;
        
        while(length<=input.length()){
            for(int i=0;i<input.length()-length+1;i++){
                set.add(input.substring(i,i+length));
            }
            length++;
        }

        System.out.println(set.size());
    }
}
