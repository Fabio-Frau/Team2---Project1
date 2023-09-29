import java.util.Scanner;
public class DivisionNumber {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        double dividendo = readNumber(in);
        double divisore = readNumber(in);
        while (divisore == 0){
            System.out.println("Il divisore non può essere nullo. Inserisci un nuovo valore");
            divisore = newDivisore(in,divisore);
        }
        division(dividendo,divisore);

    }

    // Funzione lettura numero double da tastiera
    public static double readNumber(Scanner in) {
        System.out.println("Inserire i valori corrispondenti a dividendo e divisore:");
        double number = in.nextDouble();
        return (number);
    }

    // Funzione Assegna divisore diverso da 0
    public static double newDivisore(Scanner in, double divisore){
        divisore = in.nextDouble();
        return divisore;
    }

    // Funzione divisione
    public static void division(double dividendo, double divisore){
        double quoziente = dividendo/divisore;
        System.out.println("Il risultato della divisione è " + quoziente);
    }
}
