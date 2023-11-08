public class Cards
{
	String suit;
	String value;
	
	public Cards(String suits, String values)
	{
		this.suit = suits;
		this.value = values;
	}
	
	public String toString()
	{
		return (value + " of " + suit);
	}

	
}
