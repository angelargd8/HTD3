/*
 * Autores:
 *          Francis Aguilar #22243
 *          Gerardo Pineda #22880
 *          Rodrigo Mansilla #22661
 *          Angela García #22869
 * catedratico: Douglas Barrios
 * Auxiliares: Fernanda Esquivel
 *             Francisco Castilloo
 */
package Modelo;
// El codigo de referencia para el gnome sort del sitio https://iq.opengenus.org/gnome-sort/.
//Algoritmos y estructuras de datos CC2016
// HDT3
public class GnomeSort {
    public static void gnomeSrt(Comparable[] list) {
        int i = 1;
        int n = list.length;
        while (i < n) {
            if (i == 0 || list[i - 1].compareTo(list[i])<=0) {
                i++;
            } else {
                Comparable tp = list[i];
                list[i] = list[i - 1];
                list[--i] = tp;
            }
        }
    }

}
