import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many favorite things do you have? ");
        int numberOfThings = scanner.nextInt();
        scanner.nextLine();


        String[] favoriteThings = new String[numberOfThings];


        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.print("Enter favorite thing " + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }


        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.println(thing);
        }

        scanner.close();
    }
}
