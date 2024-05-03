package OS;
import java.util.Scanner;

public class SJF_preemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int numberOfProcesses = sc.nextInt();

        int pID[] = new int[numberOfProcesses];
        int at[] = new int[numberOfProcesses];
        int bt[] = new int[numberOfProcesses];
        int ft[] = new int[numberOfProcesses];
        int ta[] = new int[numberOfProcesses];
        int wt[] = new int[numberOfProcesses];
        int f[] = new int[numberOfProcesses];
        int remainingTime[] = new int[numberOfProcesses];
        int currentTime = 0;
        int completed = 0;

        float avgwt = 0, avgta = 0;

        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.print("Process " + (i + 1) + " arrival time:  ");
            at[i] = sc.nextInt();
            System.out.print("Process " + (i + 1) + " burst time:    ");
            bt[i] = sc.nextInt();
            pID[i] = i + 1;
            f[i] = 0;
            remainingTime[i] = bt[i];
        }

        while (completed != numberOfProcesses) {
            int minIndex = -1;
            int minBurst = Integer.MAX_VALUE;
            for (int i = 0; i < numberOfProcesses; i++) {
                if (at[i] <= currentTime && f[i] == 0 && remainingTime[i] < minBurst) {
                    minBurst = remainingTime[i];
                    minIndex = i;
                }
            }

            if (minIndex == -1) {
                currentTime++;
                continue;
            }

            remainingTime[minIndex]--;

            if (remainingTime[minIndex] == 0) {
                ft[minIndex] = currentTime + 1;
                completed++;
                f[minIndex] = 1;
                ta[minIndex] = ft[minIndex] - at[minIndex];
                wt[minIndex] = ta[minIndex] - bt[minIndex];
                avgwt += wt[minIndex];
                avgta += ta[minIndex];
            }
            currentTime++;
        }

        System.out.println("\nProcess    ArrivalTime       BurstTime      StartTime     FinishTime     TurnAroundTime    WaitingTime");
        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.println(pID[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + (ft[i] - bt[i]) + "\t\t" + ft[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
        }

        System.out.println ("\nAverage TAT - " + (float)(avgta / numberOfProcesses));
        System.out.println ("Average WT   - " + (float)(avgwt / numberOfProcesses));

        // Gantt Chart
        System.out.println("\n\nGantt Chart:");
        System.out.print(" ");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < bt[i]; j++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < bt[i] - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("P" + pID[i]);
            for (int j = 0; j < bt[i] - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < bt[i]; j++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
