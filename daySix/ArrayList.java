package daySix;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList 
{
    public static void main(String[] args)
    {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> newList = new ArrayList<Interger>(Arrays.asList(arr));
        newList.add(7);
        arr= newList.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
