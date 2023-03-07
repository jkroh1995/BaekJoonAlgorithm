import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int input = sc.nextInt();
            if(input==0){
                if(priorityQueue.size()==0){
                    System.out.println(0);
                    continue;
                }
                System.out.println(priorityQueue.poll());
                continue;
            }
            priorityQueue.add(input);
        }
    }
}
