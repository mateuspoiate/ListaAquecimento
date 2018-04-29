package ListaDeAquecimento;
public class Ex17
{
   public static void main ( String args [] )
   {
      int a[]={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
      int n = a.length;
      
      int b[] = new int [n];
      int m = 1; 
      int i; String saida = "Resposta:\n";
      
      int pos = 0;
      int vlr = a[0];
      for (i = 1; i < n; i++){
         if(a[i]==vlr && i<pos)
         //if(a[i]==vlr && i>pos)     Váriante do exercicio
            pos=i;
         if(a[i]<vlr){
            vlr=a[i];
            pos=i;
         }
      }
      
      b[0] = pos;
      
      for (i = 0; i < m; i++)
         saida = saida + b[i] + " ";
      saida = saida + "\nFim.";
   
      System.out.println(saida);
   
   //System.exit (0);
   }
}
