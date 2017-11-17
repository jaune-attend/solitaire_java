
public class Card {

	public boolean red;
	public boolean visible;
	public int value;
	public char color;
		
	public Card(int value, char color) {
		
		this.visible = false;
		this.value = value;
		this.color = color;
	}
	
	public boolean getRed()
	{
		return this.red;
	}
	
	public boolean getVisible() 
	{	
		return this.visible;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public char getColor()
	{
		return this.color;
	}
	
	public void setRed(boolean red)
	{
		this.red = red;
	}
	
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public void setColor(char color)
	{
		this.color = color;
	}
	
	
	
	public boolean compareValue(Card card) {
		
		if(this.value < card.getValue())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean compareRed(Card card)
	{
		if(this.red != card.getRed())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean compareColor(Card card)
	{
		if(this.color == card.getColor())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
