
import java.util.* ;
import java.util.Arrays;

public class SceltaNumberArray {
    public static void main(String[] args) {

        /* Seleziona se lavorare sull'array o sul singolo valore
         * scegliere 1 per i singoli valori o 2 per l'array.*/

        Scanner in;
        in = new Scanner(System.in);
        int ch = chooseNumberOrArray(in);

        switch (ch) {
            case 1:
                operationTypeTwoValue op2value = new operationTypeTwoValue();
                operationTypeTwoValue.numOperation(in);
                break;
            case 2:
                operationTypeArray opArray = new operationTypeArray();
                //divisionA(in);
                break;
        }

        /*DivisionNumber divNumber = new DivisionNumber();
        DivisionArray divArray = new DivisionArray();
        singleNumberOrArray(choose, in);*/
    }

    public static int chooseNumberOrArray(Scanner in){
        System.out.println("Digita 1 per una coppia di valori oppure 2 per un array: ");
        int choose = in.nextInt();
        if (choose == 1){
            System.out.println("Operazione su una coppia di valori.");
        } else if (choose == 2) {
            System.out.println("Operazione su un array.");
        } else {
            System.out.println("Valore inserito non valido. Inserisci un nuovo valore: ");
            choose = in.nextInt();
        }
        return choose;
    }

}
