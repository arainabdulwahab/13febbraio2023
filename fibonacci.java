import java.util.Scanner;

public class  fibonacci
{
    public static void main(String[] args)
    {
        Scanner iput = new Scanner(System.in);
        System.out.print("quanti numeri di fibonacci voi far stampare ::  ");
        int num = iput.nextInt();
        System.out.println("---------");
        
        int counter = 0;
        int firstNum = 0;
        int secondNum = 1;
        //System.out.println(secondNum);
        while(counter < num)
        {   
            int advanceNum = firstNum + secondNum;
            if(advanceNum % 2 == 0 )
            { 
                System.out.println(advanceNum + " pari");
            } else 
            {
                System.out.println(advanceNum + "dispari");
            }   
            firstNum = secondNum;
            secondNum = advanceNum;

            counter ++;
        }
        iput.close();

    }   
}