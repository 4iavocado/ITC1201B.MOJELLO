package OS;
import java.util.Scanner;

public class FCFS {
    //Non preemptive fcfs
    public static void main(String[] args) {

        System.out.print("Enter the number of processes: ");
        Scanner sc = new Scanner(System.in);
        int numberOfProcesses = sc.nextInt();

        int pID[] = new int[numberOfProcesses];
        int bt[] = new int[numberOfProcesses];
        int ar[] = new int[numberOfProcesses];
        int ft[] = new int[numberOfProcesses];
        int ta[] = new int[numberOfProcesses];
        int wt[] = new int[numberOfProcesses];
        int st[] = new int[numberOfProcesses];

        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.print("Process " + (i+1) + " arrival time:    ");
            ar[i] = sc.nextInt();
            System.out.print("Process " + (i+1) + " burst time:      ");
            bt[i] = sc.nextInt();
            pID[i] = i+1;
        }

        int temp;
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = i+1; j < numberOfProcesses; j++) {
                if(ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    temp = pID[i];
                    pID[i] = pID[j];
                    pID[j] = temp;
                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;
                }
            }
        }

        ft[0] = bt[0] + ar[0];
        st[0] = ar[0];
        for(int i = 1; i < numberOfProcesses; i++) {
            st[i] = Math.max(ft[i - 1], ar[i]);
            ft[i] = st[i] + bt[i];
        }

        for(int i = 0; i < numberOfProcesses; i++) {
            ta[i] = ft[i] - ar[i];
            wt[i] = ta[i] - bt[i];
        }

        System.out.println("\nProcess\t  ArrivalTime\t   BurstTime\t  StartTime\t  FinishTime\t  TurnaroundTime  WaitingTime");
        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.println(pID[i] + "\t\t" + ar[i] + "\t\t" + bt[i] + "\t\t" + st[i] + "\t\t" + ft[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
        }

        // Calculate and display average TAT and WT
        float avgTAT = 0;
        float avgWT = 0;
        for(int i = 0; i < numberOfProcesses; i++) {
            avgTAT += ta[i];
            avgWT += wt[i];
        }
        avgTAT /= numberOfProcesses;
        avgWT /= numberOfProcesses;

        System.out.println("\n\nAverage Turnaround Time (TAT): " + avgTAT);
        System.out.println("Average Waiting Time (WT): " + avgWT);

        // Gantt Chart
        System.out.println("\n\nGantt Chart: ");
        System.out.print(" ");
        for(int i = 0; i < numberOfProcesses; i++) {
            for(int j = 0; j < bt[i]; j++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("|");
        for(int i = 0; i < numberOfProcesses; i++) {
            for(int j = 0; j < bt[i] - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("P" + pID[i]);
            for(int j = 0; j < bt[i] - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.print(" ");
        for(int i = 0; i < numberOfProcesses; i++) {
            for(int j = 0; j < bt[i]; j++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
