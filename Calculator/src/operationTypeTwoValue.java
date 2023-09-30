
import java.util.* ;
import java.util.Arrays;
public class operationTypeTwoValue {
    public static void main(String[] args) {
        /* Seleziona il tipo di operazione da eseguire con i due valori.
        1. Addizione, 2. Sottrazione 3. Moltiplicazione 4. Divisione 5.Potenza 6.Pari o dispari*/


        Scanner in;
        in = new Scanner(System.in);
        int ch2 = numOperation(in);

        switch (ch2) {
            case 1:
                //classe ADDIZIONE
                break;
            case 2:
                //classe SOTTRAZIONE
                break;
            case 3:
                // classe MOLTIPLICAZIONE
                break;
            case 4:
                //CLASSE DIVISIONE
                divisionN(in);
                break;

            case 5:
                //CLASSE POTENZA
                break;

            case 6:
                //CLASSE PARI O DISPARI
                break;
        }
    }
        public static int numOperation(Scanner in){
            System.out.println("Digita 1 per una coppia di valori oppure 2 per un array: ");
            int ch2 = in.nextInt();
            if (ch2 == 1){
                System.out.println("ADDIZIONE.");
            } else if (ch2 == 2) {
                System.out.println("SOTTRAZIONE.");
            }
            else if (ch2 == 3){
                System.out.println("MOLTIPLICAZIONE.");
            }else if (ch2 == 4){
                System.out.println("DIVISIONE.");
            } else if (ch2 == 5) {
                System.out.println("POTENZA.");
            } else if (ch2 == 6) {
                System.out.println("PARI O DISPARI");
            } else {
                System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
                ch2 = in.nextInt();
            }
            return ch2;
        }


    // Imporatzione metodi addizione

    //Importazione metodi sottrazione

    //Importazione metodi moltiplicazione


   // Importazione metodi divisione
     public static void divisionN(Scanner in){
        double dividendo = DivisionNumber.readNumber(in);
        double divisore = DivisionNumber.readNumber(in);
        while (divisore == 0){
            System.out.println("Il divisore non può essere nullo. Inserisci un nuovo valore");
            divisore = DivisionNumber.newDivisore(in,divisore);
        }
        DivisionNumber.division(dividendo,divisore);
    }

    // Importazione metodi potenza

    // Importazione metodi pari/dispari
}
