import java.util.Arrays;
import java.util.* ;

public class DivisionArray {
    public static void DivArray() {
        Scanner in;
        in = new Scanner(System.in);
        int dimension = getArrayLength(in);
        double[] arrayDiv = new double[dimension];

        while(true) {
            getAndPrintArray(dimension, arrayDiv, in);
            if (verDividendoValido(dimension, arrayDiv)) {
                divisionArray(dimension, arrayDiv);
                break;
            } else {
                continue;
            }
            }
        }

    /* Funzione che prende un input l'array ed esegue la divisione */
    public static void divisionArray(int dimension, double[] arrayDiv) {
        double quoz = 0;
        for (int j = 0; j < dimension - 1; j++) {
            if (j == 0) {
                quoz = arrayDiv[0] / arrayDiv[1];
            } else {
                quoz = quoz / arrayDiv[j + 1];
            }
        }
        System.out.println("Il risultato della divisione sugli elementi dell'array è: " + quoz);
    }

    //Funzione lettura numero intero
    public static void ScannerSingleInt(Scanner in) {
        int x = in.nextInt();

    }


    // Funzione lettura lunghezza array
    public static int getArrayLength(Scanner in) {
        System.out.println("Inserisci la dimensioni dell'array: ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }

    //Funzione lettura e stampa array
    public static void getAndPrintArray(int dimension, double[] arrayDiv, Scanner in) {
        System.out.println("Inserisci gli elementi che compongono l'array:");
        for (int i = 0; i < dimension; i++) {
            arrayDiv[i] = in.nextDouble();
        }
        System.out.println("Array: " + Arrays.toString(arrayDiv));
    }

    public static boolean verDividendoValido(int dimension, double[] arrayDiv) {
        for (int i = 1; i < dimension; i++) {
            if (arrayDiv[i] == 0) {
                System.out.println("Uno dei divisori è nullo, inserire nuovamente i valori dell'array");
            }
        }
        return true;
    }

}

