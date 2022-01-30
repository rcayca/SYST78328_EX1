/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Renante Cajucom
 * @modified by Renante Cajucom
 * @date January 29, 2022
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
//            System.out.println("magicHand[" + i + "] = Value: " + magicHand[i].getValue() + " Suit: " + magicHand[i].getSuit());
        }
        
        System.out.println("Guess one of the 7 cards and win!");
        System.out.println("Select a card value 1 - 13");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.println("Select a suit. 1:Hearts 2:Diamonds 3:Spades 4:Clubs");
        int suit = input.nextInt();
        
        for (int i=0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit() == Card.SUITS[suit - 1] && magicHand[i].getValue() == value) {
                System.out.println("You guessed one of the cards!");
                break;
            } 
            
            if (i + 1 == magicHand.length) {
                System.out.println("You didn't guess any of the 7 cards.");
            }
        }
    }
    
    private static void PrintInfo() {
        System.out.println("My name is Renante Cajucom. I want to become a master coder.");
}
