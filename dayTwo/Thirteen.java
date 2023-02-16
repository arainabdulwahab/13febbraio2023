import java.util.Scanner;
public class Thirteen  
{
    public static void main(String[] args)
    {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("primo numero random da 1 a 50 ");
        int num1 =   (int)(  Math.random() * 51 ) + 1; // numero random da 1 a 50
        System.out.println("il sqrt di " + num1 + " = " + Math.sqrt(num1));

        System.out.println("inserisci un numero :");
        int numUser = inputUser.nextInt(); // read user value
         
        System.out.println("inserisci secondo  numero :");
        int numUserTwo = inputUser.nextInt(); // read user value
        System.out.println("il max: " + Math.max(numUser, numUserTwo)); // max number
        System.out.println("il min: " + Math.min(numUser, numUserTwo)); // min number
        inputUser.close();// close inputUser
        int x = 9;
        int y = 10;
        System.out.println(x> y);
        System.out.println(x<y);
        System.out.println(x!=y);
        System.out.println(x>>y);
        System.out.println(x==y);
        System.out.println(x>>y);
        String st ="32 ";
        System.out.println(st.equals("32 "));
        if(20>15)
            System.out.println("first number is greater");
    }
}