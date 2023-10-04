
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
                        "0. Chiudi Calcolatrice \n1. Addizione \n2. Sottrazione \n3. Moltiplicazione \n4. Divisione \n5. Potenza \n6. Pari o dispari\n");
                int ch2 = in.nextInt();
                switch (ch2) {
                    case 1:
                        System.out.println("ADDIZIONE.");
                        System.out.println("Dammi il primo addendo:");
                        double num1 = in.nextDouble();
                        System.out.println("Dammi il secondo addendo:");
                        double num2 = in.nextDouble();
                        System.out.println("La somma è " + Somma2Num.sum(num1,num2));
                        break;
                    case 2:
                        System.out.println("SOTTRAZIONE.");
                        //CLASSE SOTTRAZIONE
                        break;
                    case 3:
                        System.out.println("MOLTIPLICAZIONE.");
                        //CLASSE MOLTIPLICAZIONE
                        break;
                    case 4:
                        System.out.println("DIVISIONE.");
                        DivisionNumber.DivNum();
                        break;
                    case 5:
                        System.out.println("POTENZA.");
                        double base = Read.Double("Dammi la base: ");
                        double esponente = Read.Double("Dammi l'esponente: ");
                        System.out.println(Power.power2Num(base,esponente));
                         break ;
                    case 6:
                        System.out.println("PARI O DISPARI.");
                        //CLASSE PARI O DISPARI
                       break;
                    case 0:
                        System.out.println("Chiusura calcolatrice");
                        break scelta;
                    default:
                        System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
                        break;
                }
            }
        }



}
