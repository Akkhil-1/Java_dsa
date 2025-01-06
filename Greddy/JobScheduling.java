import java.util.ArrayList;
import java.util.Collections;
public class JobScheduling {
    static class Job {
        int deadline;
        int profit;
        int id;
        public Job(int id , int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs , (a, b) -> b.profit-a.profit);
        // descending order of profits k sare profits aa jayenge
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobs.size();i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maximum jobs " + seq.size());
        for(int i=0;i<seq.size();i++) {
            System.out.print(seq.get(i) + " ");
        }
    }
}
