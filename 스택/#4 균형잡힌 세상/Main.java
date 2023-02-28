import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            if(input.equals(".")){
                break;
            }
            Stack<String>stack = new Stack<>();

            for(String word : input.split("")){
                if(stack.empty()&&(word.equals("(")||word.equals(")")||word.equals("[")||word.equals("]"))){
                    stack.add(word);
                    continue;
                }
                if(word.equals("(")){
                    stack.add(word);
                }
                if (word.equals(")")){
                    if(stack.peek().equals("(")){
                        stack.pop();
                    }
                    else{
                        stack.add(word);
                    }
                }
                if (word.equals("[")){
                    stack.add(word);
                }
                if (word.equals("]")){
                    if(stack.peek().equals("[")){
                        stack.pop();
                    }
                    else{
                        stack.add(word);
                    }
                }
            }

            if(stack.empty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

        }
    }
}
