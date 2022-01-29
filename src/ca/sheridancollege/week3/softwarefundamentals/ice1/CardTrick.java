/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Arun kumar
 * @modified by Arun kumar
 * Date:1/29/2022
 * Stuent number:991617387
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random a = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            

      int value = a.nextInt(13) + 1;
      c.setValue(value);
      int s = a.nextInt(Card.SUITS.length);
      c.setSuit(Card.SUITS[s]);
     magicHand[i] = c;
}
     Card input = new Card();
    Scanner scanner = new Scanner(System.in); 
  System.out.println("Please enter any number between 1 to 13:");
  int num = scanner.nextInt();
  input.setValue(num);
  System.out.println("Please select the card: \n1) Hearts \n2) Diamonds \n3) Spades \n4) Clubs");
  int o = scanner.nextInt();
  switch (o) {
case 1:
    System.out.println("Heart");
    break;
case 2:
    System.out.println("Diamond");
    break;
case 3:
    System.out.println("Spades");
    break;
case 4:
    System.out.println("Clubs");
    break;
}
  int count = 0;
  for (int i = 0; i < magicHand.length; i++) {
      if (magicHand[i].getValue() == input.getValue() && magicHand[i].getSuit() == input.getSuit()) {
          count++;
}
}
  if (count >= 1)
      PrintInfo("Card matched");
  
  else 
PrintInfo("Card not matched");
  

    
private static void PrintInfo(String string) {
    System.out.println(string);
    System.out.println("This  is Arun kumar");
}
}
             
        
         
    

