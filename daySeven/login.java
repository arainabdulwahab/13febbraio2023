package daySeven;

import java.util.ArrayList;
import java.util.Scanner;
public class login 
{
    
    public static void main(String[] args)
    {
        /*
         * Andiamo a creare un sistema che permetta 
         * di creare un utenza, nome e pass, e che dopo un 
         * loggin ci permetta di inserire i dati stringhe in 
         * array comune o uscire per poter rillogare
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> userName = new ArrayList<String>();
        ArrayList<String> userPassword = new ArrayList<String>();
        ArrayList<String> addElement = new ArrayList<String>();
        String registerOrLogin = "register r || login l || exit e";
        String nameQuestion = "inserisc nome: ";
        String passwordQuestion = "inserisci password: ";
        String userChoice = " voi inserire un commento || a per visualizzare tutti i commenti || x logout : ";
        String err = "input non valido";
        boolean startProgram = false;
        String names ="";
        String password = "";
        while(!startProgram)
        {
            System.out.println(registerOrLogin);
            char chOne = input.next().toLowerCase().charAt(0);
            switch(chOne)
            {
                case 'r':
                
                    System.out.println(nameQuestion);
                    names = input.next();
                    System.out.println(passwordQuestion);
                    password = input.next();
                   // _nameAndPasswordQuestion(names, password, input, nameQuestion, passwordQuestion);
                    userName.add(names);
                    userPassword.add(password);
                break;
                case 'l':
                
                    System.out.println(nameQuestion);
                    names = input.next();
                    System.out.println(passwordQuestion);
                    password = input.next();
                   // _nameAndPasswordQuestion(names, password, input, nameQuestion, passwordQuestion);
                    String answer = _authLogin(names, password, userName, userPassword);

                    if(answer != null)
                    {
                        boolean runSecondLoop = false;
                        while(!runSecondLoop)
                        { 
                            System.out.println( "utente: " + answer +"\n" + userChoice);
                            input.nextLine();
                            String addItem = input.nextLine();
                            if(addItem.equals("x"))
                            {
                                runSecondLoop = true;
                            }
                            if(addItem.equals("y"))
                            {
                                _getAllComment(answer, addElement);
                            }
                            if(!addItem.equals("x"))
                            { 
                                addElement.add("utente " + answer + " : " + addItem);
                                System.out.println(addElement);
                            }
                        } 
                            
                        
                    } else {
                        System.out.println("utente non identificatol");
                    }
                break;
                case 'e':
                    startProgram = true;
                    System.out.println("bye bye..!");
                break;
                default:
                    System.out.println(err);
            }
        }
        input.close();

    }
    // 
    // private static void _nameAndPasswordQuestion(String names, String password, Scanner input, String nameQuestion, String passwordQuestion) 
    // {
    //     System.out.println(nameQuestion);
    //     names = input.next();
    //     System.out.println(passwordQuestion);
    //     password = input.next();
    // }

    private static String  _getAllComment(String answer, ArrayList<String> addElement) 
    {
        ArrayList<String> showComments = new ArrayList<String>();
        String commentWtihUserName;
        for(String s : addElement)
        {
            // verifica il nome di utente con sub string 
            commentWtihUserName = s.substring(0, answer.length());
           
            if(s.equals(commentWtihUserName))
            {
                showComments.add(s);
            }
        }
        return  "" + showComments;
    }
    private static String _authLogin(String names, String password, ArrayList<String> userName,
            ArrayList<String> userPassword) 
    {
        for(int i = 0; i < userName.size() && i < userPassword.size(); i ++)
        {
            if(userName.get(i).equals(names) && userPassword.get(i).equals(password))
            { 
                return userName.get(i);
        
            }
        
        }    
        return null;
    }    
}
