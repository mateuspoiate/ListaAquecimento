package ListaDeAquecimento;

public class Ex26 {
	public static void main ( String args [] )
	{
	
	int a [] = 
	{32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

	int n = a.length;
	
	int b [] = new int [n];
	int m = 12;
	int i;
	
	int pos =0;
	//int aux =0;
	for(i=0; i<n; i++){
        if(a[i]<50) {
        	b[pos] = i;
        	pos++;
        }
    }
	
	int maior;
	for (i = 0; i < n -1; i++ ) {
		maior = i;
		for ( int j = i + 1; j < n; j++ )
			if ( b [ j ] > b [ maior ] )
				maior = j;
	int aux = b [ i ];
	b [ i ] = b [maior];
	b [ maior ] = aux;
	}
	
	String saida = "Resposta:\n";

	for (i = 0; i < m; i++)
	saida = saida + b[i] + " ";
	saida = saida + "\nFim.";

	System.out.println(saida);

	//System.exit (0);
	}
}
