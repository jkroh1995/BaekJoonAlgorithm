import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        List<Integer>list = new ArrayList<>();
        Stack<Integer>stack = new Stack<>();
        List<String>operators = new ArrayList<>();
        boolean isAnswer = true;

        for (int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }

        int index = 1;

        while(list.size()!=0){
            if(stack.isEmpty()){
                stack.add(index);
                operators.add("+");
                index++;
            }
            if(list.get(0).equals(stack.peek())){
                stack.pop();
                list.remove(0);
                operators.add("-");
                continue;
            }
            if(list.size()!=0&&index>count){
                isAnswer=false;
                break;
            }
            
            stack.push(index);
            index++;
            operators.add("+");
        }

        if(!isAnswer){
            System.out.println("NO");
        }
        else{
            for(String operator : operators){
                System.out.println(operator);
            }
        }
    }
}
