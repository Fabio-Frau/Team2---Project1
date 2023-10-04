public class SottrazioneArray {
    public static double sottrazioneArray(double[] myArray) {
        //primo elemento dell'array a cui verranno sottratti gli elementi successivi.
        double result = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            result -= myArray[i];
        }
        return result;
    }
}
