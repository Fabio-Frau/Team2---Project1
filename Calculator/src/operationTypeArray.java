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
    public static int numOperationA(Scanner in){
        while (true) {
            System.out.println("Seleziona il tipo di operazione da eseguire con l'array.\n" +
                    "1. Addizione \n2. Sottrazione \n3. Moltiplicazione \n4. Divisione \n5.Pari o dispari\n");

            int ch3 = in.nextInt();
            switch (ch3) {
                case 1:
                    System.out.println("ADDIZIONE.");
                    int dimension = DivisionArray.getArrayLength(in);
                    double[] arrayDiv = new double[dimension];

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
                    //CLASSE DIVISIONE
                    DivisionArray.DivArray();
                    //divisionA(in);
                    break;
                case 5:
                    System.out.println("PARI O DISPARI.");
                    //CLASSE PARI O DISPARI
                    break;
                default:
                    System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
                    break;
            }
        }
    }


}
