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
 * 
 * @author Rabjeet singh wirring
 * @date 29 January 2022
 * @modified by Rabjeet singh wirring
 * @student id - 991650674
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int a = (int)Math.random()*4;
            c.setSuit(c.SUITS[a]);
            
            int b = (int)(1+Math.random()*13);
            c.setValue(b);
            
            magicHand[i]=c;
        }
        
        Scanner sc = new Scanner(System.in);
        Card userCard = new Card();
        
        System.out.println("Pick the Card number : ");
        int n = sc.nextInt();
        userCard.setValue(n);
        
        System.out.println("Pick 1 from 4 Suits : ");
        String s = sc.next();
        userCard.setSuit(s);
        boolean status = true;
        
        for(int i=0; i< magicHand.length;i++)
        {
            if((magicHand[i].getValue()==userCard.getValue())&& (magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit())))
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
            
            if(status)
            {
                System.out.println("you are correct");
            }
            else 
            {
                System.out.println("You are Incorrect");
            }
       public static void printinfo()
       {
           System.out.println("My name is Rabjeet singh. ");
       }
        
    }
    
}
