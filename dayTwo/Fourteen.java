import java.util.Scanner; // import the Scanner class
public class Fourteen 
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("inserisci un numero ");
       int num1 = input.nextInt(); // read first value 
       System.out.println("inserisci il secondo numero");
       int num2 = input.nextInt(); // read second value 
       String result = ""; // string where result are stored
       System.out.println("che operazione poi fare *, +, -, %");
       char chInput = input.next().charAt(0); // read user input for operator
       // verify operators ed fa i calcoli rispettivi ... otherwise run default value
       switch(chInput)
       {
            case '*':
                result += num1 * num2;
            break;
            case '+':
                 result += num1 + num2;
            break;
            case '-':
                result   += num1 - num2;
            break;
            case '%':
                result += num1 % num2;
            break;
            default:
                result += "operatore non valido ";

       }
       System.out.println("Result :"  + result);
       input.close(); // close di scanner
    }
}