import java.util.Scanner;

public class VisualNovelGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mikey's Beach Adventure!!");
        System.out.println("Event 1: Mikey is given a choice for the straw of his boba drink. Either plastic or paper straw.");
        System.out.println("1. Choose the plastic straw.");
        System.out.println("2. Choose the paper straw.");
        int choice = scanner.nextInt();

        if (choice == 2) {
            System.out.println("Event 2: Mikey just finished his boba drink. There's a trash bin nearby but he has to walk under the scorching sun to get there. But he could just leave the cup on the floor near a sign and hope that someone throws it for him.");
            System.out.println("1. Bear the heat and throw the cup into the can.");
            System.out.println("2. Leave the cup on the floor near a sign.");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Event 3: Mikey saw a person from school let laziness overcome them, and left their litter on the ground near them. What will Mikey do?");
                System.out.println("1. Pick it up after them and throw it into the trash bin nearby.");
                System.out.println("2. Just ignore them and go on your merry way.");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Congratulations! You did your part in keeping the sea cleaner than before.!");
                } else {
                    System.out.println("Regardless of the litter being someone else's fault, we must always pick up after them since it still affects the environment.");
                    System.out.println("Game Over!");
                }
            } else {
                System.out.println("As soon as you left the cup, it got swept away by the wind. It then got blown away into the ocean as it joins a heap of other plastic litter floating at the ocean.");
                System.out.println("Game Over!");
            }
        } else {
            System.out.println("Choosing to use a plastic straw is bad for the environment! It can cause many sea-life to get hurt.");
            System.out.println("Game Over!");
        }
    }
}