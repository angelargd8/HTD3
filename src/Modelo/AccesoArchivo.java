package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class AccesoArchivo {
    String ruta = "Datos.txt";
    String texto;
    
    
    /** 
     * Crea un String con 5000 numeros los cuales se guardan con salto de linea
     * @return String
     */
    public String numeros(){
        Random rand = new Random();
        String num = "";
        for(int i=0;i<5000;i++){
            num+= rand.nextInt(1000)+"\n";
        }
        return num;
    }
    
    /** 
     * Crea o modifica el archivo para generar los 5000 numeros para ser utilizados posteriormente
     */
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
    
    
    /** 
     * Una funcion la cual extrae n cantidad de nuemros del archivo y lo ingresa en un arrayList
     * el cual es retornado.
     * @param cantidadNumeros Solicita la cantidad de numeros que desea extraer del archivo
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> obtenerNumeros(int cantidadNumeros){
        ArrayList<Integer> numeros = new ArrayList<>();
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
                    numeros.add(Integer.parseInt(lineas));
                }else{
                    break;
                }
                contLineas++;
            }
        } catch (Exception e) {
            throw new Error("Error al leer el archivo");
        }
        return numeros;
    }
}
