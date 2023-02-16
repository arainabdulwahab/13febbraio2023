import java.util.Scanner; // import the Scanner class
public class Tenth 
{
    public static void main(String[] args)   
    {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il primo numero ");
        float num1 = input.nextFloat(); // first value
        System.out.println("inserisci il secondo numero ");
        float num2 = input.nextFloat(); // second value
        System.out.println("risultato in::" + (num1%num2)); //first value % second value 
        input.close();
    } 
}
