import java.util.* ;
import java.util.Arrays;
public class operationTypeArray {
    public static void main(String[] args) {
/* Seleziona il tipo di operazione da eseguire su array.
        1. Addizione, 2. Sottrazione 3. Moltiplicazione 4. Divisione 5.Pari o dispari*/


        Scanner in;
        in = new Scanner(System.in);
        int ch3 = numOperationA(in);

        switch (ch3) {
            case 1:
                // classe ADDIZIONE ARRAY
                break;
            case 2:
                // classe SOTTRAZIONE ARRAY
                break;
            case 3:
                // classe MOLTIPLICAZIONE ARRAY
                break;
            case 4:
                // classe DIVISIONE ARRAY
                divisionA(in);
                break;
            case 5:
                // classe PARI O DISPARI ARRAY
                break;
        }
    }
    public static int numOperationA(Scanner in){
        System.out.println("Digita 1 per una coppia di valori oppure 2 per un array: ");
        int ch3 = in.nextInt();
        if (ch3 == 1){
            System.out.println("ADDIZIONE.");
        } else if (ch3 == 2) {
            System.out.println("SOTTRAZIONE.");
        }
        else if (ch3 == 3){
            System.out.println("MOLTIPLICAZIONE.");
        }else if (ch3 == 4){
            System.out.println("DIVISIONE.");
        } else if (ch3 == 5) {
            System.out.println("PARI O DISPARI");
        } else {
            System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
            ch3 = in.nextInt();
        }
        return ch3;
    }


    public static void divisionA(Scanner in){
        int dimension = DivisionArray.getArrayLength(in);
        double[] arrayDiv = new double[dimension];
        DivisionArray.getAndPrintArray(dimension, arrayDiv,in);
        if (DivisionArray.verDividendoValido(dimension, arrayDiv)) {
            DivisionArray.getAndPrintArray(dimension, arrayDiv, in);
        }
        DivisionArray.divisionArray(dimension,arrayDiv);
    }
}
