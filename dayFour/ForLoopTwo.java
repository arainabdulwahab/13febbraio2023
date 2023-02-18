import java.util.Scanner;
public class ForLoopTwo 
{
    public static void main (String[] args)
    {
        /*
         * Andate a creare una serie di valori int salvati su variabili 2/3 e 
         * fate si che tramite un
         *  menu che da lo start conti fino all 
         * raggiungimento della variabile (1.2.3.4.5.6)
         */
        Scanner input = new Scanner(System.in);
        int numToReach;
        boolean startLoop = true;
        System.out.println("voi contare i numero Y altriment N ::");
        
        String answer = input.next().toLowerCase();
        if(answer.length() == 1)
        { 
            if(answer.equals("y"))
            {
                while(startLoop)
                { 
                    System.out.println("fin quando voi contare");
                    numToReach = input.nextInt();
                    if(numToReach > 0 )
                    {
                        for(int i = 0; i < numToReach; i ++)
                        {
                            System.out.println( i );
                        }
                        startLoop = false;
                    }else 
                    {
                        System.out.println("numero non valido deve essere maggiore di zero");
                    }
                }
            }
            if(answer.equals("n"))
            {
                System.out.println("bye bye ");
            }
        }else
        {
            System.out.println("inserimento del char non valido ");
        }
        input.close();
    }    
}
