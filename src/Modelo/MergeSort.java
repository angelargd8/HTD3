package Modelo;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort implements ISort{
    int [] Arrayxd = new int[10];

    Random rand = new Random();
    int n;
    int PunteroInicio;
    int PunteroFinal;
    int Mitad;

    int Pizquierda;
    int Pderecha;
    int Pmerge;

    //int elementoF;
    
    public MergeSort(){
        //int elementoF;
    }
    /*public int [] CrearArray(){
        for (int i = 0; i < 10; i++){
            n= new Random().nextInt(10 + 1);
            Arrayxd[i]=n;
            System.out.println(Arrayxd[i]);
        }

        System.out.println(Arrays.toString(Arrayxd));
        return Arrayxd;
        
        
    }*/
    @Override
    public Comparable[] sort(Comparable[] Arrayxd) {
        return Arrayxd;
    }

    public void MergeSortt(Integer[] Arrayxd){
        PunteroInicio=0;
        PunteroFinal=Arrayxd.length;
        Mitad=(Arrayxd.length/2);
        Arrays.sort(Arrayxd);
        if (PunteroFinal<2){
            return;
        }

        //System.out.println("posicion final: "+PunteroFinal);
        //System.out.println("mita: "+Mitad);
        int Derecho= PunteroFinal-Mitad;
        Integer[] ArrayMitad1= new Integer[Mitad];
        Integer[] ArrayMitad2= new Integer[Derecho];

        for(int i=0;i<Mitad;i++){
            ArrayMitad1[i]=(int) Arrayxd[i];
        }
        for(int i=Mitad;i<PunteroFinal;i++){
            ArrayMitad2[i-Mitad]=(int) Arrayxd[i];

        }
        //System.out.println("array primera mitad:"+Arrays.toString(ArrayMitad1));
        //System.out.println("array segunda mitad:"+Arrays.toString(ArrayMitad2));

        //remerge
        MergeSortt(ArrayMitad1);
        MergeSortt(ArrayMitad2);
        //mergear 2

        Merge(Arrayxd, ArrayMitad1, ArrayMitad2);
        System.out.println(""+Arrays.toString(Arrayxd));

    }
    private static void Merge(Integer[] Arrayxd, Integer[] arrayMitad1, Integer[] arrayMitad2 ){

        int Mitad1= arrayMitad1.length; //iz
        int Mitad2= arrayMitad2.length;  //der 

        int Pizquierda=0;
        int Pderecha=0;
        int Pmerge=0;

        while (Pizquierda<Mitad1 && Pderecha< Mitad2){
            //comparar xd
            //aqui decimos q la iz es + pequeño/ 
            if (arrayMitad1[Pizquierda]<= arrayMitad2[Pderecha]){
            
                Arrayxd[Pmerge]=arrayMitad1[Pizquierda];
                Pizquierda++; //incrementar para buscar el siguiente en la lista
            }else{
                Arrayxd[Pmerge]=arrayMitad1[Pderecha];
                Pderecha++;
            }
            Pmerge++;
        }

        while (Pizquierda<Mitad1){
            Arrayxd[Pmerge]=arrayMitad1[Pizquierda];
            Pizquierda++;
            Pmerge++;

        }

        while (Pderecha<Mitad2){
            Arrayxd[Pmerge]=arrayMitad2[Pderecha];
            Pderecha++;
            Pmerge++;
        }
        
    }
   
}

