import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int [] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int [] copied = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copied);
        Set<Integer>points = new LinkedHashSet<>();

        for(int num : copied){
            points.add(num);
        }

        Map<Integer, Integer> pressedPointsMap = new HashMap<>();

        int index = 0;
        for(int num : points){
            pressedPointsMap.put(num, index);
            index++;
        }

        int [] pressed = new int[N];

        for(int i=0;i<N;i++){
            pressed[i] = pressedPointsMap.get(arr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int num : pressed){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
