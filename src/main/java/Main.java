import java.util.Scanner;

/**
 * Project 2: Build a Game With AI
 *
 * This file is a starting point, not a template. Rename it, restructure it,
 * delete all of this. The only thing that matters is that some class in this
 * folder has a main method and the whole thing compiles.
 *
 * Before you write any code you should know two things:
 *   - your house rule (README rule 1)
 *   - what one cell of your array holds
 *
 * Remember: one method that loops through your array carries the comment
 *   // NO AI: written entirely by me
 * and you will be asked to trace it.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Replace me with your game.");
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ". Now go build a game.");

        in.close();
    }
}
