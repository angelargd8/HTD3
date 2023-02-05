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

public class RadixSort implements ISort {
    

    @Override
    public Comparable[] sort(Comparable[] list) {
        int max = maximo(list);
        int largo = list.length;
        for(int n = 1; (max/n) > 0; n*=10){
            countingS(list, largo, n, max);
        }
        return list;
    }
    
    public int maximo(Comparable[] list){
        int max = 0;
        for(Object numero:list){
            if(max < ((int)(numero))){
                max = (int)(numero);
            }
        }
        return max;
    }
    
    public void countingS(Comparable[] list,int largo, int numeroPornumero, int maximo){
        int[] contador = new int[maximo];
        int[] respuesta = new int[largo];
        for(int i =0;i<largo;i++){
            contador[i] = 0;
        }

        for(int i =0;i<largo;i++){
            int posicion = (((int)(list[i]))/numeroPornumero)%10;
            contador[posicion]++;
        }
        
        for(int i=1;i<maximo;i++){
            contador[i] += contador[i-1];
        }
        
        for(int i = largo-1;i>=0;i--){
            int posicion = ((((int)(list[i]))/numeroPornumero)%10);
            int cont = contador[posicion] - 1;
            respuesta[cont] = (int)list[i];
            contador[posicion]--;
        }
        
        for(int i=0;i<largo;i++){
            list[i] = respuesta[i];
        }
 
    }
}
