import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bamboos;

        System.out.print("bamboos: ");
        bamboos = scan.nextLine().split(",");

        System.out.println("initials:");
        for (String bamboo : bamboos) {
            System.out.print("|");
            for (int i=0; i<Integer.parseInt(bamboo); i++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
