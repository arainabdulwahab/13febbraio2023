package dayNine;
import java.util.Scanner;

public class methodExercise 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("che tipo voi int i | String s | double d | boolean b : ");
        String answer = input.next().trim().toLowerCase();
        double enterValue = 0;
        if(answer.equals("i") || answer.equals("d"))
        {
            System.out.println("inserisci un numero :");
            enterValue = input.nextDouble();
            if(answer.equals("i"))
            { 
                System.out.println("int " + reInt(enterValue));
            }
            if(answer.equals("b"))
            { 
                System.out.println("double " + reDouble(enterValue));
            }
        } else if(answer.equals("s") || answer.equals("b"))
        {
            System.out.println("inserisci una stringa :");
            String enterValueStr = input.next();
            if(answer.equals("s"))
            { 
                System.out.println("string " + reString(enterValueStr));
            }
            if(answer.equals("b"))
            { 
                answer.toLowerCase();
                if(answer.equals("true") || answer.equals("false"))
                { 
                 System.out.println("Boolean " + reBoolean(enterValueStr));
            
                }
                System.out.println("none boolean");
            }
        }else{
            System.out.println("input non valido");
        }
        input.close();
    }    

public static int reInt(Double enterValue)
{
    int newVal = (int) Math.round(enterValue);
    return newVal ;
}
public static double reDouble(Double enterValue)
{
    return (double) enterValue;
}
public static String reString(String strValue)
{
    return strValue;
}
public static boolean reBoolean(String strValue)
{   
    boolean newBool = Boolean.valueOf(strValue);
    return newBool;
}



}