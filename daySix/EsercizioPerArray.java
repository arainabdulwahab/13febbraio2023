package daySix;
import java.util.Scanner;
public class EsercizioPerArray 
{
    public static void main(String[] args )
    { 
        Scanner input = new Scanner(System.in);
        String[] arrUser = new String[4];

        System.out.print("Inserisci il nome:  ");
        arrUser[0] = input.next();
        System.out.print("Inserisci il cognome:  ");
        arrUser[1] = input.next();
        System.out.print("Inserisci il email:  ");
        arrUser[2] = input.next();
        System.out.print("Inserisci il neta:  ");
        arrUser[3] = input.next();
        System.out.println(arrUser[0] + " " + arrUser[1]+ " "+  arrUser[2]  + " "  + arrUser[3]  );
    
        // formato loop 
        String[] question = {"name", "surname", "email", "age"};
        String[] userAdd= new String[4];
        int i = 0;
        String answer = "";

        while(i < userAdd.length)
        {
            System.out.println("inserisci " + question[i]);
            String dataStore = input.next();
            userAdd[i] = dataStore;
            answer += userAdd[i] + " ";
            i++;
        }
        System.out.println(answer);
        input.close();
    }
}
