import java.util.Arrays;
import java.util.Scanner;

public class DivisionArray {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int dimension = getArrayLength(in);
        double[] arrayDiv = new double[dimension];
        getAndPrintArray(dimension, arrayDiv,in);
        divisionArray(dimension,arrayDiv);
    }
    /* Funzione che prende un input l'array ed esegue la divisione */
     public static void divisionArray(int dimension, double[] arrayDiv){
            double quoz = 0;
            for (int j = 0; j< dimension - 1; j++ ){
                if (j == 0) {quoz = arrayDiv[0]/arrayDiv[1];}
                else {quoz = quoz/arrayDiv[j+1];}
            }
            System.out.println("Il risultato della divisione sugli elementi dell'array è: " + quoz);
        }

        //Funzione lettura numero intero
        public static void ScannerSingleInt (Scanner in){
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
         public static void getAndPrintArray(int dimension,double[] arrayDiv, Scanner in){
             System.out.println("Inserisci gli elementi che compongono l'array:");
             for (int i = 0; i < dimension; i++) {
                 arrayDiv[i] = in.nextDouble();
             }
             System.out.println("Array: " + Arrays.toString(arrayDiv));
         }

}

