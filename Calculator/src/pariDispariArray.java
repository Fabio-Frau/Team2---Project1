public class pariDispariArray {
    public static void pariDispariArrNum(int[] ArrayNum) {
        for (int num : ArrayNum) {
            if (num % 2 == 0) {
                System.out.println(num + " è un numero pari.");
            } else {
                System.out.println(num + " è un numero dispari.");
            }
        }
    }
}
