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

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class AccesoArchivo {
    String ruta = "src\\Datos.txt";
    
    String texto;
    
    public String numeros(){
        Random rand = new Random();
        String num = "";
        for(int i=0;i<5000;i++){
            num+= rand.nextInt(1000)+"\n";
        }
        return num;
    }
    
    public void generarNumeros(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(ruta);
            pw = new PrintWriter(fw);
            pw.print(numeros());
            fw.close();
        } catch (Exception e) {
            throw new Error("No se pudo relizar la accion de generar numeros");
        }
    }
    
    public Integer[] obtenerNumeros(int cantidadNumeros){
        Integer[] n = new Integer[cantidadNumeros];
        File f;
        FileReader fr;
        BufferedReader br;
        try {
            f = new File(ruta);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String lineas;
            int contLineas = 0;
            while((lineas = br.readLine()) != null){

                if(cantidadNumeros != contLineas){

                    n[contLineas] = Integer.parseInt(lineas);
                }else{

                    break;
                }
                contLineas++;

            }
        } catch (Exception e) {
            throw new Error("Error al leer el archivo");
        }
        return n;
    }
}
