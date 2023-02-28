import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       Stack<Integer>stack= new Stack<>();
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
           int input = sc.nextInt();
           if(input==0){
               stack.pop();
               continue;
           }
           stack.add(input);
       }
      
      /*
      * stream 써봤던거 써보고 싶었다 ㅎ;
      */
      
        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}
