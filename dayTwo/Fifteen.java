import java.util.Scanner; // import the Scanner class
public class Fifteen 
{
    public static void main(String[] args)
    {
        String adminName = "abdul", passwordVerified = "Typ4542@";
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il nome ?");
        String name = input.next().trim();
        int num ;
        String password ;
        if(name.length()> 1 && name != null && name.equals(adminName))
        {
            System.out.println("inserisci  eta ?");
            num = input.nextInt();
            if(num> 18 && num < 50)
            {
                System.out.println("inserisci  password ?");
                password = input.next();
                if(password.equals(passwordVerified))
                {
                        System.out.println("accesso fatto ");
                } 
            }
        }else{

            System.out.println("accesso fallito");
        }
        input.close();
    } 

}
