package daySix;
public class TestBreak 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            if(i % 2 != 0)
                System.out.println(i);
            if(i == 8)
                break;
        }
         for(int i = 0; i < 10; i++)
        {
            if(i % 2 !=0)
            {
                i +=1;
                System.out.println(i + " e diventato pari");
            }
        }
    }
    
}
