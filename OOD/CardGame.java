import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

//design classes for card game
//create(), shuffle(), getCard()
//class: card, suit(4 types, enum class), face;
//class: cardSet a set of card 52
//deck: List<Card>

enum Suit{
  spade,
  club,
  heart,
  diamond
}

class Card{
  Suit suit;
  int face;
  public Card(Suit suit, int face){
    this.suit = suit;
    this.face = face;
  }
  
  @Override
  public String toString(){
    return String.format(this.suit + " " + face);
  }
}

class Deck{
  List<Card> list;
  int size;
  
  public Deck(){
    this.size = 0;
    list = new ArrayList<>();
    //create 52 cards, 13 each suit
    //go through each num suit, then go through 1-13 face value
    for(Suit suit : Suit.values()){
      for(int i = 1; i <= 13; i++){
        list.add(new Card(suit, i));
        size++;
      }
    }
  }
  
  //random funciton (0-51), get from list, card 
  //another list second/result, save the card into the second list
  //finally list = result; Space O(1), time O(1)
  public void shuffle(){
    List<Card> result = new ArrayList<>();
    Random random = new Random();
    
    for(int i = 0; i < size; i++){ //O(n) 
      int randIdx = random.nextInt(list.size()); //0-51, 0-50, ....0-2, 0-1, 0-0 for last card
      Card c = list.get(randIdx); //list.get(0) last card
      list.remove(randIdx); //remove from the old list
      result.add(c); //add to new list
    }
    list = result;
  }
  
  
//   public Card callCard(){
    
//   }
  
  public void printDeck(){
    for(Card c : list){
      c.toString();
    }
  }
}


class Solution {
  public static void main(String[] args) {
    Card c = new Card(Suit.spade, 1);
    c.toString();
    
    Deck d = new Deck();
    d.printDeck();
    System.out.println("==============================");
    d.shuffle();
    d.printDeck();
  }
}
