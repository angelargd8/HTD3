package Modelo;
// El codigo de referencia para el gnome sort del sitio https://iq.opengenus.org/gnome-sort/.
//Algoritmos y estructuras de datos CC2016
// HDT3
public class GnomeSort {
    private static void gnomeSrt(int[] arr) {
        int i = 1;
        int n = arr.length;
        while (i < n) {
            if (i == 0 || arr[i - 1] <= arr[i]) {
                i++;
            } else {
                int tp = arr[i];
                arr[i] = arr[i - 1];
                arr[--i] = tp;
            }
        }
    }

}
