public class SommaArray {
    public static double sumArray (double[] numeri ){
        double somma=0;

        for (int i=0; i< numeri.length; i++){
            //somma = somma+numeri[i];
            somma+= numeri[i];

        }
        return somma;

    }


}