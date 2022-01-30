/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * Ankit Kukreti
 * Student id: 991615176
 * 
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   
   // arg ctor for assigning obj of private data members
   public Card(String suit, int value)
   {
       /*
       this.suit = suit;
       this.value = value;
       */
       
       setSuit(suit);
       setValue(value);
   }
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    
    // print function
    public void printInfo()
    {
        System.out.println("Card found");
        
        // editing the print function on github
        System.out.println("Pushed the two Java files using Ankit_Kukreti_Ex1 branch"); 
    }
   
   
    
}
