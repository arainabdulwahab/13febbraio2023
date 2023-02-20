package daySix;

public class EsercizioArrayTwo 
{
    public static void main(String[] args)
    {
        // array da coppiare
        String[] cars = {"mercedes", "fiat", "duster"};
        String[] newArrCars = new String[cars.length + cars.length]; // raddopiare il valore
        
        // string to store date
        String  display = "";
        int nullCounter = 0;
        // loop per array 
        for(int i = 0; i < cars.length; i ++)
        {
            newArrCars[i] = cars[i];
            if(newArrCars[i] != null)
            {
                nullCounter ++;
                display += newArrCars[i] + " ";
            } 
        }
        
        System.out.println(display);
        System.out.println("array con valori null  " +(  newArrCars.length - nullCounter));

    }     
}
