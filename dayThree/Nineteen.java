import java.util.Scanner;

public class Nineteen
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i =0;
        while(i < 5)
        {
            System.out.println(i);
            i ++;
        }
        boolean testWhile= true;
        int count = 0;
        while(testWhile)
        {
            System.out.println(count ++);
            if(count == 5)
                testWhile= false;
        }
        boolean startProgram = true;
        while(startProgram)
        {  
            System.out.println("inserisci un numero da 1 a 10 oppure 11 per esci  oppure 12 per scrivere ");
            int numToControl = input.nextInt();

            if(numToControl == 11)
                startProgram = false;
            if(numToControl >= 13)
                System.out.println("numero none in range");

            if(numToControl > 0 && numToControl < 10)
            { 
                if(numToControl % 2 == 0)
                    System.out.println("numero pari");
                if(numToControl % 2 != 0)
                    System.out.println("numero dispari");
            }
            if(numToControl == 12)
            { 
                System.out.println("inserisci una riga che deve contenere i spazi ");
                input.nextLine();
                String answer = input.nextLine().trim();
                String[] arrayDiInput =answer.split(" ");
                if(arrayDiInput.length > 1)
                { 
                    for (String a : arrayDiInput)
                        System.out.println(a);
                
                }
            }
        }
        input.close();
    } 

}
