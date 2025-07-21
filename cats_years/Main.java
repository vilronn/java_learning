import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of your cat:");

        int number = sc.nextInt();
        int cat_age = 0;
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                cat_age = 15; // First cat`s year is equivalent to 15 human years
            } else if (i == 1) {
                cat_age = 24; // Second cat`s year is equivalent to 9 human years
            } else {
                cat_age += 4; // Others cat's years are equivalent to 4 human years each
            }

        }

        System.out.println("Your cat is " + cat_age + " cat`s years old.");
        sc.close();
    }
}
