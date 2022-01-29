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
 * @author Harpuneet Kaur
 * Date - January 29. 2022
 * @modified by Harpuneet Kaur
 * Student id - 991627441
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        //Generating random cards for magicHand []
        for (int i =0, j=0; i <magicHand.length; i++)
        {
            Card c = new Card();
                        
            c.setValue((int)(1 + (Math.random() * 13))); 
			
	    j = (int)(Math.random() * 4);
            c.setSuit(c.SUITS[j]);
           
            magicHand[i] = c;
           
        }
        
        /*  
	 *  for (int i= 0; i<magicHand.length; i++)
	 *  {
	 *	System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());		 
         *  }
	*/
        
        //creating scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //generating c object
        Card c = new Card();
                
        //user input
        System.out.println("Enter your card number. Use 1 for Ace, 11 for Jack, 12 for Queen and 13 for King");
        c.setValue(input.nextInt());
        
        System.out.println("Enter your suit: Hearts, Diamonds, Spades, Clubs");
        c.setSuit(input.next());
        
        // checking the cards for similarity
        boolean cardValue = false;
        boolean cardSuit = false;
        
        for (int i =0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue() == c.getValue()) 
            {
                cardValue = true;
                break;
            }
            else
                cardValue = false;
        }
         
        for (int i =0; i<magicHand.length; i++)
        {        
	    if (magicHand[i].getSuit().equalsIgnoreCase(c.getSuit()))
            {
                cardSuit = true;
                break;
            }
            else
                cardSuit = false;
        }
        
	//output section	
        if (cardValue && cardSuit){
            System.out.println("You guessed it right. Your card was among the seven cards");
            printInfo();
        }
        else
            System.out.println("Sorry! you guessed it wrong");
        
    }
    
    public static void printInfo() 
    {
    
    }
    
}