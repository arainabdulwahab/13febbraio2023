package daySix;
import java.util.Scanner;
import java.util.ArrayList;
public class  fibonacci
{
    public static void main(String[] args)
    {
        Scanner iput = new Scanner(System.in);
        // arrayList 
        ArrayList<Integer> fibNumStore = new ArrayList<Integer>();
        System.out.print("quanti numeri di fibonacci voi far stampare ::  ");
        int num = iput.nextInt();
        System.out.println("---------");
        
        int counter = 0;
        int firstNum = 0;
        int secondNum = 1;
        //System.out.println(secondNum);
        fibNumStore.add(secondNum);
        while(counter < num)
        {   
            int advanceNum = firstNum + secondNum;
            if(advanceNum % 2 == 0 )
            { 
                System.out.println(advanceNum + " pari");
            } 
            // add item to arrayList
            fibNumStore.add(advanceNum);  
            firstNum = secondNum;
            secondNum = advanceNum;

            counter ++;
        }
        System.out.println("voi vedere tutti i numeri 1 -- || ---- 2 per ricercare un un numero specifico oppure 3 per EXIT");
        int viewOrFindVal = iput.nextInt();
        switch(viewOrFindVal)
        {
            case 1:
                System.out.println("Result: " + fibNumStore);
            break;
            case 2:
                System.out.println("inserici il numero da controllare :");
                int checkNum = iput.nextInt();
                boolean verify = false;
                for(int i : fibNumStore)
                {
                    if(i == checkNum)
                    {
                        verify = true;
                    }
                }
                if(verify)
                {
                    System.out.println("numero trovato " + checkNum);
                }else
                {
                    System.out.println("numero non trovato " + checkNum);
                }
            break;
            case 3:
                System.out.println("bye bye ...!!!");
            break;
            default:
                System.out.println("input non valido");
        }



        iput.close();

    }   
}