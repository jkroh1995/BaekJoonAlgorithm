import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String>neverHeard = new HashSet<>();
        List<String>never = new ArrayList<>();

        for(int i=0;i<N;i++){
            neverHeard.add(sc.next());
        }

        for(int i=0;i<M;i++){
            String name = sc.next();
            if(neverHeard.contains(name)){
                never.add(name);
            }
        }

        Collections.sort(never);

        System.out.println(never.size());
        for(String name : never){
            System.out.println(name);
        }
    }
}
