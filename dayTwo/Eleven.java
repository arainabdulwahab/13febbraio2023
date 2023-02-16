import java.util.Scanner; // import the Scanner class
public class Eleven 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci primo numero ");
        int x = in.nextInt();
        System.out.println("inserisci secondo numero ");
        int y = in.nextInt();

        
        boolean risultato = x >y && (x ==0  || y ==0) ;
        String checkPariOrDispari = x % 2==0 ? " pari " : " dispari";
        System.out.println("il risultato e : " + risultato + checkPariOrDispari);
        in.close(); 
        
    
    }
}