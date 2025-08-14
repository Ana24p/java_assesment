package PRActical_extrawork;

import java.util.*;

public class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String name, int innings, int notOut, int runs) {
        this.name = name;
        this.no_of_innings = innings;
        this.no_of_times_notout = notOut;
        this.total_runs = runs;
        this.bat_avg = 0.0;
    }

    static void avg(CricketPlayer p) {
        try {
            int dismissals = p.no_of_innings - p.no_of_times_notout;
            if (dismissals <= 0) {
                throw new ArithmeticException("Invalid average (not out every inning).");
            }
            p.bat_avg = (double) p.total_runs / dismissals;
        } catch (ArithmeticException e) {
            p.bat_avg = 0.0;
            System.out.println("Warning for " + p.name + ": " + e.getMessage());
        }
    }

    static void sortPlayer(CricketPlayer[] players) {
        Arrays.sort(players, new Comparator<CricketPlayer>() {
            public int compare(CricketPlayer p1, CricketPlayer p2) {
                return Double.compare(p2.bat_avg, p1.bat_avg); // descending order
            }
        });
    }

    void display() {
        System.out.printf("Name: %-15s  Innings: %2d  NotOut: %2d  Runs: %4d  Avg: %.2f\n",
                          name, no_of_innings, no_of_times_notout, total_runs, bat_avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for player " + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("No. of Innings: ");
            int innings = sc.nextInt();
            System.out.print("No. of Times Not Out: ");
            int notOut = sc.nextInt();
            System.out.print("Total Runs: ");
            int runs = sc.nextInt();

            players[i] = new CricketPlayer(name, innings, notOut, runs);
            avg(players[i]);
        }

        sortPlayer(players);

        System.out.println("\n--- Player Details Sorted by Batting Average ---");
        for (CricketPlayer p : players) {
            p.display();
        }

        sc.close();
    }
}

