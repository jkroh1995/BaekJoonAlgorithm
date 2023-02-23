import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> original = new HashSet<>();
        for(int i=0;i<N;i++){
            original.add(sc.nextInt());
        }

        int M = sc.nextInt();
        Set<Integer> another = new LinkedHashSet<>();
        for(int i=0;i<M;i++){
            another.add(sc.nextInt());
        }

        int [] result = new int[M];

        int index=0;
        for(int num : another){
            if(original.contains(num)){
                result[index]=1;
            }
            else{
                result[index]=0;
            }
            index++;
        }

        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
