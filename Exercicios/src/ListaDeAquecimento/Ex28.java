package ListaDeAquecimento;

public class Ex28 {
	public static void main ( String args [] )
	{
	
	int a [] = 
	{32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

	int n = a.length;
	
	int b [] = new int [n];
	int m = 2;
	int i;
	
	int pos=0;
	for(i=1; i<n-1; i++){
        int med = (a[i-1]+a[1+i])/2;
		if(med==a[i]){
        	b[pos]=i;
        	pos++;
        }
    }
	
	
	String saida = "Resposta:\n";

	for (i = 0; i < m; i++)
	saida = saida + b[i] + " ";
	saida = saida + "\nFim.";

	System.out.println(saida);

	//System.exit (0);
	}
}
