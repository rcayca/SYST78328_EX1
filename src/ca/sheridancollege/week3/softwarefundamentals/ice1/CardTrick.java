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
 * Date - January,29,2022
 * Student Id - 991651106
 * @author Parampreet Singh(sin11632)
 * @modified by Parampreet Singh
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
      Card[] magicHand = new Card[7];
    
         for (int sub =0;sub< magicHand.length;sub++)
         { Card c = new Card();
           c.setSuit(c.SUITS[(int)(Math.random()* 4)]);
           c.setValue((int)(1+ (Math.random() * 13 ) ) );
           magicHand[sub] = c; }
    
         Scanner input = new Scanner (System.in);
         Card c = new Card();
         System.out.println("Type a Card number : ");
         c.setValue(input.nextInt());
         System.out.println("Enter the suit :");
         c.setSuit(input.next());
    
         boolean deckCard = false;
    
         for (int count =0;count<magicHand.length;count++)
         {
         if(magicHand[count].getValue() == c.getValue() &&
            magicHand[count].getSuit().equalsIgnoreCase(c.getSuit()))
           {deckCard = true;break;}
         else
         {deckCard = false;}
         }
    
         if(deckCard)
         {System.out.println("You are correct");}
         else
         {System.out.println("Card doesnot match");}
     
      
     }
        public static void printInfo(){
        
    }
}
