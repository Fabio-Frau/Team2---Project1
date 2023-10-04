
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
                System.out.println("\nSeleziona il tipo di operazione da eseguire con i due valori.\n" +
                        "0. Chiudi Calcolatrice \n1. Addizione \n2. Sottrazione \n3. Moltiplicazione \n4. Divisione \n5. Potenza \n6. Pari o dispari\n");
                double num1;//Li ho dovuti definire da fuori altrimenti mi diceva che erano già definiti all'interno dei case
                double num2;
                int ch2 = in.nextInt();
                switch (ch2) {
                    case 1:
                        System.out.println("ADDIZIONE.");
                        System.out.println("Dammi il primo addendo:");
                        num1 = in.nextDouble();
                        System.out.println("Dammi il secondo addendo:");
                        num2 = in.nextDouble();
                        System.out.println("La somma è " + Somma2Num.sum(num1,num2));
                        break;
                    case 2:
                        System.out.println("SOTTRAZIONE.");
                        System.out.println("Dammi il minuendo: ");
                        num1 = in.nextDouble();
                        System.out.println("Dammi il sottraendo: ");
                        num2 = in.nextDouble();
                        System.out.println("La differenza è " + SottrazioneNum.sottrazione(num1,num2));
                        break;
                    case 3:
                        System.out.println("MOLTIPLICAZIONE.");
                        System.out.println("Dammi il moltiplicando: ");
                        num1 = in.nextDouble();
                        System.out.println("Dammi il moltiplicatore: ");
                        num2 = in.nextDouble();
                        System.out.println("Il prodotto è " + MultiplicationNumber.multiplication(num1,num2));
                        break;
                    case 4:
                        System.out.println("DIVISIONE.");
                        DivisionNumber.DivNum();
                        break;
                    case 5:
                        System.out.println("POTENZA.");
                        double base = Read.numDouble("Dammi la base: ");
                        double esponente = Read.numDouble("Dammi l'esponente: ");
                        System.out.println(Power.power2Num(base,esponente));
                         break ;
                    case 6:
                        System.out.println("PARI O DISPARI.");
                        System.out.println("Dammi un numero ");
                        int num = in.nextInt();
                        pariDispariNum.pariDispari(num);
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
