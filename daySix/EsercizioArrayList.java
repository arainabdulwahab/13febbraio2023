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
        String deleteItem = " -- c -- cancella un elemento inserendo un id oppure il valre da cancellare ";
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
                        case 'n':
                            System.out.println(Arrays.toString(nums));
                        break;
                        case 's':
                            System.out.println(Arrays.toString(names));
                        break;
                        
                        default:
                            System.out.println(err);
                    }
                    boolean startSecondLoop = true;                    
                    System.out.println(aggiungiElemento + " " + deleteItem);
                    thirdInput = in.next().charAt(0);
                    while (startSecondLoop)
                    { 
                        switch(thirdInput)
                        { 
                            case 'y':
                                System.out.println(createNums + " " + createString );
                                char fourthInput = in.next().toLowerCase().charAt(0);    
                            switch(fourthInput)
                            {
                                case 'q':
                                case 'w':
                             
                                /// da modificare qui
                                System.out.print("inserisci il valore da aggiungere:: ");
                                String addItem = in.next();
                                System.out.println(_addItemArray(addItem,fourthInput, myNewArr, myNewArrString));
                                break;
                                case 'x':
                                    startSecondLoop = false;
                                break;
                                default:
                                System.out.println(err);
                            }
                            break;
                            case 'c':
                                System.out.println("inserisci il valore da cancellare altrimenti ESC::  ");
                                String delItem = in.next();
                                System.out.println(_deleteItemFromArray(startSecondLoop, err, delItem, myNewArr, myNewArrString));
                                if(_deleteItemFromArray(startSecondLoop, err, delItem, myNewArr, myNewArrString).equals("false"))
                                {
                                    startSecondLoop = false;
                                }
                            break;
                            case 'n':
                                startSecondLoop = false;
                            break;
                            default:
                                startSecondLoop = false;
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
        in.close();

    }
    // prende valori verifica con i cicli verifica i valori poi cancella 
    private static String  _deleteItemFromArray(boolean startSecondLoop, String err, String delItem, ArrayList<Integer> myNewArr,
            ArrayList<String> myNewArrString) 
    {
        if(delItem.equals("ESC"))
        {
            return "" + false;
        }
        try{
            int verifyNum = Integer.parseInt(delItem); // convert to int 
            // search element in the array list
            for(int i : myNewArr)
            { 
                if(verifyNum == i)
                { 
                    myNewArr.remove(i);
                    return "elemento rimosso :: " + myNewArr;
                }
            }
            return err;
        }catch(Exception e )
        {
            myNewArrString.removeIf(s -> (s.equals(delItem)));
        }
        return err;
    }
    // aggiungere an item
    private static String _addItemArray(String addItem, char fourthInput, List<Integer> myNewArr, List<String> myNewArrString) 
    {
        if(fourthInput == 'q')
        {
            try { 
                    myNewArr.add(Integer.parseInt(addItem));
                    return "" + myNewArr;
                }catch(Exception e){
                    return "none un numero";
                }

        }
        myNewArrString.add(addItem);
        return ""+ myNewArrString;
    }    
}
