import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goal = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input<=goal){
                list.add(input);
            }
        }

        list.sort(Collections.reverseOrder());

        int answer = 0;
        for(int money : list){
            if(goal<money){
                continue;
            }
            int many = goal/money;
            goal -= money*many;
            answer+=many;
            if(goal==0){
                break;
            }
        }
        System.out.println(answer);
    }
}
