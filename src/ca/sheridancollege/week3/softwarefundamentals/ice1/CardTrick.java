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
 * @modified by Khalid Adam
 * date : 01/29/2022
 * Student id=991491881
 * 
 */


import java.lang.Math;
import java.util.Scanner;
        
public class CardTrick {

    private static int i;
    
    public static void main(String[] args)
            
    {
    
        
        
        Card[] magicHand = new Card[7];
        
        
        for ( int i =0; i<magicHand.length; i++)
        {
            int p;
            Card c= new Card();
            c.setValue((int)( Math.random() *13));
            
            p=(int) (Math.random() * 4);
            
          c.setSuit(Card.SUITS[p]);
          
             magicHand[i]=c;
        }
        
        Scanner input= new Scanner(System.in);
         
        Card d= new Card();
        System.out.println("please Enter your card number,(ace is 1,king is 2, Queenis 3 and Jack is 4");
        d.setValue(input.nextInt());
        
        System.out.println("Enter the Suit: Hearts, Diamonds, Spades, Clubs");
        d.setSuit(input.next());
        
        
        if (magicHand[i].getSuit().equalsIgnoreCase(d.getSuit()) && d.getValue()== magicHand[i].getValue())
        {
          System.out.println("Your Cards Match");
          
            
        }
        else
        {
            
            System.out.println("Your cards dont match");
        }
      }
    public String PrintInfo(){
                    
         return "I'm done /n" + "My name is Khalid Adam and i am 23 years old";
         }
}
    


