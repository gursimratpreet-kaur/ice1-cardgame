/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @Modifier Gursimratpreet Kaur
 * Student ID 991845418
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            c.setValue(random.nextInt(1,13));
            c.setSuit(Card.SUITS[random.nextInt(1,3)]);
            System.out.println(c.getSuit()+" "+c.getValue());
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a card value(1-13) : ");
        int userValue =  k.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades)");
        int userSuit = k.nextInt();
        String userSuitNew= Card.SUITS[userSuit];

        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Diamonds");
          for(Card c : magicHand){
            if(c.getValue()== userValue){
                if(userSuitNew.equals(c.getSuit())){
                    System.out.println("Your card is in the magic hand");
                }
                else{
                    System.out.println("Sorry, Your card is not in the magic hand.");
                }
            }
          }
    }
    
}
