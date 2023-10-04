import java.util.Arrays;
import java.util.Scanner;

public class MoltiplicazioneArray {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        int dimension = getArrayLength(in);

        double[] arrayMoult = new double[dimension];
        getAndPrintArray(dimension, arrayMoult, in);
        arrayMult(dimension, arrayMoult);

        }

    public static int getArrayLength(Scanner in) {
        System.out.println("Inserisci la dimensioni dell'array: ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }

    public static void getAndPrintArray(int dimension, double[] arrayMoult, Scanner in) {
        System.out.println("Inserisci gli elementi che compongono l'array:");
        for (int i = 0; i < dimension; i++) {
            arrayMoult[i] = in.nextDouble();
        }
        System.out.println("Array: " + Arrays.toString(arrayMoult));
    }

    public static void arrayMult(int dimension, double[] getAndPrintArray){
       double moultRes = 1;
       for (int i = 0; i < dimension; i++){
           moultRes *= getAndPrintArray[i];
       }
        System.out.println("Il risultato della moltiplicazione tra gli elementi dell'array è " +moultRes);
    }
}
