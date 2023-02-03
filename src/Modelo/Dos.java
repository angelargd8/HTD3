import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Dos {
    //ArrayList<Integer> Arrayxd = new ArrayList<>();
    int [] Arrayxd = new int[10];
    //ArrayList<Integer> ArrayMitad1 = new ArrayList<>(); //izquierda
    //ArrayList<Integer> ArrayMitad2 = new ArrayList<>(); //derecha

    Random rand = new Random();
    int n;
    int PunteroInicio;
    int PunteroFinal;
    int Mitad;

    int Pizquierda;
    int Pderecha;
    int Pmerge;

    //int elementoF;
    
    public Dos(){
        //int elementoF;
    }
    public int [] CrearArray(){
        for (int i = 0; i < 10; i++){
            n= new Random().nextInt(10 + 1);
            //Arrayxd.add(i, n);
            Arrayxd[i]=n;
            System.out.println(Arrayxd[i]);
        }

        System.out.println(Arrays.toString(Arrayxd));
        return Arrayxd;
        
        
    }
    public void MergeSort(int [] Arrayxd){
        PunteroInicio=0;
        PunteroFinal=Arrayxd.length;
        Mitad=(Arrayxd.length/2);
        //PunteroFinal=Arrayxd.size();
        //Mitad=(Arrayxd.size()/2);
        if (PunteroFinal<2){
            return;
        }

        //System.out.println("array: "+Arrayxd);
        //System.out.println(Arrays.toString(Arrayxd));

        System.out.println("posicion final: "+PunteroFinal);
        System.out.println("mita: "+Mitad);
        int Derecho= PunteroFinal-Mitad;
        int[] ArrayMitad1= new int[Mitad];
        int[] ArrayMitad2= new int[PunteroFinal-Mitad];

        for(int i=0;i<Mitad;i++){
            ArrayMitad1[i]=Arrayxd[i];
            //ArrayMitad1.add(i, Arrayxd.get(i));
        }
        for(int i=Mitad;i<PunteroFinal;i++){
            ArrayMitad2[i-Mitad]=Arrayxd[i];

            //ArrayMitad2.add(i-Mitad, Arrayxd.get(i));
        }
        System.out.println("array primera mitad:"+Arrays.toString(ArrayMitad1));
        System.out.println("array segunda mitad:"+Arrays.toString(ArrayMitad2));

        //remerge
        MergeSort(ArrayMitad1);
        MergeSort(ArrayMitad2);
        //mergear 2

        Merge(Arrayxd, ArrayMitad1, ArrayMitad2);
        System.out.println("vector ordenado: "+Arrays.toString(Arrayxd));

    }
    private static void Merge(int [] Arrayxd, int [] ArrayMitad1, int [] ArrayMitad2 ){
        /*int Mitad1= ArrayMitad1.size(); //iz
        int Mitad2= ArrayMitad2.size();  //der*/

        int Mitad1= ArrayMitad1.length; //iz
        int Mitad2= ArrayMitad2.length;  //der 

        int Pizquierda=0;
        int Pderecha=0;
        int Pmerge=0;

        while (Pizquierda<Mitad1 && Pderecha< Mitad2){
            //comparar xd
            //aqui decimos q la iz es + pequeño/ 
            if (ArrayMitad1[Pizquierda]<= ArrayMitad2[Pderecha]){
            //if (ArrayMitad1.get(Pizquierda)<= ArrayMitad2.get(Pderecha)){
                //elementoF =Arrayxd.get(Pmerge);// = ArrayMitad1.get(Pizquierda);
                //Arrayxd.get(Pmerge) = ArrayMitad1.get(Pizquierda);
                Arrayxd[Pmerge]=ArrayMitad1[Pizquierda];
                
                //ArrayMitad1.get(Pmerge)=ArratMitad1[Pizquierda];
                //elementoF = ArrayMitad1.get(Pizquierda);
                Pizquierda++; //incrementar para buscar el siguiente en la lista
            }else{
                Arrayxd[Pmerge]=ArrayMitad1[Pderecha];
                //elementoF =Arrayxd.get(Pmerge);// = ArrayMitad1.get(Pizquierda);
                //elementoF = ArrayMitad1.get(Pderecha);
                Pderecha++;
            }
            Pmerge++;
        }

        while (Pizquierda<Mitad1){
            Arrayxd[Pmerge]=ArrayMitad1[Pizquierda];
            //elementoF = ArrayMitad1.get(Pizquierda);
            Pizquierda++;
            Pmerge++;

        }

        while (Pderecha<Mitad2){
            Arrayxd[Pmerge]=ArrayMitad2[Pderecha];

            //elementoF = ArrayMitad1.get(Pderecha);
            Pderecha++;
            Pmerge++;
        }
        
    }
   
}

