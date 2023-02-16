public class Sesto 
{
    public static void main(String[] args)    
    {
        int numOne = 5;
        int numTwo = 8;
        float c;
        c = (float) numOne / numTwo;
        System.out.println(c);

        System.out.println("cambio di valore ::: " + convertedVal(44.44f));
    }
    public static int convertedVal(float values)
    {
        return (int) (values + 2.5);   
    }
}
