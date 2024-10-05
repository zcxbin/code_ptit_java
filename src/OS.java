import java.util.Scanner;

public class OS {

    // FCFS scheduling algorithm
    public static void fcfs(int[] processes) {
        int n = processes.length;
        int[] waitingTime = new int[n];
        int totalWaitingTime = 0;

        // Calculate waiting time for each process
        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + processes[i - 1];
            totalWaitingTime += waitingTime[i];
        }

        double avgWaitingTime = (double) totalWaitingTime / n;

        System.out.println("\nFCFS:");
        System.out.print("Thời gian chờ của mỗi tiến trình: ");
        for (int time : waitingTime) {
            System.out.print(time + " ");
        }
        System.out.printf("\nThời gian chờ đợi trung bình: %.2f\n", avgWaitingTime);
    }

    // Round Robin scheduling algorithm
    public static void roundRobin(int[] processes, int quantum) {
        int n = processes.length;
        int[] remainingTime = processes.clone();
        int[] waitingTime = new int[n];
        int totalWaitingTime = 0;
        int time = 0;

        while (true) {
            boolean done = true;

            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    done = false;
                    if (remainingTime[i] > quantum) {
                        time += quantum;
                        remainingTime[i] -= quantum;
                    } else {
                        time += remainingTime[i];
                        waitingTime[i] = time - processes[i];
                        remainingTime[i] = 0;
                    }
                }
            }

            if (done) {
                break;
            }
        }

        for (int wt : waitingTime) {
            totalWaitingTime += wt;
        }
        double avgWaitingTime = (double) totalWaitingTime / n;

        System.out.println("\nRound Robin (quantum = 3):");
        System.out.print("Thời gian chờ của mỗi tiến trình: ");
        for (int timeValue : waitingTime) {
            System.out.print(timeValue + " ");
        }
        System.out.printf("\nThời gian chờ đợi trung bình: %.2f\n", avgWaitingTime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3; // Số tiến trình
        int[] processes = new int[n];

        // Nhập thời gian yêu cầu CPU của mỗi tiến trình từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập thời gian yêu cầu CPU của tiến trình " + (i + 1) + ": ");
            processes[i] = scanner.nextInt();
        }

        // FCFS
        fcfs(processes);

        // Round Robin với quantum = 3
        int quantum = 3;
        roundRobin(processes, quantum);
    }
}
