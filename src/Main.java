import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bamboos;
        int cutCycles;

        System.out.print("bamboos: ");
        bamboos = scan.nextLine().split(",");
        System.out.print("cuts: ");
        cutCycles = scan.nextInt();

        System.out.println("initials:");
        for (String bamboo : bamboos) {
            System.out.print("|");
            for (int i=0; i<Integer.parseInt(bamboo); i++) {
                System.out.print("-");
            }
            System.out.println("");
        }

        for (int i=0; i<cutCycles; i++) {
            System.out.printf("cycle cuts: %d%n", i+1);

            for (String bamboo : bamboos) {
                System.out.print("|");
                for (int j=0; j<Integer.parseInt(bamboo)-(i+1); j++) {
                    System.out.print("-");
                }
                System.out.println("");
            }
        }
    }
}
