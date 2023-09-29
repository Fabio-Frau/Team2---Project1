import org.w3c.dom.ls.LSOutput;
//import java.util.Scanner;
import java.util.* ;
import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        /* Seleziona se lavorare sull'array o sul singolo valore
         * scegliere 1 per i singoli valori o 2 per l'array.*/
        ArrayOrSingleValue();
    }

    /* Metodo per selezione operazione con switch (??) */ // ALL TOGETHER
    public static void ArrayOrSingleValue() {
        System.out.println("Digita 1 per una coppia di valori oppure 2 per un array: ");
        Scanner in;
        in = new Scanner(System.in);
        int choose = in.nextInt();
        switch (choose) {
            case 1:
                selectionSingleValueOperation();
                break;
            case 2:
                selectionArrayOperation();
                break;
            default:
                System.out.println("Valore inserito non valido");
                // aggiunta richiesta nuovo valore
        }
    }

    public static void selectionSingleValueOperation() {

        System.out.println("Scegli il tipo di operazione da eseguire. Digita il numero corrispondente.");
        System.out.println("1. Addizione");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Potenza");
        System.out.println("6. Pari/Dispari");

        Scanner in; // legge l'input da tastiera
        /* crea l’oggetto che rappresenta la tastiera */
        in = new Scanner(System.in);
        int choose = in.nextInt();   // Lettura del valore digitato
        if (choose != 4) {
            System.out.println("Il valore inserito non corrisponde ad una operazione, riprova");
            return; // AGGIUNGERE NUOVA RICHIESTA VALORE
        }
        switch (choose) {

           /* case 1:
                addition();
                break;*/

            /*case 2:
                subtraction();
                break;*/

           /* case 3:
                multiplication();
                break;*/

            case 4:
                //division();
                break;

            /*case 5:
                power();
                break;*/

           /* case 6: {
                evenOdd();
            }
            break;*/
        }
    }

    public static void selectionArrayOperation() {

        System.out.println("Scegli il tipo di operazione da eseguire. Digita il numero corrispondente:");
        System.out.println("1. Addizione");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Pari/Dispari");

        Scanner in; // legge l'input da tastiera
        /* crea l’oggetto che rappresenta la tastiera */
        in = new Scanner(System.in);
        int choose = in.nextInt();   // Lettura del valore digitato
        // AGGIUNGERE LE ECCEZIONI DEI DIVERSI CASI
        if (choose != 4) {
            System.out.println("Il valore inserito non corrisponde ad una operazione, riprova");
            return; // AGGIUNGERE NUOVA RICHIESTA VALORE
        }
        switch (choose) {

           /* case 1:
                addition();
                break;*/

            /*case 2:
                subtraction();
                break;*/

           /* case 3:
                multiplication();
                break;*/

            case 4:
                divisionArray();
                break;

           /* case 5: {
                evenOdd();
            }
            break;*/
            default:
        }
    }


    /*Metodo addizione*/ //RICKY
    /*public static double addition(double num1, double num2) {}
    *   Scanner in; // legge l'input da tastiera
        in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();   */


    /*Metodo sottrazione*/ //TINO
    /*public static double subtraction(double num1, double num2) {} */


    /*Metodo moltiplicazione*/ //MARIA
    /*public static double multiplication(double num1, double num2) {} */


    /*Metodo divisione*/ //VALERIA
    /*public static double division(double num1, double num2) {} */
        public static double division(){
            System.out.println("Inserire i valori corrispondenti a dividendo e divisore:");
            /* legge due numeri dividendo e divisore */
            Scanner in;
            in = new Scanner(System.in);
            double dividendo = in.nextDouble();
            double divisore = in.nextDouble();
            //double quoziente = 0;
            if (divisore != 0){
                double quoziente = dividendo/divisore;
                System.out.println("Il risultato della divisione è " + quoziente);
            } else if (divisore == 0) {
                System.out.println("Errore, il divisore è 0. Inserire un nuovo valore");
            }//Va modificato dopo aver settato gli input da tastiera
            return 0;
        }

        public static void divisionArray(){
            System.out.println("Inserisci la dimensioni dell'array: ");
            Scanner in;
            in = new Scanner(System.in);
            int dimension = in.nextInt();
            double[] arrayDiv = new double[dimension];
            System.out.println("Inserisci gli elementi che compongono l'array:");
            for (int i = 0; i < dimension; i++) {
                Scanner in2;
                in2 = new Scanner(System.in);
                arrayDiv[i] = in.nextDouble();
            }
            System.out.println("Array: " + Arrays.toString(arrayDiv));
            double quoz = 0;
            for (int j = 0; j<dimension - 1; j++ ){
                if (j == 0) {quoz = arrayDiv[0]/arrayDiv[1];}
                else {quoz = quoz/arrayDiv[j+1];}
            }
            System.out.println("Il risultato della divisione sugli elementi dell'array è: " + quoz);
        }


    /*Metodo potenza*/ //FABIO
    /*public static double power(double num1, double num2) {} */


    /*Metodo pari o dispari*/ //TINO
    /*public static boolean evenOdd(int num)*/


    //Funzione per l'INPUT di SINGOLO VALORE INT


}
