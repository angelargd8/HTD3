/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CVista;

import CControlador.Controlador;


public class MostrarMenu {
    Vista vista;
    Controlador controlador;
    int opcion=0;



    public MostrarMenu(){
        vista = new Vista();
        controlador= new Controlador();
        
    }
    public void MostrarPrograma(){
        vista.Mensaje(); 
        
        

        while (opcion!=8){
            opcion= vista.SeleccioneMenu("\nBienvenido al \n Ingrese una opción:\n1.  \n2.  \n3. \n4.  \n5. \n6. \n7. \n8. salir");
/////////////1. Encender el radio//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opcion==1){
            }
/////////////2. //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try{
                if (opcion==2){
                Controlador controlador = new Controlador();
                controlador.SortFileGnome();
                System.out.println("Has realizado el Gnome Sort");
                break;
                }
    /////////// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==3){
                    

                }
    /////////////.  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==4){
                    
                    
                }
    //////////////.  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==5){
                    
                }
    //////////////6. /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==6){
                    
                }
    ///////////// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==7){
                    

                }
            /////salir//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }catch (Exception e){
                vista.validacion();
            }
        }

  
    }

    
}
