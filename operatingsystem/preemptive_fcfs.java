package operatingsystem;
import java.util.Scanner;

public class preemptive_fcfs {
    
    static class Process {
        int id;
        int arrivalTime;
        int burstTime;
        int startTime;
        int finishTime;
        int turnaroundTime;
        int waitingTime;
        int remainingTime;

        Process(int id, int arrivalTime, int burstTime) {
            this.id = id;
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the number of processes: ");
        Scanner sc = new Scanner(System.in);
        int numberOfProcesses = sc.nextInt();

        Process[] processes = new Process[numberOfProcesses];

        for(int i = 0; i < numberOfProcesses; i++) {
            System.out.print("Process " + (i+1) + " arrival time:    ");
            int arrivalTime = sc.nextInt();
            System.out.print("Process " + (i+1) + " burst time:      ");
            int burstTime = sc.nextInt();
            processes[i] = new Process(i + 1, arrivalTime, burstTime);
        }

        System.out.println("\nGantt Chart:");
        
        // Display Gantt Chart
        System.out.print(" ");
        for (Process process : processes) {
            for (int i = 0; i < process.burstTime; i++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("|");
        for (Process process : processes) {
            for (int i = 0; i < process.burstTime - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("P" + process.id);
            for (int i = 0; i < process.burstTime - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.print(" ");
        for (Process process : processes) {
            for (int i = 0; i < process.burstTime; i++) {
                System.out.print("--");
            }
            System.out.print(" ");
        }
        System.out.println();

         // Calculate turnaround time and waiting time
         float totalTurnaroundTime = 0;
         float totalWaitingTime = 0;
         for (Process process : processes) {
             process.turnaroundTime = process.finishTime - process.arrivalTime;
             process.waitingTime = process.turnaroundTime - process.burstTime;
             totalTurnaroundTime += process.turnaroundTime;
             totalWaitingTime += process.waitingTime;
         }
 
         float averageTurnaroundTime = totalTurnaroundTime / numberOfProcesses;
         float averageWaitingTime = totalWaitingTime / numberOfProcesses;
         System.out.println("\nAverage Turnaround Time: " + averageTurnaroundTime);
         System.out.println("Average Waiting Time: " + averageWaitingTime);
 

        sc.close();
    }
}
