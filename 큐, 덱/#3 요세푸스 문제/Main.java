import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer>queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(i+1);
        }
      
        int k = sc.nextInt();
        k--;

        List<String>list = new ArrayList<>();

        while(!queue.isEmpty()){
            for(int i=0;i<k;i++){
                queue.add(queue.poll());
            }
            list.add(String.valueOf(queue.poll()));
        }

        System.out.println("<"+String.join(", ", list)+">");
    }
}
