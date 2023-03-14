import java.util.*;

class CircularQueue {
    List<Integer>list = new ArrayList<>();

    public void add(int i) {
        list.add(i);
    }

    public int indexOf(int goal) {
        return list.indexOf(goal);
    }

    public int size() {
        return list.size();
    }

    public int get(int index) {
        return list.get(index);
    }

    public void goLeft() {
        list.add(list.get(0));
        list.remove(0);
    }

    public void remove() {
        list.remove(0);
    }

    public void goRight() {
        list.add(0, list.get(list.size()-1));
        list.remove(list.size()-1);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CircularQueue circularQueue = new CircularQueue();
        int count = sc.nextInt();
        int n = sc.nextInt();
        List<Integer>list = new ArrayList<>();

        int answer = 0;
        for(int i=1;i<=count;i++){
            circularQueue.add(i);
        }

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        while(list.size()!=0){
            int goal = list.get(0);
            list.remove(0);

            if(circularQueue.indexOf(goal)==0){
                circularQueue.remove();
                continue;
            }

            if(shouldGoLeft(circularQueue, goal)){
                answer = goLeft(circularQueue, answer, goal);
                continue;
            }

            answer = goRight(circularQueue, answer, goal);
        }

        System.out.println(answer);
    }

    private static int goRight(CircularQueue circularQueue, int answer, int goal) {
        while(circularQueue.get(0)!= goal){
            circularQueue.goRight();
            answer++;
        }
        circularQueue.remove();
        return answer;
    }

    private static int goLeft(CircularQueue circularQueue, int answer, int goal) {
        while(circularQueue.get(0)!= goal){
            circularQueue.goLeft();
            answer++;
        }
        circularQueue.remove();
        return;
    }return answer;

    private static boolean shouldGoLeft(CircularQueue circularQueue, int goal) {
        return circularQueue.indexOf(goal) <= circularQueue.size() / 2;
    }
}
