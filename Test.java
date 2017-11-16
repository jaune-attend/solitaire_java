package affichage;
import java.util.Scanner;

public class Test {

	private static char table [][];
	private int x,y;

	private char get(int i, int j)
	{
		return table[i][j];
	}

	private void initTab()
	{
		table = new char [50] [50];
	}

	public void aff(int table[][])
	{
		int a,b;
		
		a = 0;
		b = 0;
		
		while (b != y)
		{
			while (a != x)
			{
				System.out.println(table[b][a]);
				a++;
			}
			a = 0;
			y++;
		}
	}
	
	public static void main(String args[])
	{
		Scanner nb = new Scanner(System.in);
		
		int a, b;
		
		a = nb.nextInt();
		b = nb.nextInt();
		
		aff();
	}
}

//52 cartes dont 24 en pioches 
//7 colonnes : num colonnes - 1 pour les cartes non visible et 1 visibles 
