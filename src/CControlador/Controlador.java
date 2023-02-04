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
import Modelo.GnomeSort;

public class Controlador{
  
    public void SortFileGnome(){
        AccesoArchivo  acceso = new AccesoArchivo();
        Integer [] numeros = acceso.obtenerNumeros(5000);
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.gnomeSrt(numeros);

        }

    
}
