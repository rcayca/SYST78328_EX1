
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Abhishek Bhattarai
 * @modified by Abhishek Bhattarai/991661668
 * 
 */
public class CardTrick {
    
public static void main(String[] args) {
    
           Scanner input = new Scanner(System.in);

        //Create an array to hold 7 cards
        Card[] magicHand = new Card[7];

    
        Random random = new Random();

       for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];

            Card card = new Card(value, suit);
            magicHand[i] = card;
        }

       
        System.out.println("Here are the cards in the hand");
        for (Card card : magicHand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        boolean match = false;
        for (Card card : magicHand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
    
        String response = match ? "Right guess": "No match";
        
        System.out.println(response);
    }
    
}
