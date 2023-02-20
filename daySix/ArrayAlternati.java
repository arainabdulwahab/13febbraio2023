package daySix;

public class ArrayAlternati
{
    public static void main(String[] args)
    {
        String[] cars = {"volvo", "fiat"};
        int[] year = {2004,2023};
        for(int i = 0; i < cars.length; i ++ )
        {
            if(cars.length == year.length)
            {
                System.out.println( cars[i] +" " + year[i] );
            }
        }
        int i = 0;
        for (String  car : cars) 
        {

            System.out.println(car +" " + year[i]);
            i ++;    
        }
    }
}
