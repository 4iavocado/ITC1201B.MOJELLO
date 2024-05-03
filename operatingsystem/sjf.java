package operatingsystem;
import java.util.Scanner;

public class sjf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();
        int pID[] = new int[n];
        int at[] = new int[n];
        int bt[] = new int[n];
        int ft[] = new int[n];
        int ta[] = new int[n];
        int wt[] = new int[n];
        int f[] = new int[n];
        int st[] = new int[n];

        float avgwt = 0, avgta = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " arrival time:  ");
            at[i] = sc.nextInt();
            System.out.print("Process " + (i + 1) + " burst time:    ");
            bt[i] = sc.nextInt();
            pID[i] = i + 1;
            f[i] = 0;
        }

        int tot = 0, time = 0;
        while(true) {
            int c = n, min = 999999;

            if(tot == n)
                break;

            for(int i = 0; i < n; i++) {
                if((at[i] <= time) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }
            }

            if(c == n)
                time++;
            else {
                st[c] = Math.max(time, at[c]); 
                ft[c] = st[c] + bt[c];
                time += bt[c];
                ta[c] = ft[c] - at[c];
                wt[c] = ta[c] - bt[c];
                f[c] = 1;
                pID[tot] = c + 1;
                tot++;
            }
        }

        System.out.println("\nProcess    ArrivalTime       BurstTime      StartTime     FinishTime     TurnAroundTime    WaitingTime");
        for(int i = 0; i < n; i++) {
            avgwt += wt[i];
            avgta += ta[i];
            System.out.println(pID[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + st[i] + "\t\t" + ft[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
        }

        System.out.println ("\nAverage TAT - " + (float)(avgta / n));
        System.out.println ("Average WT   - " + (float)(avgwt / n));

        // Gantt Chart
        System.out.println("\n\nGantt Chart:");
        for (int i = 0; i < n; i++) {
            System.out.print("  P" + pID[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(st[i] + "  ");
        }
        System.out.println(ft[n - 1]);

        for (int i = 0; i < n; i++) {
            for (int j = st[i]; j < ft[i]; j++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
