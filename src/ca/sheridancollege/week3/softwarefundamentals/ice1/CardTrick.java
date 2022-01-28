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
 * @author Nandini Patel
 * Date January 27,2022
 * @modified by Nandini Patel
 * Student ID: 991622118
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int value;
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int random = ((int)(Math.random()*13) +1);
            c.setValue(random);
            int randomSuit=(int) (Math.random()*3);
            c.setSuit (Card.SUITS[randomSuit]);
            magicHand[i] = c;
             }
         Scanner s = new Scanner (System.in);
      System.out.println(" Pick a card");
      value = s.nextInt();
      System.out.println("Pick a Suit");
      String suit = s.next();
      Card Win= new Card ();
      Win.setValue (4);
      Win.setSuit ("Hearts");
      boolean result = true;
      if (suit == Win.getSuit() && value == Win.getValue()) {
            result = true;
            System.out.println("You win");

        } else {
            result = false;
            System.out.println("Try again");
        }
        
         }
    
}
