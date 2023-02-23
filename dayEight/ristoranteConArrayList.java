package dayEight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ristoranteConArrayList 
{
    public static void main(String[] args)
    {
        /*
         * Creare un sistema di inserimento che assegni un valore 
         * temporaneo a nome utente e un credito che verrà randomizzato per ogni utente, 
         * fatto ciò stampate una lista di piatti e date tre scelte
         *              Ordina, visualizza, modifica, esci
         * Ordina deve far ordinare uno degli elementi se il budget 
         * lo permette e tornare al menu di selezione, vissualizza farà vedere la lista panini, 
         * modifica farà: aggiungere, modificare ed eliminare un piatto dalla lista
         * ogni piatto dovrà avere nome, ingredienti almeno due e prezzo
         * dovremo tenere il conto di quanti utenti entrano nell'ristorante e di quanto spendono totale
         * 
         */
        Scanner input = new Scanner(System.in);

        // global variable  
        ArrayList<String> piattiNome = new ArrayList<String>();
        ArrayList<String> piattiDescrizione = new ArrayList<String>();
        ArrayList<Integer> piattiPrezzo = new ArrayList<Integer>();
        ArrayList<Integer> piattiDisponibilita = new ArrayList<Integer>();
        String userName ="Utente__";
        int userCounter =0;
        int usercredit = 0; // made it random number
        
        String firstQestion = "voi entrare v || exit e";
        String secondQuestion = "visualizza i piatti v || acquista i piatti  a || crea Piatti oppure modifica piatti c || exit e";
        String errInput =" input non valido";
        String byeAnswer = "bye bye ..!";
        int totaleIncasso= 0;
        //data already exist 
        Collections.addAll(piattiNome,"pasta", "gelato","lasagna","bistecca di mucca");
        Collections.addAll(piattiDescrizione, "pasta,carne id pollo, varie spezie, ecc...", "acqua, latte, cocolato, coni , ecc...", "lasagna, carne macinata, spezie, ecc...", "bistecca di mucca 4 kg, limone, varie spezie, ecc...");
        Collections.addAll(piattiPrezzo, 4,6,12,8);
        Collections.addAll(piattiDisponibilita, 5,5,5,5);
        // inizio programma
        boolean startProgram = false; 
        while(!startProgram)
        { 
            System.out.println(firstQestion);
            char enterOrExit = input.next().toLowerCase().charAt(0);  // legge input ed assegna a variabile convertedo il char in lowercase
            switch(enterOrExit)
            {
                case 'v':
                    //
                    userCounter ++ ; 
                    System.out.println("enter user name:  ");
                    String nameUser = input.next().trim();
                    System.out.println( userName += nameUser); // user name  created
                    usercredit = _userRandomBudget(usercredit);
                    System.out.println("your Budget : " + usercredit); 
                    System.out.println(secondQuestion);
                    char optionToSelect = input.next().toLowerCase().charAt(0); 
                    // loop of second loop 
                    boolean secondLoop =false;
                    while(!secondLoop)
                    { 
                        switch(optionToSelect)
                        {
                            case 'v':
                                System.out.println( _showAllPiatti(piattiNome, piattiDescrizione, piattiPrezzo));                            
                                String inputView = input.next().toLowerCase();
                                if(inputView.equals("x"))
                                {
                                    break; // bug non funziona uscire dalla case v
                                }else{
                                    System.out.println(errInput);
                                }
                            break;
                            case 'a':
                                String answer ="";
                                boolean buyItemLoop = false;
                                while(!buyItemLoop)
                                {
                                    System.out.println( _visualizzaPiattiDaAcquistare(piattiNome, piattiPrezzo));
                                    System.out.println("per uscire inserici  -4");
                                    int piattiNumero = input.nextInt();
                                    int newAnswer = _verifyBudget(usercredit, piattiPrezzo, piattiNumero, totaleIncasso);  
                                    
                                    if(newAnswer == -4)
                                    {
                                        buyItemLoop = true;
                                    }
                                    if(!newAnswer.equals("soldi non sufficenti") && !newAnswer.equals("x"))
                                    {   
                                        answer += newAnswer;
                                        System.out.println(answer);
                                    }                                                                                                                                                 
                                }
                            break;
                            case 'c':
                                System.out.println("modifica piatto gia esistente scrivendo il nome del piatto || 1 per nuovo piatto");
                                
                            break;
                            case 'e':
                                secondLoop = true;
                            break;
                            default:
                               System.out.println( errInput);
                        }
                    }
                break;
                case 'e':
                    startProgram = true;
                    System.out.println(byeAnswer);
                break;
                default:
                    System.out.println(errInput);
                    break;
            }
        }

    }
    // check user input if verified buy plate
    private static int   _verifyBudget(int usercredit, ArrayList<Integer> piattiPrezzo, int piattiNumero, int totaleIncasso) 
    {
        try{
            if(piattiNumero == -4)
            { 
                return -4; // end buy program
            }
            int valoreDelPiatto = 0;
            for(int i = 0; i < piattiPrezzo.size(); i ++)
            {
                if(i == (piattiNumero -1))
                {
                    valoreDelPiatto = piattiPrezzo.get(i); 
                    if(usercredit > valoreDelPiatto)
                    {
                        totaleIncasso +=  valoreDelPiatto; // total money counter
                        return (usercredit -= valoreDelPiatto);
            
                    }
                }
            }
            if(valoreDelPiatto > usercredit)
            { 
                return -1; // insufficente credito
            }
        }catch(Exception e)
        {
            return -3; // input none intero
            
        }
        return -2; // valire non valido
        
    }
    // create temporary budget range max 50
    private static int _userRandomBudget(int usercredit) 
    {
        return usercredit += (Math.random() *50 ) +1 ;
    }

    // visualizza i  piatti da acquistare
    private static String _visualizzaPiattiDaAcquistare(ArrayList<String> piattiNome, ArrayList<Integer> piattiPrezzo) 
    {
        String answer = "";
        int numOfPlates = 0;
        for(int i =  0;i < piattiNome.size() &&  i < piattiPrezzo.size(); i ++)
        {
            numOfPlates ++;
            answer+= numOfPlates + "  --- " + piattiNome.get(i) + " " + piattiPrezzo.get(i) + " euro "+ "\n"; 
        }
        return answer;
    }
    // mostra tutti piatti 
    private static String _showAllPiatti(ArrayList<String> piattiNome, ArrayList<String> piattiDescrizione,
            ArrayList<Integer> piattiPrezzo) 
    {
        String answer = "";
        for(int i =  0;i < piattiNome.size() && i < piattiDescrizione.size() &&  i < piattiPrezzo.size(); i ++)
        {
            answer+= piattiNome.get(i) + "\t " + piattiDescrizione.get(i) + " \t" + piattiPrezzo.get(i) + " euro "+ "\n"; 
        }
        return answer;
    }    
}
