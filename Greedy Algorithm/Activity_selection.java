
import java.util.*;
public class Activity_selection {

    public static void main(String[] args) {

        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int answer[][] = new int[start.length][3];

        for(int i =0; i<start.length; i++){
            answer[i][0] = i;
            answer[i][1] = start[i];
            answer[i][2] = end[i];
        }
        //lamba
        Arrays.sort( answer, Comparator.comparingDouble(o -> o[2]));

        int max =0;
        ArrayList<Integer> ans = new ArrayList<>();

        max =1;
        ans.add(answer[0][0]);
        int lastend = answer[0][2];
        for(int i=1; i<start.length; i++){
            if(answer[i][1] > lastend){
                max++;
                ans.add(answer[i][0]);
                lastend= answer[i][2];
            }
        }

        for (int  i =0; i<ans.size(); i++ ){
            System.out.println("A" + ans.get(i) );
        }

        

        
    }
}