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
 * @author Jashanpreet Singh
 * @modified by Jashanpreet Singh
 * Student ID: 991651926
 */
public class CardTrick 
{
    
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
        Card c= new Card();
        
        System.out.println("pick a card number between 1-13:");
        int n = sc.nextInt();
        c.setValue(n);
        
        System.out.println("Pick 1 of the 4 suits:");
        String s = sc.next();
        c.setSuit(s);
        boolean result=true;
        
        for(int i=0; i< magicHand.length;i++)
        {
            if((magicHand[i].getValue()==c.getValue()) && (magicHand[i].getSuit().equalsIgnoreCase(c.getSuit())))
            {
                result=true;
               print("You Win");
            }
            else
            {
                result=false;
               print("You Lose, Try Again");
                
            }
        }
            
        
            printInfo();
    }      
            //I am done.
       public static void printInfo()
       {
           System.out.println(" I am Jashanpreet Singh, from Bangalore,India");
       }

    private static void print(String you_Lose_Try_Again) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
       
}
