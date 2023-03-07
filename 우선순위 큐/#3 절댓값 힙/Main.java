import java.util.*;

class Number implements Comparable<Number> {

    private int originalNumber;
    private int absoluteNumber;

    public Number(int originalNumber, int absoluteNumber) {
        this.originalNumber = originalNumber;
        this.absoluteNumber = absoluteNumber;
    }

    public int getOriginalNumber() {
        return originalNumber;
    }

    @Override
    public int compareTo(Number number) {
        if (this.absoluteNumber > number.absoluteNumber) {
            return 1;
        }
        if (this.absoluteNumber < number.absoluteNumber) {
            return -1;
        }
        if (this.originalNumber > number.originalNumber)
            return 1;
        else if (this.originalNumber < number.originalNumber)
            return -1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Number> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                if (priorityQueue.size() == 0) {
                    System.out.println(0);
                    continue;
                }
                Number number = priorityQueue.poll();
                System.out.println(number.getOriginalNumber());
                continue;
            }
            priorityQueue.add(new Number(input, Math.abs(input)));
        }
    }
}
