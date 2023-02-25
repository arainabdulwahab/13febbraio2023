package dayNine;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class menuSystemWithUserAndAdmin 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        /*
        * Creare un sistema di isnerimento che permetta di 
        * registrarsi tramite lo stesso metodo ma che abbia 
        * più livelli ( almeno 3 normale, admin, capo c'è ne può 
        * essere solo uno)
        */    
        // global variable 
        ArrayList<String> userName = new ArrayList<String>();
        ArrayList<String> userPassword = new ArrayList<String>(); 
        ArrayList<String> userRole = new ArrayList<String>();
        String adminPassword = "QWODMqaos123:<@";
        String capoPassword = "qaloEdoEkoQ12>?[]We";
        String startProgramQuestion = "voi entrare v || exit e : ";
        String nameQuestion = "inserisci il nome :  ";
        String passwordQuestion = "inserisci la password: ";
        String adminQuestion = "sei Admin y || exit   n : ";
        String capoQuestion = "sei Capo : ";
        String nomeGiaEsiste = "il nome gia esiste non poi  usarlo";
        String errInput = "input none valido";
        String userSaved = "utente salvato";
        boolean startProgram = false;
        int  capoVerify = 0;

        // dati per il test
        userName.add("ara");
        userPassword.add("123");
        userRole.add("client");
        while(!startProgram)
        {
            System.out.println(startProgramQuestion);
            char chStartProgram = input.next().toLowerCase().charAt(0);
            if(chStartProgram != 'e' && chStartProgram != 'v')
            {
                System.out.println(errInput);
            }
            // end program 
            if(chStartProgram == 'e')
            {
                startProgram = true;
            }
            // enter second loop and ask user data
            if(chStartProgram == 'v')
            { 
                String name = "";
                String password = "";
                boolean checkName = false;
                while(!checkName)
                { 
                    System.out.println(nameQuestion);
                    name = input.next(); //read user input
                    if(!verifyUserName(name, userName))
                    {
                        System.out.println(nomeGiaEsiste);
                    } else
                    {
                        checkName = true;
                    }
                }
                boolean checkPassword = false;
                while(!checkPassword)
                {
                    System.out.println(passwordQuestion);
                    password = input.next();
                    if(!_verifyPassword(password).equals("perfect"))
                    {
                        System.out.println(_verifyPassword(password));
                    } else
                    {
                        checkPassword = true;
                    }
                }
                boolean checkAdmin = false;
                String role = "";
                while(!checkAdmin)
                { 
                    System.out.println(adminQuestion);
                    char chAskAdmin = input.next().toLowerCase().charAt(0);
                    
                    if(chAskAdmin != 'y' && chAskAdmin != 'n')
                    {
                        System.out.println(errInput);
                    }
                    if(chAskAdmin == 'n')
                    {
                        role = "utente";
                        _addUser(name, password,role, userName, userPassword, userRole);
                        System.out.println(userSaved);
                        checkAdmin = true;
                    }
                    if(chAskAdmin == 'y')
                    {
                        System.out.println(passwordQuestion);
                        String verifyAdminPssword = input.next().trim();
                        role = "admin";
                        if(verifyAdminPssword.equals(adminPassword))
                        {
                            System.out.println(capoQuestion);
                            String checkCapo = input.next();
                            if(checkCapo.equals(capoPassword))
                            {
                                capoVerify ++;
                                if(capoVerify > 1)
                                {
                                    System.out.println("capo gia esiste");
                                }else
                                {

                                    _addUser(name, password,role, userName, userPassword, userRole);
                                }

                            }
                        }else
                        {
                            _addUser(name, password,role, userName, userPassword, userRole);
                        }
                    }
                }
            }
        }
        input.close();
    }

    private static boolean _addUser(String name , String password,String role, ArrayList<String> userName, ArrayList<String> userPassword, ArrayList<String> userRole)
    {
        for(int i  = 0;i < userName.size() && i < userPassword.size() && i < userRole.size(); i ++)
        {
            if(userName.get(i).isEmpty() && userPassword.get(i).isEmpty() && userRole.get(i).isEmpty())
            {
                userName.add(name);
                userPassword.add(password);
                userRole.add(role);
                return true;
            }
        }
        return false;
    }
    // controlla che la password sia valido 
    private static String _verifyPassword(String password)
    {
        int checker = 0; // max checker = 3;
        // controllo la prima lettera
        char chFirstLetter= password.charAt(0);
        if(chFirstLetter >= 'A' && chFirstLetter <='z')
        {
            checker += 1;
        }else
        {
            return "iniziale di password non contiene lettera maiuscola";
        }
        // la lunghezza del password deve essere maggiore uguale a 8
        if(password.length() >= 8)
        {
            checker +=1;
        }else 
        {
            return "la lunghezza del password e minore di 8 ";
        }
        // controllo di almeno 2 numeri 
        int numInsidePasswordCounter = 0;
        for(int i = 0; i < password.length(); i ++)
        {
            char chPass = password.charAt(i); 
            if(chPass >= '0' && chPass <='9' )
            {
                numInsidePasswordCounter ++;
            }
        }
        if(numInsidePasswordCounter >= 2 )
        {
            checker +=1;
        }else 
        {
            return "la password deve contenere almeno 3 numeri";
        }
        if(checker == 3)
        {
            return "perfect";
        }
        return "not perfect password";
    }
    // verifica se nome del utente gia esiste nella lista
    public static boolean verifyUserName(String name, ArrayList<String> userName)
    {
        // il controllo va effetuato se size di userName > 1
        if(userName.size() >= 1)
        {
            // se nome e uguale restituisce false 
            for(String s : userName)
            {
                if(s.equals(name))
                {
                    return false;
                }
            }
        }
        // restitusci true se none uguale
        return true;
    }
}
