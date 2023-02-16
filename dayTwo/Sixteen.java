import java.util.Scanner; // import the Scanner class

public class Sixteen {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli cosa fare ");
        System.out.println("M per calcolatrice oppure C per calendrio ");
        char charScelta = input.next().toLowerCase().charAt(0);
        String giorni = "";
        switch(charScelta)
        {
            case 'm':
                    System.out.println("inserisci un numero ");
                    int num1 = input.nextInt();
                    System.out.println("inserisci il secondo numero");
                    int num2 = input.nextInt();
                    String result = "";
                    System.out.println("che operazione poi fare *, +, -, %");
                    char chInput = input.next().charAt(0);
                    switch(chInput)
                    {
                    case '*':
                    result += num1 * num2;
                    break;
                    case '+':
                    result += num1 + num2;
                    break;
                    case '-':
                    result += num1 - num2;
                    break;
                    case '%':
                    result += num1 % num2;
                    break;
                    default:
                    result += "operatore non valido ";
                    } 
                    System.out.println(result);
            break; 
            case 'c':
            System.out.println("isnerisci il giorno della settimana in numero");
            int giorno = input.nextInt();
            switch(giorno)
            {
                case 1:
                    giorni = "Monday";
                break;
                case 2:
                    giorni = "Tuesday";
                break;
                case 3:
                    giorni = "Wednesday";
                break;
                case 4:
                    giorni = "Thrusday";
                break;
                case 5:
                    giorni = "Friday";
                break;
                case 6:
                    giorni = "Saturday";
                break;
                case 7:
                    giorni = "Sunday";
                break;
            } 
            System.out.println(giorni);
            break;
            default: 
                System.out.println("scelta non valida");
        }
        input.close();
    }
}
