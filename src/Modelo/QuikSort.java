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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuikSort {
    /***
     * Parte la lista en 2
     * @param arreglo
     * @param izquierda
     * @param derecha
     * @return
     */
    private static Integer particion(Integer arreglo[], Integer izquierda, Integer derecha) {
        // en la primera corrida, izquierda es 0 y derecha sera lengt-1
        Integer pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    /***
     * recursion
     * @param arreglo
     * @param izquierda
     * @param derecha
     */
    public static void sort(Integer arreglo[], Integer izquierda, Integer derecha) {
        if (izquierda < derecha) {
            Integer indiceParticion = particion(arreglo, izquierda, derecha);
            sort(arreglo, izquierda, indiceParticion);
            sort(arreglo, indiceParticion + 1, derecha);
        }
    }



}


