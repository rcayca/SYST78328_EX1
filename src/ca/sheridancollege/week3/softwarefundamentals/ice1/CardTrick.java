/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Charmi Surati
 * Date:27-01-2022
 * @modified by Charmi Surati 
 * Student Num: 991630828
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random randomNum = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            int value = randomNum.nextInt(13) + 1;
            c.setValue(value);

            int suitVal = randomNum.nextInt(Card.SUITS.length);
            c.setSuit(Card.SUITS[suitVal]);
            magicHand[i] = c;
        }

        Card card = new Card();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number between 1 to 13:");
        int num = input.nextInt();
        card.setValue(num);

        System.out.println("Selec card:");
        System.out.println("1) Hearts");
        System.out.println("2) Diamonds");
        System.out.println("3) Spades");
        System.out.println("4) Clubs");

        int r = input.nextInt();
        switch (r) {
            case 1:
                card.setSuit("Hearts");
                break;
            case 2:
                card.setSuit("Diamonds");
                break;
            case 3:
                card.setSuit("Spades");
                break;
            case 4:
                card.setSuit("Clubs");
                break;
            default:
                System.out.println("You have selected wrong value");
        }

        int count = 0;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == card.getValue() && magicHand[i].getSuit() == card.getSuit()) {
                count++;
            }
        }

        if (count >= 1) {
            PrintInfo("Card is Matched");
        } else {
            PrintInfo("Card does not match");
        }
        input.close();
    }

    private static void PrintInfo(String s) {
        System.out.println(s);
    }
}
