import java.util.Scanner;

public class TestRistoranteMicroApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner fo ruser input
        Scanner input2 = new Scanner(System.in); // scanner fo ruser input
        // global variables
        String StartRestorantMenu = "voi entrare \"\"1\"\" oppure voi uscire \"\"2\"\" ";
        String menuChoice = "1 compra, 2 vedi, 3 aggiungi, 4 esci e ritorni all menu principale";
        String userInputError = " input inserito dal utente none valido";

        int currentUser = 0;
        int currentUserMoney = 0;
        double total = 0;
        boolean startLoop = true; // start first loop
        boolean innerLoopSecond = true; // second loop for user choice
        /// piatti details
        String[] piattiNome = { "pasta", "carne", "lasagna" };
        String[] ingredienti = { "salsa, pesie, pollo, ecc... ", "mucca, alforno, patate",
                "lasagna, carne maccinato, suggo , ecc" };
        int[] prezzo = { 5, 12, 20 };
        int[] disponibitaPiatti = { 2, 2, 2 };
        String piattiAcquistati = "";
        // admin data
        String nameAdmin = "123";
        String passwordAdmin = "123";
        String[] piattiNomeExtended = {};
        String[] ingredientiExtended = {};
        int[] prezzoExtended = {};
        int[] disponibiltaPiattiExtd = {};
        while (startLoop) {
            System.out.println(StartRestorantMenu);
            int numStartProgram = input2.nextInt();
            if (numStartProgram == 1) {
                // start second loop

                // user created with random name and random money
                currentUser++; // increase user as it i inside second loop
                String userName = "tR" + currentUser;
                currentUserMoney = (int) (Math.random() * 50) + 1;
                while (innerLoopSecond) {
                    System.out.println("\t\t\t\t menu \t\t\t");
                    System.out.println(menuChoice);
                    System.out.println("\t\t Nome Utente\t" + userName + "  \tprendi tuo temo per scegliere");
                    System.out.println("budget iniziale :: " + currentUserMoney + "   euro ");
                    int userChoice = input.nextInt(); // read user input for 4 choice
                    try {

                        switch (userChoice) {
                            case 1:
                            // case 1
                            // viusalizzazione die piatti con la posibilita del acquisto ed tenere
                            // traccia dei soldi ed la disponibilita dei piatti

                                boolean compro = true;
                                while (compro) {
                                    System.out.println(userName + "\t i piatti sono ::");
                                    System.out.println(_getAllPiatti(piattiNome, ingredienti, prezzo));
                                    int selectItem = input.nextInt();
                                    // verifica disponibilita piatti
                                    if (_disponibilitaPiatti(disponibitaPiatti, selectItem) >= 0) {
                                        int prezzoDiPiatto = _getprezzo(prezzo, selectItem);

                                        // verifica se i soldi sono sufficenti ed prezzoDiPiatto non deve essere -1
                                        if (currentUserMoney >= prezzoDiPiatto && prezzoDiPiatto != -1) {
                                            piattiAcquistati += _getPiattiName(piattiNome, selectItem) + "\t";
                                            System.out.println("soldi disponibili ::  "
                                                    + (currentUserMoney = currentUserMoney - prezzoDiPiatto));
                                            total += prezzoDiPiatto;// aumentare il conto

                                        } else {
                                            System.out.println("soldi insufficente ");
                                            compro = false;
                                        }
                                    } else {
                                        System.err.println("\n\n\t\t piatto non disponibile... scegli unaltro piatto");
                                    }
                                }
                                System.out.println("\t\t Nome Utente\t" + userName + "  \tprendi tuo temo per scegliere");
                                System.out.println("\t\t soldi rimanenti:: " + currentUserMoney + "   euro ");
                                System.out.println("\t\t piatti acquistati :: " + piattiAcquistati);
                                System.err.println("\t\t totale :: " + total);

                                break;
                            case 2:
                                // visualizza soltanto i piatti
                                System.out.println(_getAllPiatti(piattiNome, ingredienti, prezzo));
                                break;
                            case 3:
                            // aggiungi un nuovo piatto
                            // verifica i dati del utente se sono validi
                            // avra la posibilita di scegliere
                                int counterLogin = 0;
                                boolean accessUserAttempts = true;
                                while (accessUserAttempts) {
                                    System.out.print("inserisci nome del admin :: ");
                                    String adminName = input.next().trim();
                                    System.out.print("inserisci la password :: ");
                                    String passwordAdmins = input.next().trim();
                                    if (adminName.equals(nameAdmin) && passwordAdmin.equals(passwordAdmins)) {
                                        System.out.println(
                                                "Benvenuto \"N\" per inserire un nuovo piatto Altrimenti \"X\"");
                                        char answer = input.next().toLowerCase().trim().charAt(0);
                                        switch (answer) {
                                            case 'n':
                                                System.out.print("inserisci il nome piatto:: ");
                                                String newPiattiNome = input.next();
                                                System.out.print("inserisci ingrediente  piatto:: ");
                                                input2.nextLine();
                                                String newIngredienti= input2.nextLine();
                                                System.out.print("inserisci il prezzo piatto:: ");
                                                int  newPrezzo = input.nextInt();
                                                  System.out.println("\n\n lista con nuovo piatto \t\t");
                                                System.out.print(_insertItem(piattiNome, ingredienti, prezzo,disponibitaPiatti,piattiNomeExtended,ingredientiExtended,  prezzoExtended, disponibiltaPiattiExtd, newPiattiNome, newIngredienti, newPrezzo));
                                               
                                                accessUserAttempts = false;
                                                
                                                break;
                                            case 'x':
                                                accessUserAttempts = false;
                                                break;
                                            default:
                                                System.err.println("valore inserito non valido ");
                                        }
                                    } else {
                                        System.err.println("il nome del admin oppure la password e errato");
                                    }
                                    counterLogin++;
                                    if (counterLogin > 3)
                                        accessUserAttempts = false;

                                }
                                break;
                            // fa uscire dal secondo loop
                            case 4:
                                innerLoopSecond = false;
                                System.out.println("si torna al menu principale");
                                break;
                            // errore di default
                            default:
                                System.err.println(userInputError);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("isnerisci un numero valido");
                    }
                }
            }else if (numStartProgram == 2) {
                // finish the program
                System.out.println("bye bye...!");
                startLoop = false; // condition that stops the first loop
            }else if(numStartProgram<=0 && numStartProgram > 2) {
                // error input from user
                System.err.println(userInputError);
            }
        }
        input.close();
        input2.close();
    }


    private static String _insertItem(String[] piattiNome, String[] ingredienti, int[] prezzo, int[] disponibitaPiatti,
            String[] piattiNomeExtended, String[] ingredientiExtended, int[] prezzoExtended,
            int[] disponibiltaPiattiExtd, String newPiattiNome, String newIngredienti, int newPrezzo) {
        // creazione del length degli array multiplicandolo con 10
        piattiNomeExtended = new String[piattiNome.length * 10];
        ingredientiExtended = new String[ingredienti.length * 10];
        prezzoExtended = new int[prezzo.length * 10];
        disponibiltaPiattiExtd = new int[disponibitaPiatti.length * 10];
        int a = 0, b = 0, c = 0, d = 0;
        // fare un loop dove aggiungo ad ogni array i valori gia disponibili
        for (int i = 0; i < piattiNome.length; i++, a++, b++, c++, d++) {
            piattiNomeExtended[a] = piattiNome[i];
            ingredientiExtended[b] = ingredienti[b];
            prezzoExtended[c] = prezzo[c];
            disponibiltaPiattiExtd[d] = disponibitaPiatti[d];

        }
        for (int i = 0; i < piattiNomeExtended.length; i++) {

            if (piattiNomeExtended[i] == null) {
                piattiNomeExtended[i] = newPiattiNome;
                break;
            }
        }
        for (int i = 0; i < ingredientiExtended.length; i++) {

            if (ingredientiExtended[i] == null) {
                ingredientiExtended[i] = newIngredienti;
                break;
            }
        }
        for (int i = 0; i < prezzoExtended.length; i++) {

            if (prezzoExtended[i] == 0) {
                prezzoExtended[i] = newPrezzo;
                break;
            }
        }
        for (int i = 0; i < disponibiltaPiattiExtd.length; i++) {

            if (disponibiltaPiattiExtd[i] == 0) {
                disponibiltaPiattiExtd[i] = 2;
                break;
            }
        }

        String detail = "";
        int p = 0;
        int j = 0;
        int numToDisplay = 1;
        for (String ds : piattiNomeExtended) {
            if(ds != null)
            { 
                detail += " il piatto " + numToDisplay + "\n" + ds + " \n ingrediente \n " + ingredientiExtended[p] + "\t"
                        + prezzoExtended[j] + "  euro\n";
                p++;
                j++;
                numToDisplay++;
            }
        }
        // un controllo solo su nome dei piatti 
        return  detail;
    }

    // restituisce il nome del piatto in base alla scelta del utente
    private static String _getPiattiName(String[] piattiNome, int selectItem) {

        for (int i = 0; i < piattiNome.length; i++) {
            if (i == (selectItem - 1))
                return piattiNome[i];
        }
        return null;

    }

    // verifica la disponibilta del piatto in base al numero inserito
    private static int _disponibilitaPiatti(int[] disponibitaPiatti, int selectItem) {

        for (int i = 0; i < disponibitaPiatti.length; i++) {
            if (i == (selectItem - 1)) {
                disponibitaPiatti[i] -= 1;
                // se utente continua ad dare lo stesso input per evitare di rombere il codice
                // ed il return restituisci -n valori
                // questa condizione da sempre -1 per evitare di rombere il codice
                if (disponibitaPiatti[i] < 0)
                    return -1;
                return disponibitaPiatti[i];
            }
        }
        return -1;
    }

    // return price of selected item if number Not present return -1
    private static int _getprezzo(int[] prezzo, int selectItem) {
        for (int i = 0; i < prezzo.length; i++) {
            if ((selectItem - 1) == i) // userinput - 1 to match the respected array item
                return prezzo[i];
        }
        return -1;
    }

    // displays all the dish available
    private static String _getAllPiatti(String[] piattiNome, String[] ingredienti, int[] prezzo) {
        String detail = "";
        int i = 0;
        int j = 0;
        int numToDisplay = 1;
        for (String d : piattiNome) {
            detail += " il piatto " + numToDisplay + "\n" + d + " \n ingrediente \n " + ingredienti[i] + "\t"
                    + prezzo[j] + "  euro\n";
            i++;
            j++;
            numToDisplay++;
        }
        return detail;
    }

}