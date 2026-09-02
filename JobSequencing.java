package programs;
import java.util.*;

class Job {
    char id;      
    int deadline; 
    int profit;   

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {

  
    static void printJobScheduling(Job[] jobs, int n) {
        
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline]; 

        
        for (Job job : jobs) {
            
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    break;
                }
            }
        }

        
        System.out.print("Scheduled jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 19),
            new Job('C', 2, 27),
            new Job('D', 1, 25),
            new Job('E', 3, 15)
        };

        int n = jobs.length;
        printJobScheduling(jobs, n);
    }
}
