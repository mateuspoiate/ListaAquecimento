package ListaDeAquecimento;
public class Ex15
{
   public static void main ( String args [] )
   {
      int a[]={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
      int n = a.length;
      
      int b[] = new int [n];
      int m = b.length; 
      int i; String saida = "Resposta:\n";
      
      int aux = n-1;
      for (i = 0; i < m; i++){
         b[i]=a[aux];
         aux--;
      }
      for (i = 0; i < m; i++)
         saida = saida + b[i] + " ";
      saida = saida + "\nFim.";
   
      System.out.println(saida);
   
   //System.exit (0);
   }
}
