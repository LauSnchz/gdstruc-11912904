package com.laurencesanchez;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedCardStack deckStack = new LinkedCardStack();
        LinkedCardStack handStack = new LinkedCardStack();
        LinkedCardStack discardedStack = new LinkedCardStack();

        for(int i = 0; i < 2; i ++) {
            deckStack.push(new Cards("Joker " + i));
            deckStack.push(new Cards("King " + i));
            deckStack.push(new Cards("Queen " + i));
            deckStack.push(new Cards("Jack " + i));
            deckStack.push(new Cards("DoomsDale " + i));
            deckStack.push(new Cards("Sphinx " + i));
            deckStack.push(new Cards("BKNinja " + i));
            deckStack.push(new Cards("SunCheese " + i));
            deckStack.push(new Cards("Nika " + i));
            deckStack.push(new Cards("JanTheSeal " + i));
            deckStack.push(new Cards("Gudetamax " + i));
            deckStack.push(new Cards("Izzavibes " + i));
            deckStack.push(new Cards("Leeroy " + i));
            deckStack.push(new Cards("Juswa " + i));
            deckStack.push(new Cards("Chonkers " + i));
        }

        //deckStack.printStack();

        while(!deckStack.isEmpty())
        {
            generateTurn(deckStack,handStack, discardedStack);

            // After each round, display the ff
            handStack.printStack(); // List of cards that the player is currently holding
            System.out.println("\nRemaining Cards in the Deck: " + deckStack.getStackSize()); // Number of remaining cards in the player deck
            System.out.println("\nRemaining Cards in the Discarded Deck: " + discardedStack.getStackSize());// Number of cards in the discarded pile

            systemPause(); // own generated system pause
        }

        System.out.println("Deck is now empty!");
    }

    public static void generateTurn(LinkedCardStack deckStack,
                                    LinkedCardStack handStack,
                                    LinkedCardStack discardedStack)
    {
        Random random = new Random();
        int randomTurn = random.nextInt(3);
        int randomValue = random.nextInt(5 - 1 + 1) + 1;

        System.out.println("Value Rolled: " + randomValue);
        System.out.println("\nTurn: " + randomTurn);

        if(randomTurn == 0) // Draw x cards (x can be a random value from 1 to 5
        {
            if(randomValue > deckStack.getStackSize())
            {
                randomValue = deckStack.getStackSize();
            }
            for(int i = 0; i < randomValue; i++)
            {
                Cards drawnCard = deckStack.peek();
                System.out.println("Card drawn: " + deckStack.peek());
                handStack.push(drawnCard);
                deckStack.pop();
            }
        }

        else if(randomTurn == 1) // Discard x cards
        {
            if(handStack.isEmpty())
            {
                System.out.println("Hand is currently empty!");
                return;
            }

            if(randomValue > handStack.getStackSize())
            {
                randomValue = handStack.getStackSize();
            }
            for(int i = 0; i < randomValue; i++)
            {
                Cards cardRemoved = handStack.peek();
                System.out.println("Card discarded: " + cardRemoved);
                discardedStack.push(cardRemoved);
                handStack.pop();
            }
        }

        else if(randomTurn == 2) // Get x cards from the discarded stack
        {
            if(discardedStack.isEmpty())
            {
                System.out.println("Discarded Stack is currently empty!");
                return;
            }

            if(randomValue > discardedStack.getStackSize())
            {
                randomValue = discardedStack.getStackSize();
            }
            for(int i = 0; i < randomValue; i++)
            {
                Cards drawnCard = discardedStack.peek();
                System.out.println("Card drawn from Discarded Stack: " + drawnCard);
                handStack.push(drawnCard);
                discardedStack.pop();
            }
        }
    }

    public static void systemPause()
    {
        System.out.print("\nEnter any number to continue: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\n\n");
    }
}