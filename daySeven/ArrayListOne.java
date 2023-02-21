package daySeven;
import java.util.ArrayList;
public class ArrayListOne 
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volov");
        cars.add("fiat");
        cars.add("gb");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.set(0, "VOLVO");
        System.out.println(cars);

    }    
}
