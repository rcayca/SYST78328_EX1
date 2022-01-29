/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

// Import under here
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Student Number: 991625734
 * @author Ilyas Bouchalkha
 * @since Jan 26, 2022
 * @modified by Ilyas Bouchalkha
 * 
 */
public class CardTrick {

    // Create Object
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        Card[] myCards = new Card[7];
        
        for (int index = 0; index < myCards.length; index++) {

            // Create Object
            Card card = new Card();

            // Setting Properties/Data Fields
            card.setSuit(Card.SUITS[(int)((Math.random() * (4 - 0)) + 0)]);
            card.setValue((int)((Math.random() * (14 - 1)) + 1));

            myCards[index] = card;
        }

        System.out.println("Please pick a card, any card");

        // Prompt the User
        System.out.print("Please input the suit: ");
        String suit = scan.nextLine();

        System.out.print("Please input the card value: ");
        int value = Integer.parseInt(scan.nextLine());

        for (Card card : myCards) {

            if (card.getSuit().toLowerCase().equals(suit.toLowerCase()) && card.getValue() == value) {

                printInfo(card);
            }
        }
    }

    // Other Behaviours/Methods
    public static void printInfo(Card card) {

        System.out.printf("Card: %s, %d", card.getSuit(), card.getValue());
        System.out.println("Full Name: Ilyas Bouchalkha" + "\nStudent Number: 991625734");
    }
}
