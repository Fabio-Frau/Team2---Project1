public class Calculator {
    public static void main(String[] args) {

        /*Dati in ingresso*/
        double num1 = 3.0;
        double num2 = 1;
        division(num1,num2);
    }
    /* Metodo per selezione operazione con switch (??) */ // ALL TOGETHER



    /*Metodo addizione*/ //RICKY
    /*public static double addition(double num1, double num2) {} */


    /*Metodo sottrazione*/ //TINO
    /*public static double subtraction(double num1, double num2) {} */


    /*Metodo moltiplicazione*/ //MARIA
    /*public static double multiplication(double num1, double num2) {} */


    /*Metodo divisione*/ //VALERIA
    /*public static double division(double num1, double num2) {} */
        public static double division( double num1, double num2){
            //double quoziente = 0;
            if (num2 != 0){
                double quoziente = num1/num2;
                System.out.println(quoziente);
            } else if (num2 == 0) {
                System.out.println("Errore, il divisore è 0. Inserire un nuovo valore");
            }//Va modificato dopo aver settato gli input da tastiera
            return 0;
        }


    /*Metodo potenza*/ //FABIO
    /*public static double power(double num1, double num2) {} */


    /*Metodo pari o dispari*/ //TINO
    /*public static boolean evenOdd(int num)*/


}
