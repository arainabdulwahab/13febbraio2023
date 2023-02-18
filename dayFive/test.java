import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String[] piattiNome = { "pasta", "carne", "lasagna" };
        String[] ingredienti = { "salsa, pesie, pollo, ecc... ", "mucca, alforno, patate",
                "lasagna, carne maccinato, suggo , ecc" };
        int[] prezzo = { 5, 12, 20 };
        int[] disponibitaPiatti = { 2, 2, 2 };

        String[] piattiNomeExtended = {};
        String[] ingredientiExtended = {};
        int[] prezzoExtended = {};
        int[] disponibiltaPiattiExtd = {};
        System.out.println("piatto");
        String newPiattiNome = input.next();
        String newIngredienti = input2.nextLine();
        int newPrezzo = input.nextInt();
        System.out.print(_insertItem(piattiNome, ingredienti, prezzo, disponibitaPiatti, piattiNomeExtended,
                ingredientiExtended, prezzoExtended, disponibiltaPiattiExtd, newPiattiNome, newIngredienti, newPrezzo));
    }

    private static boolean _insertItem(String[] piattiNome, String[] ingredienti, int[] prezzo, int[] disponibitaPiatti,
            String[] piattiNomeExtended, String[] ingredientiExtended, int[] prezzoExtended,
            int[] disponibiltaPiattiExtd, String newPiattiNome, String newIngredienti, int newPrezzo) {
        // creazione del length degli array multiplicandolo con 10
        piattiNomeExtended = new String[piattiNome.length * 10];
        ingredientiExtended = new String[ingredienti.length * 10];
        prezzoExtended = new int[prezzo.length * 10];
        disponibiltaPiattiExtd = new int[disponibitaPiatti.length * 10];
        int a = 0, b = 0, c = 0, d = 0;
        // fare un loop dove aggiungo ad ogni array i valori gia disponibili
        for (int i = 0; i < piattiNome.length; i++, a++, b++, c++, d++) {
            piattiNomeExtended[a] = piattiNome[i];
            ingredientiExtended[b] = ingredienti[b];
            prezzoExtended[c] = prezzo[c];
            disponibiltaPiattiExtd[d] = disponibitaPiatti[d];

        }
        for (int i = 0; i < piattiNomeExtended.length; i++) {

            if (piattiNomeExtended[i] == null) {
                piattiNomeExtended[i] = newPiattiNome;
                break;
            }
        }
        for (int i = 0; i < ingredientiExtended.length; i++) {

            if (ingredientiExtended[i] == null) {
                ingredientiExtended[i] = newIngredienti;
                break;
            }
        }
        for (int i = 0; i < prezzoExtended.length; i++) {

            if (prezzoExtended[i] == 0) {
                prezzoExtended[i] = newPrezzo;
                break;
            }
        }
        for (int i = 0; i < disponibiltaPiattiExtd.length; i++) {

            if (disponibiltaPiattiExtd[i] == 0) {
                disponibiltaPiattiExtd[i] = 2;
                break;
            }
        }
        return true;
    }
}
