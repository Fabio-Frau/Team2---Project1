import java.util.Arrays;
import java.util.Scanner;

public class MoltiplicazioneArray {
    public static void MoltiplicationArray() {
        Scanner in;
        in = new Scanner(System.in);

        int dimension = getArrayLength(in);

        double[] arrayMolt = new double[dimension];
        getAndPrintArray(dimension, arrayMolt, in);
        arrayMult(dimension, arrayMolt);

        }

    public static int getArrayLength(Scanner in) {
        System.out.println("Inserisci la dimensioni dell'array: ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }

    public static void getAndPrintArray(int dimension, double[] arrayMolt, Scanner in) {
        System.out.println("Inserisci gli elementi che compongono l'array:");
        for (int i = 0; i < dimension; i++) {
            arrayMolt[i] = in.nextDouble();
        }
        System.out.println("Array: " + Arrays.toString(arrayMolt));
    }

    public static void arrayMult(int dimension, double[] getAndPrintArray){
       double moltRes = 1;
       for (int i = 0; i < dimension; i++){
           moltRes *= getAndPrintArray[i];
       }
        System.out.println("Il risultato della moltiplicazione tra gli elementi dell'array è " +moltRes);
    }
}
