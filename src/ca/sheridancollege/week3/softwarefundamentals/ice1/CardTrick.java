
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Date - 29 January 2022
 * Student ID number - 991638279
 * @author Tarnvir Singh
 * @modified by Tarnvir Singh
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setSuit(c.SUITS[(int)(Math.random()*4)]);
            c.setValue((int)(1 + (Math.random()*13)));
            magicHand[i] = c;
            
        }
        Scanner input = new Scanner(System.in);
        Card c= new Card();
        
        System.out.print("Enter card number:");
        c.setValue(input.nextInt());
        
        System.out.print("Enter the suit; Hearts, Diamonds, Spades, Clubs : ");
        c.setSuit(input.next());
        
        boolean card = false;
        for(int i=0; i < magicHand.length; i++){
            if(magicHand[i].getValue()==c.getValue() && magicHand[i].getSuit().equalsIgnoreCase(c.getSuit())){
                card = true;
                break;
            }else{
                card = false;
            }
        }
        if(card){
            System.out.println("Card is inside stack.");
        }else{
            System.out.println("Card is not in Stack.");
        }
    }
    
    public static void printInfo(){
        System.out.println();
        System.out.println("Info:");
        String name = "Tarnvir Singh";
        int idNumber = 991638279;
        String info = "I am an international Student studying in second semester of Computer programming in Sheridan college. I am from India and I moved to canada in previous year.";
        System.out.println(name);
        System.out.println(idNumber);
        System.out.println(info);
    }
    
}
