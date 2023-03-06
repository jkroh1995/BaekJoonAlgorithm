import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            boolean useQueue = true;
            boolean isError = false;

            String testCase = sc.next();
            int noMean = sc.nextInt();
            String inputCase = sc.next();

            String [] arr = inputCase.replace("[","").replace("]","").split(",");

            List<String> list = new ArrayList<>(Arrays.asList(arr));

            list.remove("");                    //빈 배열일 경우
            if(list.size()==0){
                if(inputCase.charAt(0)=='D'){
                    System.out.println("error");
                    continue;
                }
            }

            for(int j=0;j<testCase.length();j++){
                if(isReverse(testCase, j)){
                    useQueue = reverse(useQueue);
                    continue;
                }
                if(list.isEmpty()){
                    System.out.println("error");
                    isError=true;
                    break;
                }
                if(useQueue){
                    list.remove(0);
                    continue;
                }
                list.remove(list.size()-1);
            }
            if(isError){
                continue;
            }
            if(!useQueue){
                Collections.reverse(list);
                System.out.println("["+String.join(",", list)+"]");
                continue;
            }
            System.out.println("["+String.join(",", list)+"]");
        }
    }

    private static boolean reverse(boolean useQueue) {
        return !useQueue;
    }

    private static boolean isReverse(String testCase, int j) {
        return testCase.charAt(j) == 'R';
    }
}
