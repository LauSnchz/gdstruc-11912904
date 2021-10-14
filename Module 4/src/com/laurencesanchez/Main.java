package com.laurencesanchez;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ArrayQueue queue = new ArrayQueue(7);
        Random random = new Random();

        int rounds = 1;

        while(rounds < 11)
        {
            // random add queue from 1-7
            while(queue.size() < 5)
            {
                addPlayer(queue, random);
            }
            System.out.println("\nGame started! \n");
            System.out.println("Removing 5 players");

            for(int i = 0; i < 5; i++)
            {
                System.out.println("Removed: " + queue.remove());
            }

            System.out.println("Round " + rounds + " over");
            rounds++;
            systemPause();
        }

        System.out.println("Game has ended");
    }

    public static void addPlayer(ArrayQueue queue, Random random)
    {
        int randomPlayers = random.nextInt(7 - 1 + 1) + 1;

        for(int i = 0; i < randomPlayers; i++)
        {
            queue.add(new Player(0 + i, "Player " + i, 100));
        }

        System.out.println("\nPlayers added to the queue: ");
        queue.printQueue();
    }

    public static void systemPause()
    {
        System.out.print("\nPress enter to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\n\n");
    }
}
