import java.util.*;
public class ActivitySelection2 {
    public static void main(String[] args) {
        int[] start = {0,1,3,5,5,8};
        int[] end = {6,2,4,7,9,9};
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));
        // sorting on the basis of column no 2 that is column [ end time ]
        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 1;
        list.add(activities[0][0]);
        int lastEndingTime = activities[0][2];
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEndingTime) {
                maxAct++;
                list.add(activities[i][0]);
                lastEndingTime = activities[i][2];
            }
        }
        System.out.println("Maximum activities is " + maxAct);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i) + " ");
        }
        System.out.println();
    }
}
