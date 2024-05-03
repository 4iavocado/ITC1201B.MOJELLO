package operatingsystem;
import java.util.*;

public class RoundRobin {
    static class Process {
        String name;
        int burstTime;
        int remainingTime;
        int startTime;
        int endTime;

        public Process(String name, int burstTime) {
            this.name = name;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.startTime = -1; // Indicates the process hasn't started yet
            this.endTime = -1; // Indicates the process hasn't finished yet
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes.add(new Process("P" + (i + 1), burstTime));
        }

        System.out.print("Enter time quantum: ");
        int quantum = scanner.nextInt();

        roundRobinScheduling(processes, quantum);

        scanner.close();
    }

    static void roundRobinScheduling(List<Process> processes, int quantum) {
        Queue<Process> queue = new LinkedList<>(processes);
        int currentTime = 0;

        System.out.println("\nRound Robin Scheduling:");
        System.out.println("Process\t| Start Time\t| End Time");

        while (!queue.isEmpty()) {
            Process currentProcess = queue.poll();
            if (currentProcess.startTime == -1) {
                currentProcess.startTime = currentTime;
            }

            System.out.println(currentProcess.name + "\t| " + currentProcess.startTime + "\t\t| " + (currentTime + Math.min(currentProcess.remainingTime, quantum)));

            // Execute the process for quantum time
            if (currentProcess.remainingTime > quantum) {
                currentTime += quantum;
                currentProcess.remainingTime -= quantum;
                queue.add(currentProcess); // Re-add the process to the end of the queue
            } else {
                currentTime += currentProcess.remainingTime;
                currentProcess.remainingTime = 0;
                currentProcess.endTime = currentTime;
            }
        }

        // Calculate and print average turnaround time
        double totalTurnaroundTime = 0;
        for (Process p : processes) {
            totalTurnaroundTime += p.endTime - p.startTime;
        }
        double averageTurnaroundTime = totalTurnaroundTime / processes.size();
        System.out.printf("\nAverage Turnaround Time: %.2f", averageTurnaroundTime);
    }
}
