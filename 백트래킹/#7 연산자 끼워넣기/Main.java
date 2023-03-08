import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String operators;
    static List<Integer>results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>numbers = new ArrayList<>();
      
        int length = sc.nextInt();
        for(int i=0;i<length;i++){
            numbers.add(String.valueOf(sc.next()));
        }
      
        int[] operatorNumber = new int[4];
        for (int i = 0; i < 4; i++) {
            operatorNumber[i] = sc.nextInt();
        }
        operators = "+".repeat(operatorNumber[0])
                + "-".repeat(operatorNumber[1])
                + "*".repeat(operatorNumber[2])
                + "/".repeat(operatorNumber[3]);

        int result = Integer.parseInt(numbers.get(0));
        numbers.remove(0);
        recursive(result, numbers, operators);

        Collections.sort(results);

        System.out.println(results.get(results.size()-1));
        System.out.println(results.get(0));
    }

    private static void recursive(int result, List<String> numbers, String operators) {
        if(numbers.size()==0){
            results.add(result);
            return;
        }

        for(int i=0;i<numbers.size();i++){
            if(operators.charAt(i)=='+'){
                int operatedNumber = Integer.parseInt(numbers.get(0));
                List<String>newNumbers = new ArrayList<>(numbers);
                newNumbers.remove(0);
                recursive(result+operatedNumber, newNumbers, operators.substring(0,i) + operators.substring(i+1));
            }
            if(operators.charAt(i)=='-'){
                int operatedNumber = Integer.parseInt(numbers.get(0));
                List<String>newNumbers = new ArrayList<>(numbers);
                newNumbers.remove(0);
                recursive(result-operatedNumber, newNumbers, operators.substring(0,i) + operators.substring(i+1));
            }
            if(operators.charAt(i)=='*'){
                int operatedNumber = Integer.parseInt(numbers.get(0));
                List<String>newNumbers = new ArrayList<>(numbers);
                newNumbers.remove(0);
                recursive(result*operatedNumber, newNumbers, operators.substring(0,i) + operators.substring(i+1));
            }
            if(operators.charAt(i)=='/'){
                int operatedNumber = Integer.parseInt(numbers.get(0));
                List<String>newNumbers = new ArrayList<>(numbers);
                newNumbers.remove(0);
                recursive(result/operatedNumber, newNumbers, operators.substring(0,i) + operators.substring(i+1));
            }
        }
    }
}
