package daySeven;
import java.util.ArrayList;
import java.util.Scanner;
public class EsercizioArrayList 
{
    public static void main(String[] args)
    { 
        /*
         * Creiamo un sistema di inserimento che permetta di registrare 
         * un utente tramite i suoi dati ( Nome, password, età ) e andiamo a far 
         * ripetere l'azioni x volte andando a incasselare vari utenti nel nostro arraylist,
         * l'obbiettivo e avere tre utenti registrati e stamparne i dati 
         * su arraylist differenti
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<String>();    
        ArrayList<String> userPasswords = new ArrayList<String>();    
        ArrayList<Integer> userAges = new ArrayList<Integer>();  
        boolean startProgram = true;
        String firstQuestion = "registrare r || visualizza tutto v || uscire e";
        String nameQuestion = "inserisci il nome:  ";
        String passwordQuestion = "isnerisci la password: ";
        String ageQuestion = "inserisci eta:  "  ;
        String err = "input non valido";
        int counterMain = 0;
        while(startProgram)
        { 
           
            System.out.println(firstQuestion );
            char answerOne = input.next().toLowerCase().charAt(0);
            
            switch(answerOne)
            {
                case 'r':
                    while (counterMain < 3)
                    {
                        System.out.println(nameQuestion);
                        String name = input.next();
                        System.out.println(passwordQuestion);
                        String password = input.next();
                        System.out.println(ageQuestion);
                        int age = input.nextInt();
                        // add data to arrays
                        if(!_verifyName(name, userNames))
                        {
                            System.out.println("nome utente gia esistente non si puo salvare ");
                        }
                        userPasswords.add(password);
                        userAges.add(age);    
                        counterMain ++;
                    }
                break;
                case 'e':
                    startProgram = false;
                break;
                case 'v':
                    if(userNames.size()>= 1 )
                    {
                        System.out.println(_showAllUser(userNames,userPasswords, userAges));
                    }
                    else
                    {
                        System.out.println("senza dati");
                    }
                break;
                default:
                    System.out.println(err);
            }
        }
    }
    private static boolean _verifyName(String name, ArrayList<String> userNames) 
    {
        boolean checkName = true;
        if(userNames.size() == 0 )
        {
            userNames.add(name);
            return true;
        } 
        // if size i greater than 1
        for(String s : userNames)
        { 
            if(s.equals(name))
            {
                checkName = false;
            }
        }
        if(!checkName)
        {
            userNames.add(name);
        }
        
        return checkName;
    }
    //show all user 
    private static String _showAllUser(ArrayList<String> userNames, ArrayList<String> userPasswords, ArrayList<Integer>userAges) 
    {
        String answer = "";
        for( int i = 0; i < userNames.size() && i < userPasswords.size() && i < userAges.size(); i ++)
        {
            answer += "name: " + userNames.get(i) + " password: " + userPasswords.get(i) + " age:  " + userAges.get(i) + " \n" ;

        }
        return answer;

    } 
}
