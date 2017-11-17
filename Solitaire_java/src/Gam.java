
public class Gam {
	
	public ArrayList<ArrayList<Card>> game;
	
	public void initGame() {
		
		char signe;

		for(int i = 0; i < 4; i++)
		{
			if(i == 1)
				signe = A;
			if(i == 2)
				signe = B;
			if(i == 3)
				signe = C;
			if(i == 4)
				signe = D;
			
			for(int j = 0; j < 13; j++)
			{
				Card card = New Card(j, signe);
			}
		}
	}
}
