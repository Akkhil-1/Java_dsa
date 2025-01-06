import java.util.ArrayList;
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        ArrayList<Integer> list = new ArrayList<>();
        //  to store the index of activities
        // add 1st activity
        int maxAct = 1;
        list.add(0);
        int lastEndingTime = end[0];
        for(int i=1;i<start.length;i++) {
            if(start[i] >= lastEndingTime) {
                maxAct++;
                list.add(i);
                lastEndingTime = end[i];
            }
        }
        System.out.println("Maximum activities is " + maxAct);
        for(int i=0;i<list.size();i++) {
            System.out.print("A" + list.get(i) + " ");
        }
        System.out.println();
    }   
}
