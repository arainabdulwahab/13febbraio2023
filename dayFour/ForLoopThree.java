import java.util.Scanner;

public class ForLoopThree {
    public static void main(String[] args) {
        /*
         * Andate a creare una serie di valori int salvati su variabili 2/3 e
         * fate si che tramite un
         * menu che da lo start conti fino all
         * raggiungimento della variabile (1.2.3.4.5.6)
         */
        Scanner input = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        int numToReach;
        boolean startProgram = true;
        boolean startLoop = true;
        while (startProgram) 
        {
            System.out.println("voi scrivre una stringa ed stamparlo una lettera S:: ");
            System.out.println("voi contare i numero Y altriment N ::");

            String answer = input.next().toLowerCase();
            if (answer.length() == 1) 
            {
                switch (answer) 
                {
                    case "y":
                        while (startLoop) 
                        {
                            System.out.println("fin quando voi contare");
                            numToReach = input.nextInt();
                            if (numToReach > 0) {
                                for (int i = 0; i < numToReach; i++) {
                                    System.out.println(i);
                                }
                                startLoop = false;
                            } else {
                                System.out.println("numero non valido deve essere maggiore di zero");
                            }
                        }
                        break;
                    case "s":
                        System.out.println("inserisci la stringa ::");

                        String secondAnswer = inputTwo.nextLine();
                        for (int i = 0; i < secondAnswer.length(); i++) {
                            char ch = secondAnswer.charAt(i);
                            System.out.println(ch);
                        }
                        break;
                    case "n":
                        startProgram = false;
                        System.out.println("bye bye ");
                        break;
                    default:
                        System.out.println("valore non valido");
                }
            }
        }
        input.close();
        inputTwo.close();
    }
}