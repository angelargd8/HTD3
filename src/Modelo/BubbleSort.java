package Modelo;

public class BubbleSort implements ISort {
    public static void sort(int[] lista){
    }

    /**
     * @param lista
     * @return lista ordenada
     */
    @Override
    public Comparable[] sort(Comparable[] lista) {
        for (int i = 0; i < lista.length - 1 ; i++) {
            for (int j = 0; j < lista.length - 1 ; j++) {
                if (((int)lista[j]) > (int)(lista[j+1])) {
                    int temp = (int) lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }

        }
        return lista;
    }
}