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
    long TiempoDeInicio; //la fer me dijo q teoricamente esto puede valer como profiler entonces c va
    long TiempoFinal;
  
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
        
        TiempoDeInicio = System.nanoTime();
        gnomeSort.gnomeSrt(numeros);
        TiempoFinal = System.nanoTime();
        System.out.println("GnomeSort:"+ (TiempoDeInicio-TiempoFinal)+ " nanosegundos");

        TiempoDeInicio = System.nanoTime();
        bubbleSort.sort(numeros);
        TiempoFinal = System.nanoTime();
        System.out.println("BubbleSort:"+ (TiempoDeInicio-TiempoFinal)+ " nanosegundos");

        TiempoDeInicio = System.nanoTime();
        mergeSort.MergeSortt(numeros);
        TiempoFinal = System.nanoTime();
        System.out.println("MergeSort:"+ (TiempoDeInicio-TiempoFinal)+ " nanosegundos");

        TiempoDeInicio = System.nanoTime();
        quikSort.sort(numeros, 0 , numeros.length-1);
        TiempoFinal = System.nanoTime();
        System.out.println("QuikSort:"+ (TiempoDeInicio-TiempoFinal)+ " nanosegundos");

        TiempoDeInicio = System.nanoTime();
        radixSort.sort(numeros);
        TiempoFinal = System.nanoTime();
        System.out.println("RadixSort:"+ (TiempoDeInicio-TiempoFinal)+ " nanosegundos");

        
        }

    
}
