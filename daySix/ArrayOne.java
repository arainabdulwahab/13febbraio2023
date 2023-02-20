package daySix;

public class ArrayOne 
{
    public static void main(String[] args)
    {
        String[] cars  = {"volot","toyota","ferrari"};
        System.out.println(cars[2]);
        cars[2] = "panda";
        System.out.println(cars[2]);

        for(String s : cars)
        {
            System.out.println(s);
        } 
    }    
}
