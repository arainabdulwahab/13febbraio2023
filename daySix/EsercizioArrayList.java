package daySix;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class EsercizioArrayList 
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /**
         * Creare un array numeri e un array 
         * stringhe. Far si che tramite un 
         * menu si possa scegliere prima quali 
         * visualizzare e poi a quale 
         * aggiungere un elemento per poi 
         * tornare al menu inziaile
         */
        String menu = "voi visualizzare v ---- oppure uscire x";
        String aggiungiElemento = "voi aggiungere un elemento  --- y   ---  oppure no --- n --- ";
        String viewNumber = "voi visualizzare i numeri --- n ";
        String viewString = "voi visualizzare la stringa --- s ";
        String createNums = "voi aggiungere un numero  --- q --";
        String createString = "voi aggiungere una stringa --- w oppure x per uscire ----";
        String err = "input non valido ";
        char firstInput ;
        char secondInput;
        char thirdInput;
        boolean startProgram = true;
        Integer[] nums = {1,2,3,4,5,6,7,8,9};
        String[] names = {"abd","ara","wah","sedf"};
        ArrayList<Integer> myNewArr = new ArrayList<Integer>(Arrays.asList(nums));
        ArrayList<String> myNewArrString = new ArrayList<String>(Arrays.asList(names));
        // start proram
        while(startProgram)
        { 
            System.out.println(menu);
            firstInput = in.next().toLowerCase().charAt(0);
            switch(firstInput)
            {
                case 'v':
                    System.out.print(viewNumber + " " + viewString);
                    secondInput = in.next().charAt(0);
                    
                    switch(secondInput)
                    {
                        case 'i':
                            System.out.println(Arrays.toString(nums));
                        break;
                        case 's':
                            System.out.println(Arrays.toString(names));
                        break;
                        default:
                            System.out.println(err);
                    }
                    boolean startSecondLoop = true;                    
                    System.out.println(aggiungiElemento);
                    thirdInput = in.next().charAt(0);
                    while (startSecondLoop)
                    { 
                        switch(thirdInput)
                        {
                            case 'q':
                            case 'w':
                            /// da modificare qui
                            System.out.println(_createArray(secondInput, myNewArr, myNewArrString));
                            break;
                            case 'x':
                                startSecondLoop = false;
                            break;
                            default:
                            System.out.println(err);
                        }
                    }
                break;
                case 'x':
                    startProgram = false;
                    System.out.println("bye bye...!");
                break;
                default:
                    System.out.println(err);
            }
        }

    }

    private static String _createArray(char secondInput, List<Integer> myNewArr, List<String> myNewArrString) 
    {
        return null;
    }    
}
