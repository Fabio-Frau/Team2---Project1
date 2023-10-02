public class Power {

    /*Metodo per 2 numeri*/
    public static double power2Num(double base, double exponent) {
        return Math.pow(base, exponent);

    }

    /*Metodo per elevare un array di basi ai corrispondenti esponenti in un secondo array.
    * N.B. Le dimensioni dei due array devono essere uguali.*/
    public static double[] powerArray(double[] base, double[] exponent) {

        if (base.length != exponent.length) {
            System.out.println("L'array che contiene le basi e quello che contiene gli esponenti hanno dimensioni diverse!");
            System.out.println("Sono necessari due array della stessa lunghezza!");
            return  new double[0];
        } else {
            double [] result = new double[base.length];

            for (int i = 0; i < base.length; i++) {
                result[i] = Math.pow(base[i], exponent[i]);
            }
            return result;
        }
    }




}
