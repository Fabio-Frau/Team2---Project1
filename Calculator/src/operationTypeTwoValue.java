
import java.util.* ;
import java.util.Arrays;
public class operationTypeTwoValue {
    public static void OperationTypeTwoValue() {
        /* Seleziona il tipo di operazione da eseguire con i due valori.
        1. Addizione, 2. Sottrazione 3. Moltiplicazione 4. Divisione 5.Potenza 6.Pari o dispari*/


        Scanner in;
        in = new Scanner(System.in);

        numOperation(in);
    }
        public static  void numOperation(Scanner in){
            scelta : while (true) {
                System.out.println("Seleziona il tipo di operazione da eseguire con i due valori.\n" +
                        "1. Addizione \n2. Sottrazione \n3. Moltiplicazione \n4. Divisione \n5.Potenza \n6.Pari o dispari\n");
                int ch2 = in.nextInt();
                switch (ch2) {
                    case 1:
                        System.out.println("ADDIZIONE.");

                         break scelta;
                    case 2:
                        System.out.println("SOTTRAZIONE.");
                        //CLASSE SOTTRAZIONE
                        break scelta;
                    case 3:
                        System.out.println("MOLTIPLICAZIONE.");
                        //CLASSE MOLTIPLICAZIONE
                        break;
                    case 4:
                        System.out.println("DIVISIONE.");
                        //CLASSE DIVISIONE
                        divisionN(in);
                        break;
                    case 5:
                        System.out.println("POTENZA.");
                        double base = Read.Double("Dammi la base: ");
                        double esponente = Read.Double("Dammi l'esponente: ");
                        //System.out.println(Power.power2Num(base,esponente));
                         break scelta;
                    case 6:
                        System.out.println("PARI O DISPARI.");
                        //CLASSE PARI O DISPARI
                       break;
                    default:
                        System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
                        break;
                }
            }
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
