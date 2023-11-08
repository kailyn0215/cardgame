import java.util.*;

public class Driver
{
    /*public Driver(ArrayList<Cards> deck, ArrayList<Cards> discard, ArrayList<Cards> p1, ArrayList<Cards> p2)
    {
        deck = ArrayList<Cards>();
    }*/
    public static void main(String args[])
	{
        ArrayList<Cards> deck = new ArrayList<Cards>();
        //ArrayList<Cards> discard = new ArrayList<Cards>();

        //ArrayList<ArrayList<Cards>> players = new ArrayList<ArrayList<Cards>>();

        /*ArrayList<Cards> p1 = new ArrayList<Cards>();
        ArrayList<Cards> p2 = new ArrayList<Cards>();
        ArrayList<Cards> p3 = new ArrayList<Cards>();
        ArrayList<Cards> p4 = new ArrayList<Cards>();

        ArrayList<Cards> dealer = new ArrayList<Cards>();*/

		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numPlayers;
        boolean game = false;
        boolean again = false;

        System.out.print("Please input the number of players: ");
        Scanner input = new Scanner(System.in);
        numPlayers = input.nextInt();
        System.out.print("\n\n");
		
		for (int i = 0; i < 4; i++) // creates a deck of cards
		{
			for (int j = 0; j < 13; j++)
			{
				Cards c1 = new Cards(suits[i], values[j]);
				deck.add(c1);
			}
		}	

        Collections.shuffle(deck);
        
        Blackjack g1 = new Blackjack(deck);


        g1.deal(numPlayers, 2);
		
		/* for (int x = 0; x < 10; x++) // gives 10 cards
		{
			p1.add(deck.get(x));
		}
        for (int y = 0; y < 10; y++) // gives 10 cards
		{
			p2.add(deck.get(y));
        } */ //blackjack
	}


}
