import java.util.*;
public class MyMin
{
    public static final MyMin tests; // constante di un oggetti 
    public static MyMin createObject(MyMin tests)
    {
        return new MyMin();
    }
    String password;
    String name;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
         * Creare un sistema di isnerimento che permetta di istanziare una 
         * classe utente e definirne nome e password e alla fine li stampoi tutti
         */
        MyMin test = new MyMin();
        System.out.println("inserisci il nome : ");
        test.name = in.next();
        System.out.println("inserisci il password : ");
        test.password = in.next();
        MyMin test2 = new MyMin();
        System.out.println("inserisci il nome : ");
        test2.name = in.next();
        System.out.println("inserisci il password : ");
        test2.password = in.next();
        System.out.println(test.name);
        System.out.println(test.password);
        System.out.println(test2.name);
        System.out.println(test2.password);
    }
}