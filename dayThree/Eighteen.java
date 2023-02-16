import java.util.Scanner;
public class Eighteen 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        double num1, num2, total = 0;

        
        
        System.out.println("inserisci il primo  numero");
        num1 = input.nextDouble();
        System.out.println("inserisci il secondo numero");
        num2 = input.nextDouble();
        System.out.println("che operazione poi fare S per la somma dei due radice, +, -, E per la sottrazione del raidce piu piccola con radice piu grande ");
        char chInput = input.next().charAt(0);
        switch (chInput) {
            case 'S':
                total =  Math.sqrt(num1) +  Math.sqrt(num2);
                break;
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case 'E':
                double numOneWithSqrt = Math.sqrt(num1);
                total = numOneWithSqrt < num2 ? numOneWithSqrt - num2 : num2 - numOneWithSqrt;
                break;
            default:
               System.out.println( "operatore non valido ");
        }
        /*  
         * indicazioni sul risultato, ovvero:
         * se il numero è positivo o negativo con il suo valore assoluto;
         * se il numero è un intero;
         * se è un intero indicherà se è pari, 
         * altrimenti eseguirà un troncamento indicando il il valore del decimale rimosso;
         */
        
        if(total > 0)
        { 
            System.out.println("un numero positivo " + total);
        } 
        else
        { 
            System.out.println("un numero negativo  " + total);
        }
        if(total == Math.floor(total))
        { 
            System.out.println("un numero di tipo inter " + (int) total);
            if( total % 2 == 0)
                System.out.println("ed e pari ");
        }
        else 
        { 
            System.out.println("un numero di tipo double " + total);
            int newTotal = (int) total;
            System.out.println("troncato :: " + newTotal);

        }
        input.close();
    }    
}
