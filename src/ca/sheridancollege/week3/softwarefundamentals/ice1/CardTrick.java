/*
 * Date 2022-01-27
 * Student number 991654114
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Sachin Virdi
 */
public class CardTrick {
    
public static void main(String[] args) {
Card[] magicHand = new Card[7];
Random r = new Random();
for (int i = 0; i < magicHand.length; i++) {
Card c = new Card();
int value = r.nextInt(13) + 1;
c.setValue(value);
int s = r.nextInt(Card.SUITS.length);
c.setSuit(Card.SUITS[s]);
magicHand[i] = c;
}
Card ab = new Card();
Scanner scanner = new Scanner(System.in); 
System.out.println("Please enter any number between 1 to 13:");
int num = scanner.nextInt();
ab.setValue(num);
System.out.println("Please select the card: \n1) Hearts \n2) Diamonds \n3) Spades \n4) Clubs");
int r = scanner.nextInt();
switch (r) {
case 1:
ab.setSuit("Hearts");
break;
case 2:
ab.setSuit("Diamonds");
break;
case 3:
ab.setSuit("Spades");
break;
case 4:
ab.setSuit("Clubs");
break;
}
int count = 0;
for (int i = 0; i < magicHand.length; i++) {
if (magicHand[i].getValue() == ab.getValue() && magicHand[i].getSuit() == ab.getSuit()) {
count++;
}
}
if (count >= 1)
PrintInfo("Card is matched");
else 
PrintInfo("Card is not matched");
    
private static void PrintInfo(String string) {
System.out.println(string);
System.out.println("My name is Sachin Virdi and I' m from Brampton. Currently, I am studying computer programming at Sheridan college.");
}
}
