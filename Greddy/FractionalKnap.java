import java.util.*;
public class FractionalKnap {
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        double[][] ratio = new double[value.length][2];
        for(int i=0;i<weight.length;i++) {
            ratio[i][0] = i;   //indes
            ratio[i][1] = value[i] / (double)weight[i];    // ratio
        }
        // ascending order on the basis of ratio
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int finalValue = 0;
        for(int i=ratio.length-1;i>=0;i--) {
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){
                finalValue += value[idx];
                capacity -= weight[idx];
            }
            else{
                // include fractional item
                finalValue += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.println("Maximum value is " + finalValue);
    }
}