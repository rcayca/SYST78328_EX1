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
 * @author Fatoumatta Dibba
 * @modified by Fatoumatta Dibba
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please select any number");
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             }
        for(int i=0; i<magicHand.length; i++){
            int index=(int)(Math.random() * magicHand.length);
            int temp=magicHand[i];
            magicHand[i]=magicHand[index];
            magicHand[index]=temp;
        }
        for(int i=0; i<magicHand.length; i++){
            String suit=suits[magicHand[i] / 13];
            String value=ranks[magicHand[i] % 13];
            System.out.println("Card Number " + magicHand[i] + ":" + value + "of" + suit);
        }
        System.out.println("Please select any number");
	   int x=input.nextInt();
	   if(x==deck.length){
		     System.out.println("the value is there");  
	   }
	   else{
		    System.out.println("The number you put is not in the random numbers");  
	   }
        private static void PrintInfo(String s){
        System.out.println("Hello! My name is Dipu Dodiya. I am studying Diploma in Computer Programming at Sheridan College");
    }
        
     }
    
}
