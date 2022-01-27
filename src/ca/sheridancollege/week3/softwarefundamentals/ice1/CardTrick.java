/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Dipu Dodiya
 * @ date modified 01/27/2022
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick 
{
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
            
            for (int i=0; i<magicHand.length; i++)
            {
        	Card c = new Card();
        	
        	Random randomGenerater = new Random();   
        	
        	int cardValueRandomNumber = randomGenerater.nextInt((13 - 1) + 1) + 1;            
                 c.setValue(cardValueRandomNumber);
            
                int cardValueRandomSuit = randomGenerater.nextInt(Card.SUITS.length);
                c.setSuit(Card.SUITS[cardValueRandomSuit]);

                magicHand[i] = c;
             //System.out.println(magicHand[i].getValue());
             //System.out.println(magicHand[i].getSuit());
            }        
        
            Card userHand = new Card();

            Scanner sc = new Scanner(System.in);

            System.out.println("Choose Card Number from 1 to 13");
            int userChoosenCardValue = sc.nextInt();            
            userHand.setValue(userChoosenCardValue);

            System.out.println("\nChoose Card Suit from:\n 1 = \"Hearts\"\n 2 = \"Diamonds\"\n 3 = \"Spades\"\n 4 = \"Clubs\"");
            int r1 = sc.nextInt();
            userHand.setSuit(Card.SUITS[r1-1]);

            //System.out.println(userHand.getValue());
           // System.out.println(userHand.getSuit());      
        
            int a = 0;
            for (int i=0; i<magicHand.length; i++)
            {
                if(magicHand[i].getValue() == userHand.getValue() && magicHand[i].getSuit() == userHand.getSuit())
                {
                    a++;
                }
            }
            if(a >= 1)
            {
                    PrintInfo("\nYour Card match is found in the hand of random cards :)");
            }
            else
            {
                    PrintInfo("\nYour Card match is not found in the hand of random cards :(");
            }
            sc.close();
        
        
    }
            private static void PrintInfo(String s) 
            {
		
                System.out.println(s);
            }
            
}
    

