/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/*
 * Name: Ankit Kukreti
 * Student id: 991615176
 */



public class CardTrick 
{
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i< magicHand.length; i++)
        {
          //  Card c = new Card();
            int index;
            String str;
            int value;
      
            do
            {
                index = new Random().nextInt(Card.SUITS.length);
                str = (Card.SUITS[index]);
                // (Math.random() * (max - min + 1)) + min;
                value =  (int)  (Math.random()* (13 - 1 +1)) +1;
               
                /*
                magicHand[i].setSuit(str);
                magicHand[i].setValue(value);  
                */
                magicHand[i] = new Card(str, value);
                
               
            }while(str!= magicHand[i].getSuit() && value!= magicHand[i].getValue());
          
        }

        System.out.println("Cards in hand are: ");
        for(int i=0; i< magicHand.length; i++)
            System.out.println(magicHand[i].getSuit() + " " +magicHand[i].getValue());
         
        Scanner ip = new Scanner(System.in);
        System.out.println("Guess the card in the hand: ");
        System.out.print("Type either of these options - Hearts or Diamonds or Spades or Clubs: " );
        String str = ip.next();

        System.out.print("Now guess the value (1-13) for the above selected type: ");
        int value = ip.nextInt();

        for(int i=0; i< magicHand.length; i++)
        {
            if(str.equals(magicHand[i].getSuit()) && value == magicHand[i].getValue())
                magicHand[i].printInfo();
        }
    ip.close();  
    }
}
    
    