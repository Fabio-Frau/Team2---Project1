import javax.swing.*;
import java.util.* ;
import java.util.Arrays;
public class operationTypeArray {
    public static void OperationTypeArray() {
/* Seleziona il tipo di operazione da eseguire su array.
        1. Addizione, 2. Sottrazione 3. Moltiplicazione 4. Divisione 5.Pari o dispari*/


        Scanner in;
        in = new Scanner(System.in);
        numOperationA(in);
    }
    public static void numOperationA(Scanner in){
        scelta1 : while (true) {
            System.out.println("\nSeleziona il tipo di operazione da eseguire con l'array.\n" +
                    "0. Chiudi Calcolatrice \n1. Addizione \n2. Sottrazione \n3. Moltiplicazione \n4. Divisione \n5. Potenza \n6. Pari o dispari\n");

            int ch3 = in.nextInt();
            switch (ch3) {
                case 1:
                    System.out.println("ADDIZIONE.");
                    double[] arraySomma = Read.arrDouble("");
                    System.out.println("Il risultato della somma degli elementi dell'array è " + SommaArray.sumArray(arraySomma));
                    break;
                case 2:
                    System.out.println("SOTTRAZIONE.");
                    double[] arraySottrazione = Read.arrDouble("");
                    System.out.println("Il risultato della sottrazione degli elementi dell'array è " + SottrazioneArray.sottrazioneArray(arraySottrazione));
                    break;
                case 3:
                    System.out.println("MOLTIPLICAZIONE.");
                    MoltiplicazioneArray.MoltiplicationArray();
                    break;
                case 4:
                    System.out.println("DIVISIONE.");
                    DivisionArray.DivArray();
                    break;
                case 5:
                    System.out.println("POTENZA.");
                    double[] basi = Read.arrDouble("Inserisci l'array delle basi");
                    double[] esponenti = Read.arrDouble("Inserisci l'array degli esponenti");
                    System.out.println("Il risultato dell'elevamento a potenza dei due array é " + Arrays.toString(Power.powerArray(basi, esponenti)));
                case 6:
                    System.out.println("PARI O DISPARI.");
                    int [] arrayPariDispari = Read.arrInt("");
                    pariDispariArray.pariDispariArrNum(arrayPariDispari);
                    break;
                case 0:
                    break scelta1;
                default:
                    System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
                    break;
            }
        }
    }


}
