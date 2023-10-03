import java.util.Scanner;
import java.util.InputMismatchException;

public class Read {


    /*Metodo che mi permette di leggere un intero*/
    public static int Int(String prompt ) {

        /*Apro lo scanner*/
        Scanner in = new Scanner(System.in);

        /*Chiedo un numero di tipo intero, finchè non ne inserisco uno il loop continuerà a chiedermelo.
        * Ho dovuto usare l'error handling perchè non ho trovato altri modi.
        * All'interno del loop il blocco try prova ad eseguire il codice, se si verificano degli errori
        * invece che far crashare il programma interviene il blocco catch.
        * Se non avessi messo in.next() all'interno del blocco catch, il loop avrebbe continuato all'infinito perchè
        * avrebbe continuato a leggere l'input inserito in precedenza perchè non consumato a causa del verificarsi
        * dell'errore(???).*/
        while (true) {

            System.out.println(prompt);
            try {
                return in.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Devi darmi un numero intero!");
                in.next();
            }

        }
    }

    /*La logica del metodo è uguale a quello precedente chiede un double al posto di un int*/
    public static double Double(String prompt ) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println(prompt);
            try {
                return in.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.println("Devi darmi un numero double!");
                in.next();
            }

        }
    }


}
