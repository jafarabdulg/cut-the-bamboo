import java.util.Scanner;

public class Main {
    public static void showBamboos(int[] bamboos) {
        for (int bamboo : bamboos) {
            System.out.print("|");
            for (int i=0; i<bamboo; i++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] bamboos;
        int cutCycles;

        System.out.print("bamboos: ");
        String[] stringBamboos = scan.nextLine().split(",");
        bamboos = new int[stringBamboos.length];
        for (int i=0; i< stringBamboos.length; i++) {
            bamboos[i] = Integer.parseInt(stringBamboos[i]);
        }
        System.out.print("cuts: ");
        cutCycles = scan.nextInt();

        System.out.println("initials:");
        showBamboos(bamboos);

        for (int i=0; i<cutCycles; i++) {
            for (int k=0; k< bamboos.length; k++) {
                bamboos[k] = bamboos[k] - 1;
            }
            System.out.printf("cycle cuts: %d%n", i+1);
            showBamboos(bamboos);
        }
    }
}
