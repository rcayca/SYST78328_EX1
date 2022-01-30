/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 * @modified by Quang Dang
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        System.out.print(Arrays.toString(magicHand));
        for (int i=0; i<magicHand.length; i++)
            
            
        {
            Card c = new Card();
            magicHand[i] =c;
             }
             System.out.print("pick a card");
             int userCard = kb.nextInt();
             
             System.out.print("pick a suit");
             int userSuit = kb.nextInt();
        int randomSuit = 0;
             
             if( magicHand = userCard && magicHand = userSuit)
             {
                 System.out.print("Correct");
             } else {
                 System.out.print("Unfortunate");
             }
         }
    
}
