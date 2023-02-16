
import java.util.Scanner;

public class Twenty 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name, surname,dob, password;
        int age;

        System.out.println("inserisci il nome :");
        name = input.next();
        System.out.println("inserisci il surname :");
        surname = input.next();
        System.out.println("inserisci il data di nascita in formato dd/mm/yyyy :");
        dob = input.next();
        System.out.println("iserisci eta:");
        age = input.nextInt();
        System.out.println("crea  la  password:::::");
        input.nextLine();
        password = input.nextLine();
        if(_dobFormat(dob) && _validPassword(password))
        {
            System.out.println("user data saved"); 
            System.out.print("Voi cambaire i dati ::: y (yes) n (no)::::");
            char programRunChioce = input.next().charAt(0);
            switch(programRunChioce)
            {
                case 'y':
                    int counter =0;
                    boolean startLoop = true;
                    boolean passwordVerification = false;
                    while(startLoop)
                    { 
                        System.out.println("Max 3 prove iserisci la password ::: ");
                        String newPass = input.next();
                        if(password.equals(newPass))
                        { 
                            passwordVerification = true;
                            startLoop = false;
                        }else 
                        { 
                            counter ++;
                            System.out.println("password errato");
                        }    
                        if(counter >3)
                        { 
                            startLoop =false;
                            System.out.println("password errato non si puo cambiare i dati ");
                        }
                    }
                    if(passwordVerification)
                    {
                        System.out.print("iserisci nome :: ");
                        name = input.next();
                        System.out.print("iserisci cognome :: ");
                        surname = input.next();
                        System.out.print("iserisci data di nascita :: ");
                        dob = input.next();
                        System.out.print("iserisci eta:: ");
                        age = input.nextInt();
                        System.out.println("dati salvati");
                    }
                break;
                case 'n':
                    System.out.println("bye bye ...!!!");
                break;
                default:
                System.out.println("valore non valido metti solo y oppure n ");

            }
        }
        else
        {
            System.out.println("la lunghezza del password deve essere almeno 8 caratteri ");
            System.out.println("controlla ancheil formato della data dd/mm/yyyy");
        }
        
    }

    private static boolean _dobFormat(String dob) {
        int counter =0;
        for(int i = 0; i < dob.length(); i ++)
        {
            char ch = dob.charAt(i);
            if(ch =='/')
                counter ++;
        }
        if(counter == 2)
            return true;
        return false;
    }

    private static boolean _validPassword(String password) {
        return  password != null &&
                password.length() >= 8;
    }

    
   
}
