import java.util.*;

public class Driver
{
	public static void main(String args[])
	{
		ArrayList<Cards> deck = new ArrayList<Cards>();
		ArrayList<Cards> discard = new ArrayList<Cards>();
		
		ArrayList<Cards> p1 = new ArrayList<Cards>();
		ArrayList<Cards> p2 = new ArrayList<Cards>();
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				Cards c1 = new Cards(suits[i], values[j]);
				deck.add(c1);
			}
		}	
		
		for (int x = 0; x < 10; x++) // gives 10 cards
		{
			int y = (int)(Math.random() * 52); // gets random number between 0 and 51
			p1.add(deck.get(x));
			for (Cards check : p1)
			{
				while(check.equals(p1.get(x)))
				{
					p1.remove(x);
					y = (int)(Math.random() * 52);
				}
			}
		}
	}
	
	public void draw(int game)
	{
		
	}
}
