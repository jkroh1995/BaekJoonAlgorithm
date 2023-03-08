import java.util.Scanner;

public class Main {

    static int length;
    static String numbers = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        length = sc.nextInt();
        String newNumbers = "";
        for(int i=0;i<n;i++){
            numbers+=i+1;
        }
        recursive(newNumbers, numbers);
    }

    private static void recursive(String newNumbers, String numbers) {
        if(newNumbers.length() == length*2-1){
            System.out.println(newNumbers);
            return;
        }
        for(int i=0;i<numbers.length();i++){
            if(newNumbers.length()==0) { // 비어있는 문자열이면 일단 스타트
                recursive(newNumbers +numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
            }
            else{
                if(newNumbers.charAt(newNumbers.length()-1)<numbers.charAt(i)){ // 오름차순으로 담기 
                    recursive(newNumbers + " " + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
                }
            }
        }
    }
}
