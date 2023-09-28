import org.w3c.dom.ls.LSOutput;

import java.util.* ;
public class Calculator {
    public static void main(String[] args) {

        selezione();

        /*Dati in ingresso*/
        // double num1 = 3.0;
        // double num2 = 1;
        //division(num1, num2);
    }

    /* Metodo per selezione operazione con switch (??) */ // ALL TOGETHER
    // branch selection
    public static void selezione() {
        /*Scanner in; // legge l'input da tastiera
        // crea l’oggetto che rappresenta la tastiera
        in = new Scanner(System.in);*/
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
        if (choose != 4){
            System.out.println("Il valore inserito non corrisponde ad una operazione, riprova");
            return; // AGGIUNGERE NUOVA RICHIESTA VALORE
        }
        switch(choose) {
           /* case 1: {
                System.out.println("Inserisci due numeri");
                // legge due numeri num1 e num2
                double num1 = in.nextInt();
                double num2 = in.nextInt();
                addition(num1, num2);
            }
            break;*/
            /*case 2: {
                System.out.println("Inserisci due numeri");
                // legge due numeri num1 e num2
                double num1 = in.nextInt();
                double num2 = in.nextInt();
                subtraction(num1, num2);
            }
            break;*/

           /* case 3: {
                System.out.println("Inserisci due numeri");
                // legge due numeri num1 e num2
                double num1 = in.nextInt();
                double num2 = in.nextInt();
                multiplication(num1, num2);
            }
            break;*/

            case 4:
                division();
                break;

            /*case 5: {
                System.out.println("Inserisci il numero da elevare e la sua potenza");
                // legge due numeri base ed esponente
                double base = in.nextInt();
                double exp = in.nextInt();
                power(base, exp);
            }
            break;*/
           /* case 6: {
                System.out.println("Inserisci il numero da elevare e la sua potenza");
                 legge un numero
                double num = in.nextInt();
                evenOdd(num);
            }
            break;*/
            }
        }


    /*Metodo addizione*/ //RICKY
    /*public static double addition(double num1, double num2) {} */


    /*Metodo sottrazione*/ //TINO
    /*public static double subtraction(double num1, double num2) {} */


    /*Metodo moltiplicazione*/ //MARIA
    /*public static double multiplication(double num1, double num2) {} */


    /*Metodo divisione*/ //VALERIA
    /*public static double division(double num1, double num2) {} */
        public static double division(){
            System.out.println("Inserisci due numeri");
            /* legge due numeri dividendo e divisore */
            Scanner in;
            in = new Scanner(System.in);
            double dividendo = in.nextInt();
            double divisore = in.nextInt();
            //double quoziente = 0;
            if (divisore != 0){
                double quoziente = dividendo/divisore;
                System.out.println("Il risultato della divisione è " + quoziente);
            } else if (divisore == 0) {
                System.out.println("Errore, il divisore è 0. Inserire un nuovo valore");
            }//Va modificato dopo aver settato gli input da tastiera
            return 0;
        }


    /*Metodo potenza*/ //FABIO
    /*public static double power(double num1, double num2) {} */


    /*Metodo pari o dispari*/ //TINO
    /*public static boolean evenOdd(int num)*/


    //Funzione per l'INPUT di SINGOLO VALORE INT
    public static void Scanner(){
        Scanner in; // legge l'input da tastiera
        /* crea l’oggetto che rappresenta la tastiera */
        in = new Scanner(System.in);
    }

}
