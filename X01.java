// 12S24014 - Arion Dippos Pandapotan Manurung
// 12S24020 - Joice Anastasya Napitupulu

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, hargaterkecil, hargasementara, hargatotal;

        hargabuku = 0;
        hargasementara = 0;
        hargaterkecil = 1000;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                if (hargaterkecil < hargabuku) {
                } else {
                    hargaterkecil = hargabuku;
                }
                hargasementara = hargasementara + hargabuku;
            }
        } while (hargabuku != 0);
        if (hargasementara >= 100) {
            hargatotal = hargasementara - hargaterkecil;
        } else {
            hargatotal = hargasementara;
        }
        System.out.println(toFixed(hargatotal,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
