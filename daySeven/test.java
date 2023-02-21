package daySeven;
import java.util.ArrayList;
public class test 
{
    public static void main(String[] args)
    {
        ArrayList<String> test= new ArrayList<String>();
        ArrayList<String> test2= new ArrayList<String>();
        test.add("1");
        test.add("2");
        test2.add("2");
        test2.add("2");
        String num = "2";
        for(int i =0; i < test.size() && i < test2.size(); i ++ )
        {
            if(test.get(i).equals(num) && test2.get(i).equals(num)){ 
             System.out.println(test.get(i));
            }else{
                System.out.println("no match");
            }
        }
    }    
}
