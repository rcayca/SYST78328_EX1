/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mandeep Kaur
 * @date 29th JAN 2020
 * @StudentNum 8119935
 * @modified by Mandeep Kaur
 * 
 */
public class CardTrick {
    static String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    static int numberOfValues = 13;
    static int numberOfSuits = 4;

    public static Card pickACard() {
        Random r = new Random();
	int value;
        value = r.nextInt(numberOfValues) + 1;
    	int suit;
        suit = r.nextInt(numberOfSuits);
    	Card c =  new Card();
    	c.setSuit(SUITS[suit]);
    	c.setValue(value);
    	return c;
		
	}
    public static void main(String[] args)
    {
        int value;
    	int suit;
        Card[] magicHand = new Card[7];
        Random r = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            value = r.nextInt(numberOfValues) + 1;
            suit = r.nextInt(numberOfSuits);
            Card c = new Card();
            c.setSuit(SUITS[suit]);
            c.setValue(value);
            magicHand[i] = c;
        }

         Card card = pickACard();
        
       
        for (int i=0; i<magicHand.length; i++)
        {
        	if(magicHand[i].getSuit() == card.getSuit() && magicHand[i].getValue() == card.getValue()) {
        		printInfo();
        		break;
        	}
        }
        
    }

	private static void printInfo() {
            System.out.println("Yes");
	}
        
    
}
