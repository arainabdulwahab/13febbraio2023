import java.util.Scanner; // import the Scanner class

public class Seventeen {
    public static void main(String[] args) {
        /**
         * Creare un sistema di inserimento che prenda tre dati in fila,
         * un numero, una string e che setti un bool
         * Dopo di che un menu dovrà farci scegliere tra tre opzioni
         * Funzioni matematiche, Funzioni Stringa, Casting
         * Funzioni matematiche: Sul numero che abbiamo eseguiremo un operazione a
         * scelta fra
         * 4 disponibili e vedremo il risultato
         * Funzioni String: Devono eseguire un sub string o un concatenamento a scelta
         * Casting trasforma un dato da un tipo ad un 'altro e valorizza il risultato a
         * schermo
         * 
         */
        Scanner input = new Scanner(System.in);
        // variables
        int num1;
        String stringToAddMethod = "";
        boolean userInputTrueOrFalse = false;
        // prompt
        System.out.println("inserisci un numero ed una stringa e un valore 1 o 0 premendo ogni enter");
        num1 = input.nextInt();
        input.nextLine();
        stringToAddMethod = input.nextLine();
        int userInputForBoolValue = input.nextInt();

        if (userInputForBoolValue == 1)
            userInputTrueOrFalse = true;
        if (userInputForBoolValue == 0)
            userInputTrueOrFalse = false;
        System.out.println("il menu");
        System.out.println("premi 1 :: funzione matematica, premi 2 ::per funzioni stringa, premi 3 :: per casting ");
        int menuSelect = input.nextInt();
        switch (menuSelect) {
            // funzione mathematico
            case 1:
                System.out.println("inserisci il secondo numero");
                int num2 = input.nextInt();
                String result = "";
                System.out.println("che operazione poi fare *, +, -, %");
                char chInput = input.next().charAt(0);
                switch (chInput) {
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
                System.out.println("risultato :::   " + result);
                break;
            // Funzioni Stringa
            case 2:
                System.out.println(
                        "che tipo di operazione voi fare \n 1 per lunghezza della stringa \n 2 per fare tutto in minuscolo ed maiuscolo \n 3 concat() aggiungi testo ");
                int numCase2Main = input.nextInt();
                switch (numCase2Main) {
                    case 1:
                        System.out.println(stringToAddMethod.length());
                        break;
                    case 2:
                        System.out.println("tutta la string in minuscolo :::: " + stringToAddMethod.toLowerCase());
                        System.out.println("tutta la string in maiuscolo :::: " + stringToAddMethod.toUpperCase());
                        break;
                    case 3:
                        System.out.println("inserisco la riga da aggiungere ::: ");
                        input.nextLine();// consume newline leftover
                        String newLine = input.nextLine();
                        System.out.println(stringToAddMethod + " " + newLine);
                        break;
                    default:
                        System.out.println("valore inserito per formattare la stringa non valido");
                }
                break;
            case 3:
                System.out.println(
                        "\t\t premi 1 per cast di numero \n \t\t 2 per cast di Stringa \n \t\t premi 3 per cast di entrambi :::");
                int numCast = input.nextInt(); // read line
                switch (numCast) {
                    case 1:
                        System.out.println(_castNumero(num1));
                        break;
                    case 2:
                        System.out.println(_castStringa(stringToAddMethod));
                        break;
                    case 3:
                        System.out.println(_castNumero(num1));
                        System.out.println(_castStringa(stringToAddMethod));
                        break;
                    default:
                        System.out.println("valore per cast non valido");
                }
                break;
            default:
                System.out.println("valore non valido");
        }
        System.out.println("booleano definito al inizio dal utente ::: " + userInputTrueOrFalse);
        input.close();
    }

    private static String _castStringa(String stringToAddMethod) 
    {
        char[] chs =new char[stringToAddMethod.length()];
        String result = "";
        
        if(stringToAddMethod.length() > 1)
            for(int i =  0; i < stringToAddMethod.length(); i ++)
            { 
                    chs[i] =stringToAddMethod.charAt(i);
            }
            for(char i : chs)
                result += i + "\n";
        return result;
    }

    private static String  _castNumero(int num1) 
    {
        return "integer: "         + num1         + "\n"  + 
                "double: "       + (double)num1   + "d\n" +
                "long: "         + (long) num1 + "l\n";
    }
}
