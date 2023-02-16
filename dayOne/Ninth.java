import java.util.Scanner; // import the Scanner class

public class Ninth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lineToCheck; // variabile inizializzata ma non assegnato il valore
        boolean startProgram = true; // true per iniziare il programma 

        // finquando startProgram e true questo pezzo di codice verra eseguita N volte
        while (startProgram)  
        {
            System.out.println("inserisci un numero oppure un char oppure una stringa  altrimenti EXIT ");
            lineToCheck = in.nextLine().trim(); // trim() per togliere gli spazzi ed leggere la linea ed assegnare il valore a variabile
            //  verifica .equals() se valore inserito e uguale a EXIT oppure exit 
            //  il startProram diventera false ed fine del loop 
            // altrimenti il programma continua nel else {....}
            if 
            (
                lineToCheck.equals("EXIT")      ||
                lineToCheck.equals("exit")
            ) 
            {
                startProgram = false; // assegnare false alla variabile
                System.out.println("Bye bye!!!!");
            } 
            else 
            {
                // verificare ecessioni 
                try 
                {
                    // il valore inserito e un numero (escluso i caratteri)
                    double d = Double.parseDouble(lineToCheck);
                    // math.floor() disolito il valore che esci da questo metodo  e un intero
                    // metto in confronto d con il valore di math.floor(d) 
                    if ( d == Math.floor(d))
                        System.out.println("un numero intero: " + (int) d); 
                    else 
                    {
                        System.out.println("un numero double:" + d);
                    }
                }
                // exception quello piu generalizzato
                catch (Exception e) 
                {
                    // se la lunghezza del valore di lineToCheck e 1 prendo il primo carattere ed 
                    // lo assegno char e lo stampo 
                    if (lineToCheck.length() == 1) 
                    {
                        char ch = lineToCheck.charAt(0);
                        System.out.println("un char : " + ch);
                    }
                    // verifica la condizione trasformando il valore in lowercase 
                    if
                    (
                        lineToCheck.toLowerCase().equals("true")        ||
                        lineToCheck.toLowerCase().equals("false")  
                    )
                        System.out.println("un booleano: " + lineToCheck);
                    // se la lunghezza del valore di lineToCheck e > di 1 allora e una stringa 
                    if 
                    (
                        lineToCheck.length() > 1                                &&
                        !lineToCheck.toLowerCase().equals("true")      &&
                        !lineToCheck.toLowerCase().equals("false") 
                    ) 
                        System.out.println("una stringa: " + lineToCheck);
                    
                }
            }
        }
        in.close(); // close the scanner 
    }
}
