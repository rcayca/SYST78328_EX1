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
 * @author dancye, Haitham Mohamed
 * @modified by Megha Patel, Haitham Mohamed
 * @StudentNumber 991630683
 * Date:January 28, 2022
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
         Scanner hai = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {            
            Card c = new Card();
            
            c.setSuit(Card.SUITS[(int)Math.round(Math.random()*3)]); //setting the suit randomly
            String suit = c.getSuit();
            
            c.setValue((int)Math.round(1 + Math.random()*12)); //setting the value of the card randomly
            int num = c.getValue();
            
            magicHand[i] = c; //adding the card object into the array
            
           // System.out.println(num + suit); //Printed the cards for debugging.
        }
           
        //Asking user for a card
        System.out.println("Enter the suit for the card (The first Letter must be Capital)");
        String usuit = hai.nextLine();
        
        System.out.println("Pick a card number from 1 to 13");
        int ucard = hai.nextInt();
        
        System.out.println("The card you picked is the "+ucard+ " of "+usuit);
        int tally = 0; //this is used for checking
        
        for(int i = 0; i < magicHand.length;i++)
        {
            if(usuit.equalsIgnoreCase(magicHand[i].getSuit()) && ucard == magicHand[i].getValue())
            {
                tally++;
                break;
            }
           
        }
        
        if(tally >= 1)
        {
            System.out.println("That card is in the magic hand!");
        }
        else
        {
            System.out.println("Sorry, that card was not in the hand.");            
        }
        
        
        //Below is the code edited using GitHub.
        System.out.println("Thank you for playing");
        System.out.println("This code was edited by Haitham Mohamed");
        //I'm Done
    }
    
}

