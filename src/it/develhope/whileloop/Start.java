package it.develhope.whileloop;


import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a command: ");
            String word = scanner.nextLine();
            System.out.println("You write the word: " + word.toUpperCase()); //toUpperCase non era richiesto ma volevo che fosse così

            if (word.equals("Stop"))
                break;
            // use a do-while so that you can always ask for the command first (because the condition is verified later)


        }
    }
}
