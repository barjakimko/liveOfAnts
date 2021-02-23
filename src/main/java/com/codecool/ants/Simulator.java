package com.codecool.ants;

import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer width = 0;
        do {
            System.out.println("Enter board width (only odd numbers bigger than 10): ");
            width = scanner.nextInt();
        } while (width < 10 || width % 2 == 0);

        Colony colony = new Colony(width);
        colony.display();

        String userInput = "";
        while (!userInput.equals("q") && !userInput.equals("Q")) {

            System.out.println("Enter for next iteration / Q for exit");
            userInput = scanner.nextLine();

        }
    }

}
