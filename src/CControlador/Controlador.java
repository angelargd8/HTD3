/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CControlador;
import java.util.ArrayList;

import Modelo.AccesoArchivo;
import Modelo.BubbleSort;
import Modelo.GnomeSort;
import Modelo.MergeSort;
import Modelo.QuikSort;
import Modelo.RadixSort;

public class Controlador{
    GnomeSort gnomeSort;
    BubbleSort bubbleSort;
    MergeSort mergeSort;
    QuikSort quikSort;
    RadixSort radixSort;
  
    public Controlador(){
        gnomeSort = new GnomeSort();
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        quikSort = new QuikSort();
        radixSort = new RadixSort();

    }
    public void CorrerSorts(){
        AccesoArchivo  acceso = new AccesoArchivo();
        Integer [] numeros = acceso.obtenerNumeros(5000);   

        System.out.println("GnomeSort:");
        gnomeSort.gnomeSrt(numeros);

        System.out.println("BubbleSort:");
        bubbleSort.sort(numeros);

        System.out.println("MergeSort:");
        mergeSort.MergeSortt(numeros);

        System.out.println("QuikSort:");
        //me tira error pipipi
        quikSort.sort(numeros, 0 , numeros.length-1);
        
        System.out.println("RadixSort:");
        radixSort.maximo(numeros);

        }

    
}
