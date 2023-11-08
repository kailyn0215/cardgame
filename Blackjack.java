import java.util.ArrayList;

public class Blackjack 
{
    ArrayList<Cards> deck = new ArrayList<Cards>();

    ArrayList<Cards> p1 = new ArrayList<Cards>();
    ArrayList<Cards> p2 = new ArrayList<Cards>();
    ArrayList<Cards> p3 = new ArrayList<Cards>();
    ArrayList<Cards> p4 = new ArrayList<Cards>();
    ArrayList<Cards> p5 = new ArrayList<Cards>();
    ArrayList<Cards> p6 = new ArrayList<Cards>();
    ArrayList<Cards> p7 = new ArrayList<Cards>();

    ArrayList<Cards> dealer = new ArrayList<Cards>();

    public Blackjack(ArrayList<Cards> deck)
    {
        this.deck = deck;
    }
    
    public void autoWin()
    {
        // if the player gets an ace and face card/10 when cards are dealt then they win automatically
    }

    public void deal(int numPlayers, int numCards)
    {
        for(int x = 0; x < numCards; x++)
        {
            p1.add(deck.get(0)); // adds a card to player 1's hand
            deck.remove(0);
            if(x == 1)
            {
                System.out.println("Player 1's hand: " + p1.toString() + "\n");
            }
            if(numPlayers > 1)
            {
                p2.add(deck.get(0)); // p2's hand
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 2's hand: " + p2.toString() + "\n");
                }
            }
            if(numPlayers > 2)
            {
                p3.add(deck.get(0)); // 3
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 3's hand: " + p3.toString() + "\n");
                }
            }
            if(numPlayers > 3)
            {
                p4.add(deck.get(0)); // 4
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 4's hand: " + p4.toString() + "\n");
                }                
            }
            if(numPlayers > 4)
            {
                p5.add(deck.get(0)); // 5
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 5's hand: " + p5.toString() + "\n");
                }               
            }
            if(numPlayers > 5)
            {
                p6.add(deck.get(0)); // 6
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 6's hand: " + p6.toString() + "\n");
                }               
            }
            if(numPlayers > 6)
            {
                p7.add(deck.get(0)); // 7
                deck.remove(0);
                if(x == 1)
                {
                    System.out.println("Player 7's hand: " + p7.toString() + "\n");
                }   
            }
        }
    }
}
